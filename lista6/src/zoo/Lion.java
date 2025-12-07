package zoo;

public class Lion extends Animal {
    private int maneSize;

    public Lion(int maneSize){
        this.maneSize = maneSize;
    }

    @Override
    public void makeSound(){
        System.out.println("RARRRRRR");
    }

    @Override
    public void printInfo(){
        System.out.println("Type: Lion");
        System.out.println("ManeSize: " + maneSize);
    }
}
