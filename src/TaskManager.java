import java.util.*;

public class TaskManager{
    private ArrayList<Task> tasks;

    public TaskManager(){
        tasks = new ArrayList<>();
    }
    public void addTask(String description){
        tasks.add(new Task(tasks.size()+1,description));
    }
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Keine Aufgaben in der Liste.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("ID: " + tasks.get(i).getId() + ", Beschreibung: " +  tasks.get(i).getDescription() + ", Status: " + tasks.get(i).isCompleted());
            }
        }
    }

    public void markTaskAsDone(int id) {
        if (id > 0 && id <= tasks.size()) {
            tasks.get(id-1).setCompleted(true);
            System.out.println("Task: " + tasks.get(id-1).getDescription() + " als erledigt markiert.");
        } else {
            System.out.println("Ungültiger ID.");
        }
    }
    public void displayCompletedTasks() {
        boolean found = false;
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).isCompleted()) {
                System.out.println("Task: " + tasks.get(i).getDescription() + " ist erledigt.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Keine erledigten Aufgaben in der Liste.");
        }
    }
}
