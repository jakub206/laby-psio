package zoo;

public class Monkey extends Animal {
    private  boolean likeBananas;

    public Monkey(boolean likeBananas){
        this.likeBananas = likeBananas;
    }

    @Override
    public void makeSound(){
        System.out.println("UUAA UUAA");
    }

    @Override
    public void printInfo(){
        System.out.println("Type: Monkey");
        System.out.println("Like Bananas: " + likeBananas);
    }
}
