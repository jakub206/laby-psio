package vehicles;
import java.util.Random;

public class Car extends Vehicle{
    private boolean sportCar;

    Random rand = new Random();

    public Car(String brand, int year, boolean sportCar) {
        super(brand,year);
        this.sportCar = sportCar;
    }

    @Override
    public double getFuelConsumption(){
        if (sportCar){
            return 3*rand.nextDouble(4,7);
        } else{
            return rand.nextDouble(5,8);
        }
    }

    @Override
    public void printInfo(){
        System.out.println("Type: Car");
        super.printInfo();
        System.out.println("Sport Car: " + sportCar);
        System.out.println();
    }
}
