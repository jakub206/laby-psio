package exercise2;

public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public double calculateBonus(double salary) {
        return salary * 0.5;
    }
}
