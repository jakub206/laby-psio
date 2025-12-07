package vehicles;

public class Motorcycle extends Vehicle{
    private int engineCapacity;

    public Motorcycle(String brand, int year,  int engineCapacity){
        super(brand, year);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public double getFuelConsumption() {
        return engineCapacity*3.4/100;
    }

    @Override
    public void printInfo(){
        System.out.println("Type: Motorcycle");
        super.printInfo();
        System.out.println("Engine Capacity: " + engineCapacity);
        System.out.println();
    }
}
