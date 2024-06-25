/**
 * Die Hauptklasse, die die Verwendung der Klassen TaskManager und Task demonstriert.
 */
public class main {

    /**
     * Der Einstiegspunkt der Anwendung.
     *
     * @param args Die Befehlszeilenargumente.
     */
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task task1 = new Task("Aufgabe 1");
        Task task2 = new Task("Aufgabe 2");

        manager.addTask(task1);
        manager.addTask(task2);

        task1.setCompleted(true);

        for (Task task : manager.getTasks()) {
            System.out.println(task.getName() + ": " + (task.isCompleted() ? "Erledigt" : "Nicht erledigt"));
        }
    }
}
