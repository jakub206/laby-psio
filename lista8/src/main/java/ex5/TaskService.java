package ex5;

import ex5.TaskRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class TaskService {
    private final TaskRepository repository;
    private final ArrayList<Task> tasks;
    private int id = 1;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
        this.tasks = repository.getTasks();
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found");
        } else {
            System.out.println("-------Tasks list------");
            tasks.forEach(System.out::println);
            System.out.println("-----------------------");
        }
    }

    public void addTask(String title, String description, LocalDate dueDate) {
        Task task = new Task(id, title, description, dueDate);
        id++;
        tasks.add(task);
        System.out.println("New task ("+task.getTitle()+") added");
    }

    public boolean setTaskAsDone(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setDone(true);
                System.out.println("Task ("+task.getTitle()+") marked as done");
                return true;
            }
        }

        System.out.println("Task not found");
        return false;
    }

    public void exit() {
        repository.saveTasks();
        System.out.println("Tasks saved");
        System.exit(0);
    }

}
