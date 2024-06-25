/**
 * The main class that demonstrates the usage of the TaskManager and Task classes.
 */
public class main {

    /**
     * The entry point of the application.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");

        manager.addTask(task1);
        manager.addTask(task2);

        task1.setCompleted(true);

        for (Task task : manager.getTasks()) {
            System.out.println(task.getName() + ": " + (task.isCompleted() ? "Completed" : "Not Completed"));
        }
    }
}
