package exercise3;

public class Device {
    private String name;
    private String type;
    private Employee assignedTo;

    public Device(String name, String type) {
        this.name = name;
        this.type = type;
        this.assignedTo = null;
    }

    public Employee getEmployee(){
        return assignedTo;
    }

    public void setEmployee(Employee employee){
        this.assignedTo = employee;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return type+", name: "+name;
    }
}