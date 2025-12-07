package exercise7;

public class Developer {
    private String name;
    private String role;
    private String asignedProject;

    public Developer(String name, String role, String asignedProject) {
        this.name = name;
        this.role = role;
        this.asignedProject = asignedProject;
    }

    public String toString() {
        return "Developer name: "+name+", role: "+role+", asigned project: "+asignedProject;
    }
}
