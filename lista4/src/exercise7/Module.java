package exercise7;

public class Module {
    private String name;
    private String description;
    private String version;
    private Developer developer;

    public Module(String name, String description, String version) {
        this.name = name;
        this.description = description;
        this.version = version;
    }

    public String toString() {
        return "Module name: "+name+", description: "+description+", version: "+version;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }
}
