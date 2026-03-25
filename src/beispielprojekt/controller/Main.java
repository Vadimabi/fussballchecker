package beispielprojekt.controller;

import beispielprojekt.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        TaskController controller = new TaskController(view);

        controller.listTasks();
        controller.addTask("Testaufgabe", "Eine neue Aufgabe");
        controller.listTasks();
        controller.completeTask(1);
    }
}