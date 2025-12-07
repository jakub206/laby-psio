package exercise2;

public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    public double calculateBonus(double salary) {
        return salary * 0.2;
    }
}
