package uk.jamierocks.lexteam.ygd.core.task;

import uk.jamierocks.lexteam.ygd.core.YGDGame;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Based on CanaryLib's ServerTaskManager
 *
 * @author Jamie Mansfield
 */
public final class GameTaskManager {
    private final ConcurrentHashMap<GameTask, TaskOwner> tasks = new ConcurrentHashMap<>();

    /**
     * Adds a {@link GameTask} to the queue
     *
     * @param task
     *         the {@link GameTask} to be added
     *
     * @return {@code true} if successfully added; {@code false} if not
     */
    public boolean addTask(GameTask task) {
        synchronized (tasks) {
            tasks.put(task, task.getOwner());
            return true;
        }
    }

    /**
     * Removes a {@link GameTask} from the queue<br>
     *
     * @param task
     *         the {@link GameTask} to be removed
     *
     * @return {@code true} if removed; {@code false} if not found or unable to be removed
     */
    public boolean removeTask(GameTask task) {
        synchronized (tasks) {
            return tasks.remove(task) != null;
        }
    }

    /**
     * Removes all the tasks for a specified {@link TaskOwner}
     *
     * @param owner
     *         the {@link TaskOwner} to remove tasks for
     */
    public void removeTasks(TaskOwner owner) {
        synchronized (tasks) {
            Iterator<Map.Entry<GameTask, TaskOwner>> taskIter = tasks.entrySet().iterator();
            while (taskIter.hasNext()) {
                if (taskIter.next().getValue().equals(owner)) {
                    taskIter.remove();
                }
            }
        }
    }

    /**
     * Internal method called to run the tasks or decrease timers.
     */
    public void runTasks() {
        if (tasks.isEmpty()) {
            // No tasks? no execution needed
            return;
        }
        synchronized (tasks) {
            Iterator<Map.Entry<GameTask, TaskOwner>> taskIter = tasks.entrySet().iterator();
            while (taskIter.hasNext()) {
                GameTask task = taskIter.next().getKey();
                task.decrementDelay();
                if (task.shouldExecute()) {
                    try {
                        task.run();
                    }
                    catch (Throwable thrown) {
                        YGDGame.getGame().getLogger().error(
                                "An Exception occurred while executing ServerTask: "
                                        + task.getClass().getSimpleName(), thrown);
                        taskIter.remove();
                        continue;
                    }
                    if (!task.isContinuous()) {
                        taskIter.remove();
                    }
                    else {
                        task.reset();
                    }
                }
            }
        }
    }
}