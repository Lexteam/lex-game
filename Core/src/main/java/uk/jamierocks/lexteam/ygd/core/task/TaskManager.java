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
public final class TaskManager {
    private final ConcurrentHashMap<Task, TaskOwner> tasks = new ConcurrentHashMap<>();

    /**
     * Adds a {@link Task} to the queue
     *
     * @param task
     *         the {@link Task} to be added
     *
     * @return {@code true} if successfully added; {@code false} if not
     */
    public boolean addTask(Task task) {
        synchronized (tasks) {
            tasks.put(task, task.getOwner());
            return true;
        }
    }

    /**
     * Removes a {@link Task} from the queue<br>
     *
     * @param task
     *         the {@link Task} to be removed
     *
     * @return {@code true} if removed; {@code false} if not found or unable to be removed
     */
    public boolean removeTask(Task task) {
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
            Iterator<Map.Entry<Task, TaskOwner>> taskIter = tasks.entrySet().iterator();
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
            Iterator<Map.Entry<Task, TaskOwner>> taskIter = tasks.entrySet().iterator();
            while (taskIter.hasNext()) {
                Task task = taskIter.next().getKey();
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