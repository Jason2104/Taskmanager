public class Task {
    private int id;
    private String description;
    private boolean completed;

    // Konstruktor
    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.completed = false;
    }

    // Getter und Setter Methoden
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    // Methode zum Anzeigen der Aufgabe
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", completed=" + completed +
                '}';
    }
}
