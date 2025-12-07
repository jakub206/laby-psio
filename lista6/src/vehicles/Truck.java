package vehicles;

public class Truck extends Vehicle {
    private double tirePressure;

    public Truck(String brand, int year, double tirePressure) {
        super(brand, year);
        this.tirePressure = tirePressure;
    }

    @Override
    public double getFuelConsumption(){
        return tirePressure*19/10;
    }

    @Override
    public void printInfo(){
        System.out.println("Type: Truck");
        super.printInfo();
        System.out.println("Tire Pressure: " + tirePressure);
        System.out.println();
    }
}
