package zoo;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Elephant(2));
        animals.add(new Monkey(true));
        animals.add(new Lion(30));

        for (Animal animal : animals) {
            animal.printInfo();
            animal.makeSound();
            System.out.println();
        }
    }
}
