package exercise2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Developer("Wojtek", 4000);
        employees[1] = new Manager("Jakub", 25000);
        employees[2] = new Developer("Bartek", 10000);

        for(Employee emp : employees) {
            emp.getInfo();
            System.out.println("Bonus roczny: "+emp.calculateBonus(emp.getSalary()));
            System.out.println();
        }
    }
}
