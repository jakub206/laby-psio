package exercise2;

abstract public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus(double salary);

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public double getSalary() {
        return salary;
    }
}
