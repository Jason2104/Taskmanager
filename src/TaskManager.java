import java.util.ArrayList;
import java.util.List;

/**
 * Verwalter einer Liste von Aufgaben, ermöglicht das Hinzufügen, Entfernen und Abrufen von Aufgaben.
 */
public class TaskManager {
    private List<Task> tasks;

    /**
     * Konstruiert einen neuen TaskManager mit einer leeren Aufgabenliste.
     */
    public TaskManager() {
        tasks = new ArrayList<>();
    }

    /**
     * Fügt eine Aufgabe zur Aufgabenliste hinzu.
     *
     * @param task Die hinzuzufügende Aufgabe.
     */
    public void addTask(Task task) {
        tasks.add(task);
    }

    /**
     * Entfernt eine Aufgabe aus der Aufgabenliste.
     *
     * @param task Die zu entfernende Aufgabe.
     * @return True, wenn die Aufgabe entfernt wurde, sonst False.
     */
    public boolean removeTask(Task task) {
        return tasks.remove(task);
    }

    /**
     * Gibt die Liste der Aufgaben zurück.
     *
     * @return Die Liste der Aufgaben.
     */
    public List<Task> getTasks() {
        return tasks;
    }
}
