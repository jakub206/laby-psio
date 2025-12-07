package vehicles;

public class HybridCar extends Car {
    private int batteryLevel;
    private int fuelLevel;

    public HybridCar(String brand, int year, boolean sportCar, int batteryLevel, int fuelLevel) {
        super(brand, year, sportCar);
        this.batteryLevel = batteryLevel;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public double getFuelConsumption() {
        return fuelLevel*3/100 - batteryLevel/100;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
