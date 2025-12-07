package exercise3;

public class Employee {
    private String name;
    private String surname;
    private String role;

    public Employee(String name, String surname, String role){
        this.name = name;
        this.surname = surname;
        this.role = role;
    }

    public String toString(){
        return name+" "+surname+" ("+role+")";
    }
}
