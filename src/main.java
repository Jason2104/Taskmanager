public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Aufgaben hinzufügen
        taskManager.addTask("Aufgabe 1");
        taskManager.addTask("Aufgabe 2");

        // Aufgaben anzeigen
        System.out.println("Alle Aufgaben:");
        taskManager.displayTasks();

        // Aufgabe als erledigt markieren
        taskManager.markTaskAsCompleted(1);

        // Erledigte Aufgaben anzeigen
        System.out.println("Erledigte Aufgaben:");
        taskManager.displayCompletedTasks();
    }
}
