public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Aufgaben hinzufügen
        taskManager.addTask("Alex macht TaskManager");
        taskManager.addTask("Zakaria macht Task klasse");
        taskManager.addTask("Jason macht die kommentare und das Klassen Diagramm");

        // Aufgaben anzeigen
        System.out.println("Alle Aufgaben:");
        taskManager.displayTasks();

        // Aufgabe als erledigt markieren
        taskManager.markTaskAsDone(1);
        taskManager.markTaskAsDone(2);
        taskManager.markTaskAsDone(3);


        // Erledigte Aufgaben anzeigen
        System.out.println("Erledigte Aufgaben:");
        taskManager.displayCompletedTasks();
        
        
    }}