package ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Product {
    private final String name;
    private double price;
    private final String category;
    private boolean discounted;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.discounted = false;
    }

    public String toString() {
        return name+", "+String.format("%.2f",price)+", "+category+", discounted: "+discounted;
    }

    public void setDiscounted(boolean discounted) {
        this.discounted = discounted;
    }

    public String getName() {
        return name;
    }

    public void getPrice() {
        this.price = price;
    }

    public static void filtrCheaper(ArrayList<Product> products, String category, double num) {
        System.out.println("Products from "+category+" cheaper than "+num+":");
        for(Product p : products) {
            if(p.category.equals(category) && p.price < num) {
                System.out.println("* "+p);
            }
        }
        System.out.println();
    }

    public static void printInventory(ArrayList<Product> products) {
        for(Product p : products){
            System.out.println("* "+p);
        }
        System.out.println();
    }

    public static void main(String[] args){
        ArrayList<Product> inventory = new ArrayList<>();
        Random rand = new Random();

        inventory.add(new Product("Natural Yogurt", rand.nextDouble(5,101), "dairy"));
        inventory.add(new Product("Bread", rand.nextDouble(5,101), "bakery"));
        inventory.add(new Product("Butter", rand.nextDouble(5,101), "dairy"));
        inventory.add(new Product("Milk", rand.nextDouble(5,101), "dairy"));
        inventory.add(new Product("Water", rand.nextDouble(5,101), "drinks"));
        inventory.add(new Product("Cola", rand.nextDouble(5,101), "drinks"));
        inventory.add(new Product("Candies", rand.nextDouble(5,101), "sweets"));
        inventory.add(new Product("Apple", rand.nextDouble(5,101), "fruits"));
        inventory.add(new Product("Biscuits", rand.nextDouble(5,101), "sweets"));
        inventory.add(new Product("Watermelon", rand.nextDouble(5,101), "fruits"));

        System.out.println("All products:");
        printInventory(inventory);

        filtrCheaper(inventory, "dairy", 50);

        for(Product p : inventory){
            if(p.price > 60){
                p.setDiscounted(true);
                System.out.println(p);
            }
        }
        System.out.println();

        inventory.removeIf(p -> p.name.equals("Bread"));
        System.out.println("All products after removes:");
        printInventory(inventory);

        inventory.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("All products after sorting by price ASC:");
        printInventory(inventory);

        inventory.sort((p1, p2) -> Double.compare(p2.price, p1.price));
        System.out.println("All products after sorting by price DESC:");
        printInventory(inventory);

        inventory.sort(Comparator.comparing(p -> p.name));
        System.out.println("All products after sorting by name:");
        printInventory(inventory);
    }

}