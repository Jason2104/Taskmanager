/**
 * Represents a task with a name and completion status.
 */
public class Task {
    private String name;
    private boolean isCompleted;

    /**
     * Constructs a new Task with the specified name.
     *
     * @param name The name of the task.
     */
    public Task(String name) {
        this.name = name;
        this.isCompleted = false;
    }

    /**
     * Returns the name of the task.
     *
     * @return The name of the task.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the task.
     *
     * @param name The new name of the task.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns whether the task is completed.
     *
     * @return True if the task is completed, false otherwise.
     */
    public boolean isCompleted() {
        return isCompleted;
    }

    /**
     * Marks the task as completed or not completed.
     *
     * @param isCompleted True to mark the task as completed, false to mark it as not completed.
     */
    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
}
