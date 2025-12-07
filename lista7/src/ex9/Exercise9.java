package ex9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise9 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Random rand = new Random();
        for(int i=0; i<17; i++){
            numbers.add(rand.nextInt(1,101));
        }

        System.out.println("* All numbers: *");
        numbers.stream().forEach(System.out::println);
        System.out.println();

        System.out.println("* Even numbers: *");
        numbers.stream().filter(n -> n%2==0).forEach(System.out::println);
        System.out.println();

        System.out.println("* How much numbers greater than 50: *");
        System.out.println(numbers.stream().filter(n -> n>50).count());
        System.out.println();

        System.out.println("* Average of all numbers: *");
        System.out.println(numbers.stream().mapToDouble(n -> n).average().getAsDouble());
        System.out.println();

        System.out.println("* Max of all numbers: *");
        System.out.println(numbers.stream().mapToInt(n -> n).max().getAsInt());
        System.out.println();

        System.out.println("* List of numbers*2: *");
        List<Integer> numbersTime2 = numbers.stream().map(n -> n*2).toList();
        numbersTime2.stream().forEach(System.out::println);
    }
}