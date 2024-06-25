/**
 * Stellt eine Aufgabe mit einem Namen und einem Erledigungsstatus dar.
 */
public class Task {
    private String name;
    private boolean isCompleted;

    /**
     * Konstruiert eine neue Aufgabe mit dem angegebenen Namen.
     *
     * @param name Der Name der Aufgabe.
     */
    public Task(String name) {
        this.name = name;
        this.isCompleted = false;
    }

    /**
     * Gibt den Namen der Aufgabe zurück.
     *
     * @return Der Name der Aufgabe.
     */
    public String getName() {
        return name;
    }

    /**
     * Setzt den Namen der Aufgabe.
     *
     * @param name Der neue Name der Aufgabe.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gibt zurück, ob die Aufgabe erledigt ist.
     *
     * @return True, wenn die Aufgabe erledigt ist, sonst False.
     */
    public boolean isCompleted() {
        return isCompleted;
    }

    /**
     * Markiert die Aufgabe als erledigt oder nicht erledigt.
     *
     * @param isCompleted True, um die Aufgabe als erledigt zu markieren, sonst False.
     */
    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
}
