package exercise1;

public class Mobile extends Device {
    private double screenSize;

    public Mobile(String brand, String model, int year, double screenSize) {
        super(brand, model, year);
        this.screenSize = screenSize;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Screen Size: " + this.screenSize);
    }
}
