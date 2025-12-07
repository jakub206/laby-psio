package ex3;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>();

        queue.add(new Customer("Jakub",5));
        queue.add(new Customer("Wojtek",3));
        queue.add(new Customer("Bartek",6));
        queue.add(new Customer("Jan",4));
        queue.add(new Customer("Wiktoria",7));

        int totalWaiting = 0;
        int totalService = 0;
        int totalCustomers = 0;

        while(!queue.isEmpty()){
            Customer c = queue.poll();
            System.out.println("* "+c.getName()+ " is served. Predicted time of service: "+c.getServiceTime());

            totalService+=c.getServiceTime();
            totalWaiting+=c.getWaitingTime();
            totalCustomers++;

            for(Customer c1 : queue){
                int temp = c1.getWaitingTime();
                c1.setWaitingTime(temp+c.getServiceTime());
                System.out.println(c1);
            }
        }
        System.out.println();

        System.out.println("Total amount of customers: "+totalCustomers);
        System.out.println("Average waiting time: "+totalWaiting/totalCustomers);
        System.out.println("Average service time: "+totalService/totalCustomers);
    }
}