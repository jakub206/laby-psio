package exercise5;

public class Developer {
    private String name;
    private String specialization;
    private String level;

    public Developer(String name, String specialization, String level) {
        this.name = name;
        this.specialization = specialization;
        this.level = level;
    }

    public String toString() {
        return "Name: "+name+", specialization: "+specialization+", level: "+level;
    }
}
