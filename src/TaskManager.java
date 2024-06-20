import java.util.*; // Importiert die gesamte Java-Utilitätsbibliothek

public class TaskManager { // Definiert eine öffentliche Klasse namens TaskManager
    private ArrayList<Task> tasks; // Deklariert eine private ArrayList, die Task-Objekte speichert

    // Konstruktor für TaskManager, initialisiert die tasks-Liste
    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // Methode zum Hinzufügen einer neuen Aufgabe mit einer Beschreibung
    public void addTask(String description) {
        tasks.add(new Task(tasks.size() + 1, description)); // Erstellt eine neue Task und fügt sie der Liste hinzu
    }

    // Methode zum Anzeigen aller Aufgaben
    public void displayTasks() {
        if (tasks.isEmpty()) { // Überprüft, ob die tasks-Liste leer ist
            System.out.println("Keine Aufgaben in der Liste.");
        } else {
            for (int i = 0; i < tasks.size(); i++) { // Iteriert über alle Aufgaben und gibt deren Details aus
                System.out.println("ID: " + tasks.get(i).getId() + ", Beschreibung: " + tasks.get(i).getDescription() + ", Status: " + tasks.get(i).isCompleted());
            }
        }
    }

    // Methode zum Markieren einer Aufgabe als erledigt basierend auf ihrer ID
    public void markTaskAsDone(int id) {
        if (id > 0 && id <= tasks.size()) { // Überprüft, ob die ID gültig ist
            tasks.get(id - 1).setCompleted(true); // Markiert die Aufgabe als erledigt
            System.out.println("Task: " + tasks.get(id - 1).getDescription() + " als erledigt markiert.");
        } else {
            System.out.println("Ungültiger ID."); // Meldung bei ungültiger ID
        }
    }

    // Methode zum Anzeigen aller erledigten Aufgaben
    public void displayCompletedTasks() {
        boolean found = false; // Flag zum Überprüfen, ob erledigte Aufgaben gefunden wurden
        for (int i = 0; i < tasks.size(); i++) { // Iteriert über alle Aufgaben
            if (tasks.get(i).isCompleted()) { // Überprüft, ob die Aufgabe erledigt ist
                System.out.println("Task: " + tasks.get(i).getDescription() + " ist erledigt.");
                found = true; // Setzt das Flag, wenn eine erledigte Aufgabe gefunden wird
            }
        }
        if (!found) { // Wenn keine erledigten Aufgaben gefunden wurden
            System.out.println("Keine erledigten Aufgaben in der Liste.");
        }
    }
}
