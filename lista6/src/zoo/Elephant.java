package zoo;

public class Elephant extends Animal {
    private int trunkSize;

    public Elephant(int trunkSize){
        this.trunkSize = trunkSize;
    }

    @Override
    public void makeSound(){
        System.out.println("TRRRAAAA-UUUUMMMPF");
    }

    @Override
    public void printInfo(){
        System.out.println("Type: Elephant");
        System.out.println("Trunk Size: " + trunkSize);
    }
}
