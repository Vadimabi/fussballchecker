package beispielprojekt.controller;

import beispielprojekt.model.Task;
import beispielprojekt.model.Database;
import beispielprojekt.view.ConsoleView;
import java.util.List;

public class TaskController {
    private Database db = new Database();
    private ConsoleView view;

    public TaskController(ConsoleView view) {
        this.view = view;
        db.createTable();
        // Lade Aufgaben aus DB
        // Für Demo, füge Beispiel hinzu wenn leer
        if (db.loadTasks().isEmpty()) {
            Task task1 = new Task(1, "Projekt starten", "Klone das Repo");
            Task task2 = new Task(2, "Code schreiben", "Implementiere Features");
            db.saveTask(task1);
            db.saveTask(task2);
        }
    }

    public void addTask(String title, String description) {
        List<Task> tasks = db.loadTasks();
        int id = tasks.size() + 1;
        Task task = new Task(id, title, description);
        db.saveTask(task);
        view.displayMessage("Aufgabe hinzugefügt: " + title);
    }

    public void listTasks() {
        List<Task> tasks = db.loadTasks();
        view.displayTasks(tasks);
    }

    public void completeTask(int id) {
        List<Task> tasks = db.loadTasks();
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
                db.saveTask(task);
                view.displayMessage("Aufgabe abgeschlossen: " + task.getTitle());
                return;
            }
        }
        view.displayMessage("Aufgabe nicht gefunden.");
    }
}