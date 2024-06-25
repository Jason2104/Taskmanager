import java.util.ArrayList;
import java.util.List;

/**
 * Manages a list of tasks, allowing tasks to be added, removed, and retrieved.
 */
public class TaskManager {
    private List<Task> tasks;

    /**
     * Constructs a new TaskManager with an empty task list.
     */
    public TaskManager() {
        tasks = new ArrayList<>();
    }

    /**
     * Adds a task to the task list.
     *
     * @param task The task to be added.
     */
    public void addTask(Task task) {
        tasks.add(task);
    }

    /**
     * Removes a task from the task list.
     *
     * @param task The task to be removed.
     * @return True if the task was removed, false otherwise.
     */
    public boolean removeTask(Task task) {
        return tasks.remove(task);
    }

    /**
     * Returns the list of tasks.
     *
     * @return The list of tasks.
     */
    public List<Task> getTasks() {
        return tasks;
    }
}
