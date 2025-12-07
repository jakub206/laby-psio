package exercise5;

public class Project {
    private String name;
    private String technology;
    private String deadline;

    public Project(String name, String technology, String deadline) {
        this.name = name;
        this.technology = technology;
        this.deadline = deadline;
    }

    public String toString() {
        return "Name: "+name+", technology: "+technology+", deadline: "+deadline;
    }
}
