package beispielprojekt.view;

import beispielprojekt.model.Task;
import java.util.List;

public class ConsoleView {
    public void displayTasks(List<Task> tasks) {
        System.out.println("Aufgaben:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}