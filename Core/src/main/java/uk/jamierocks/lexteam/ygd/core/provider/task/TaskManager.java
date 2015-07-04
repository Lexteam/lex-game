package uk.jamierocks.lexteam.ygd.core.provider.task;

import uk.jamierocks.lexteam.ygd.core.task.Task;
import uk.jamierocks.lexteam.ygd.core.task.TaskOwner;

/**
 * Defines a task manager.
 *
 * A task manager handles adding tasks, removing tasks and running tasks.
 *
 * @author Jamie Mansfield
 */
public interface TaskManager {

    /**
     * Adds a {@link Task} to the queue
     *
     * @param task
     *         the {@link Task} to be added
     *
     * @return {@code true} if successfully added; {@code false} if not
     */
    boolean addTask(Task task);

    /**
     * Removes a {@link Task} from the queue<br>
     *
     * @param task
     *         the {@link Task} to be removed
     *
     * @return {@code true} if removed; {@code false} if not found or unable to be removed
     */
    boolean removeTask(Task task);

    /**
     * Removes all the tasks for a specified {@link TaskOwner}
     *
     * @param owner
     *         the {@link TaskOwner} to remove tasks for
     */
    void removeTasks(TaskOwner owner);

    /**
     * Internal method called to run the tasks or decrease timers.
     */
    void runTasks();
}