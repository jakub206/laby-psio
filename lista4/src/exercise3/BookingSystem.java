package exercise3;
import java.util.List;
import java.util.ArrayList;

public class BookingSystem {
    private List<Employee> employees;
    private List<Device> devices;

    public BookingSystem(){
        employees = new ArrayList<>();
        devices = new ArrayList<>();
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }

    public void addDevice(Device d){
        devices.add(d);
    }

    public void bookDevice(Employee e, Device d) {
        if (!devices.contains(d)){
            System.out.println("Device not found");
        } else if (!employees.contains(e)){
            System.out.println("Employee not found");
        } else {
            if (d.getEmployee() == null){
                d.setEmployee(e);
                System.out.println(d.getName()+" has been booked");
            } else {
                System.out.println(d.getName()+" is belong to "+d.getEmployee());
            }
        }
    }

    public void releaseDevice(Device d){
        if (d.getEmployee() == null){
            System.out.println("Device is free");
        } else {
            System.out.println(d.getName()+" has been released");
            d.setEmployee(null);
        }
    }

    public void showActiveBookings(){
        System.out.println();
        System.out.println("Active Bookings:");
        if (devices.isEmpty()){
            System.out.println("No devices found");
        } else {
            for (Device d : devices) {
                if (d.getEmployee() != null) {
                    System.out.println("* " + d.getName() + " - " + d.getEmployee());
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BookingSystem bs = new BookingSystem();

        bs.showActiveBookings();

        Employee e1 = new Employee("Jakub","Dłużak","Backend Developer");
        Employee e2 = new Employee("Oliwier","Kądziołka","Frontend Developer");
        Employee e3 = new Employee("Karol","Stolarczyk","Project Manager");

        Device d1 = new Device("Dell Inspiron","notebook");
        Device d2 = new Device("Samsung S23","smartphone");
        Device d3 = new Device("Iphone 15","smartphone");

        bs.addDevice(d1);
        bs.addDevice(d2);
        bs.addDevice(d3);

        bs.addEmployee(e1);
        bs.addEmployee(e2);
        bs.addEmployee(e3);

        bs.bookDevice(e1,d1);
        bs.bookDevice(e2,d3);
        bs.bookDevice(e3,d2);

        bs.showActiveBookings();
        bs.releaseDevice(d2);
        bs.showActiveBookings();
    }
}
