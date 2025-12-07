package exercise1;

public class HardDrive {
    private String capacity;
    private String type;
    private String speed;

    public HardDrive(String capacity, String type, String speed) {
        this.capacity = capacity;
        this.type = type;
        this.speed = speed;
    }

    public String toString() {
        return "Hard drive: "+capacity+", "+type+", "+speed;
    }
}
