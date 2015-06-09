package uk.jamierocks.lexteam.ygd.core.util.provider.task;

import uk.jamierocks.lexteam.ygd.core.YGDGame;
import uk.jamierocks.lexteam.ygd.core.provider.task.TaskManager;
import uk.jamierocks.lexteam.ygd.core.task.Task;
import uk.jamierocks.lexteam.ygd.core.task.TaskOwner;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Based on CanaryLib's ServerTaskManager
 *
 * @author Jamie Mansfield
 */
public class DefaultTaskManager implements TaskManager {

    private final ConcurrentHashMap<Task, TaskOwner> tasks = new ConcurrentHashMap<>();

    public boolean addTask(Task task) {
        synchronized (tasks) {
            tasks.put(task, task.getOwner());
            return true;
        }
    }

    public boolean removeTask(Task task) {
        synchronized (tasks) {
            return tasks.remove(task) != null;
        }
    }

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