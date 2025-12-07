package vehicles;

abstract public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    abstract public double getFuelConsumption();

    public void printInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Year: "+year);
    }

    public int getYear(){
        return year;
    }
}
