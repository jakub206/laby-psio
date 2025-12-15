package ex6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static ArrayList<Item> inventory = new ArrayList<>();
    static Queue<Order> orders = new LinkedList<>();

    public static void printInventory(){
        for(Item item : inventory){
            System.out.println(item);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Item i1 = new Item("Laptop Dell Inspiron", 5);
        Item i2 = new Item("Samsung S23", 7);
        Item i3 = new Item("Etui Iphone 17", 12);
        Item i4 = new Item("Iphone 17 Pro", 1);
        Item i5 = new Item("Samsung Watch 4", 3);

        inventory.add(i1);
        inventory.add(i2);
        inventory.add(i3);
        inventory.add(i4);
        inventory.add(i5);

        printInventory();

        orders.add(new Order(i2.getItemId(),2));
        orders.add(new Order(i1.getItemId(),1));
        orders.add(new Order(i4.getItemId(),4));
        orders.add(new Order(i3.getItemId(),5));

        int control = 0;
        while (control != 2 && !orders.isEmpty()) {
            Order currentOrder = orders.poll();

            Item item = null;

            for(Item i : inventory){
                if(i.getItemId() == currentOrder.getItemId()){
                    item = i;
                    break;
                }
            }

            if (item != null) {
                if (item.getQuantity() >= currentOrder.getAmount()) {
                    item.setQuantity(item.getQuantity() - currentOrder.getAmount());
                    System.out.println("Order for " + item.getName() + " is completed!");
                    control = 0;
                } else {
                    System.out.println("Not enough stock!");
                    control++;
                    orders.add(currentOrder);
                }
            } else {
                System.out.println("Item not found!");
            }
        }
    }
}