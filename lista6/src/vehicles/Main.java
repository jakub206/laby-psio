package vehicles;
import java.util.*;

public class Main {
    public static List<Vehicle> filterElectric(List<Vehicle> vehicles) {
        List<Vehicle> electricVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if(vehicle instanceof Electric){
                electricVehicles.add(vehicle);
            }
        }
        return electricVehicles;
    }

    public static List<Vehicle> filterByYear(List<Vehicle> vehicles, int year) {
        List<Vehicle> resultVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if(vehicle.getYear() == year){
                resultVehicles.add(vehicle);
            }
        }
        return resultVehicles;
    }

    public static void main(String[] args) {
        System.out.println("-------------- ZAD. 1 --------------");

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("BMW", 2024, true));
        vehicles.add(new Truck("Man", 2016, 7.3));
        vehicles.add(new Motorcycle("Kawasaki", 2015, 700));
        vehicles.add(new Motorcycle("Komar", 1983, 200));
        vehicles.add(new Car("Audi", 2015, false));
        vehicles.add(new Truck("Scania", 2008,5.5));

        for (Vehicle vehicle : vehicles) {
            vehicle.printInfo();
            System.out.println("Fuel consumption: " + vehicle.getFuelConsumption());
            System.out.println();
        }

        System.out.println("-------------- ZAD. 2 --------------");

        vehicles.add(new ElectricCar("Tesla", 2025, false, 87));
        vehicles.add(new HybridCar("Skoda", 2023, false, 56, 98));

        for (Vehicle vehicle : vehicles) {
            vehicle.printInfo();
            if(vehicle instanceof Electric){
                System.out.println("Battery level: "+((Electric)vehicle).getBatteryLevel());
            }
            System.out.println("Fuel consumption: " + vehicle.getFuelConsumption());
            System.out.println();
        }

        System.out.println();
        System.out.println("-------------- ZAD. 3 --------------");

        for(Vehicle vehicle : vehicles){
            Workshop.service(vehicle);
        }

        System.out.println();
        System.out.println("-------------- ZAD. 7 --------------");

        List<Vehicle> electricVehicles = filterElectric(vehicles);
        List<Vehicle> vehicles2015 = filterByYear(vehicles, 2015);
        List<Vehicle> vehicles2025 = filterByYear(vehicles, 2025);

        System.out.println("** Electric vehicles:");
        for (Vehicle vehicle : electricVehicles) {
            vehicle.printInfo();
        }

        System.out.println("** Vehicles from 2015:");
        for (Vehicle vehicle : vehicles2015) {
            vehicle.printInfo();
        }

        System.out.println("** Vehicles from 2025:");
        for (Vehicle vehicle : vehicles2025) {
            vehicle.printInfo();
        }
    }
}
