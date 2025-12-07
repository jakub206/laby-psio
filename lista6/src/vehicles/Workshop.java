package vehicles;

public class Workshop {
    public static void service(Vehicle v){
        if (v instanceof ElectricCar) {
            System.out.println("Battery control");
        } else if (v instanceof Car) {
            System.out.println("Oil exchange");
        } else if (v instanceof Motorcycle) {
            System.out.println("Chain lubrication");
        } else if (v instanceof Truck) {
            System.out.println("Brakes control");
        }
    }
}
