package exercise1;

public class Laptop extends Device {
    private String batteryLife;

    public Laptop(String brand, String model, int year, String batteryLife) {
        super(brand, model, year);
        this.batteryLife = batteryLife;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Battery Life: " + this.batteryLife);
    }
}
