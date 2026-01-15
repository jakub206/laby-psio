package ToDoApp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TaskService {
    private ObservableList<Task> tasks;
    private TaskRepository taskRepository = new TaskRepository();

    public TaskService() {
        this.tasks = FXCollections.observableArrayList(taskRepository.loadTasks());
    }

    public ObservableList<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
        saveState();
    }

    public void removeTask(Task task) {
        tasks.remove(task);
        saveState();
    }

    public void updateTaskStatus(Task task) {
        task.setDone(!task.isDone());
        saveState();
    }

    private void saveState() {
        taskRepository.saveTasks(tasks);
    }
}

