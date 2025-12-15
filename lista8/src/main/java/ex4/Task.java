package ex4;

import java.time.LocalDate;

public class Task {
    private String title;
    private String description;
    private boolean isDone;
    private LocalDate dueDate;

    public Task() {}

    public Task(String title, String description, boolean isDone, LocalDate dueDate) {
        this.title = title;
        this.description = description;
        this.isDone = isDone;
        this.dueDate = dueDate;
    }

    public String toString() {
        return title+", "+description+", "+isDone+", "+dueDate;
    }
}
