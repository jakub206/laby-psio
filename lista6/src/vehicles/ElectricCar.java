package vehicles;

public class ElectricCar extends Car implements Electric {
    private int batteryLevel;

    public ElectricCar(String brand, int year, boolean sportCar, int batteryLevel) {
        super(brand, year, sportCar);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public double getFuelConsumption() {
        return 0;
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
