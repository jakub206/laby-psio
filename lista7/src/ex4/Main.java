package ex4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    static ArrayList<Ticket> tickets = new ArrayList<>();
    static Queue<Ticket> highPriorityQueue = new LinkedList<>();
    static Queue<Ticket> normalQueue = new LinkedList<>();

    public static void handleNextTicket(){
        if(!highPriorityQueue.isEmpty()){
            Ticket ticket = highPriorityQueue.poll();
            ticket.setResolved(true);
            System.out.println(ticket);
        }  else if(!normalQueue.isEmpty()){
            Ticket ticket = normalQueue.poll();
            ticket.setResolved(true);
            System.out.println(ticket);
        } else {
            System.out.println("No ticket found");
        }
    }

    public static void findUserTickets(String user){
        System.out.println(user+"'s tickets: ");
        for(Ticket ticket : tickets){
            if(ticket.getUser().equals(user)){
                System.out.println("* "+ticket);
            }
        }
    }

    public static void printTickets(){
        if(!tickets.isEmpty()) {
            for (Ticket t : tickets) {
                System.out.println(t);
            }
            System.out.println();
        } else {
            System.out.println("No tickets found");
        }
    }

    public static void removeResolvedTickets(){
        tickets.removeIf(Ticket::isResolved);
    }

    public static void main(String[] args) {
        Random rand = new Random();

        for(int i=1; i<11; i++){
            int priority = rand.nextInt(1,11);
            String user = "User"+i;
            String title = "Title"+i;

            Ticket t = new Ticket(i,title,user,priority);

            tickets.add(t);

            if(priority>=9){
                highPriorityQueue.add(t);
            } else {
                normalQueue.add(t);
            }
        }

        printTickets();

        findUserTickets("User7");
        System.out.println();

        for(int i=0; i<tickets.size(); i++){
            handleNextTicket();
        }

        removeResolvedTickets();
        System.out.println();

        printTickets();
    }
}