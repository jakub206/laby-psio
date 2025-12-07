package ex7;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static ArrayList<Transaction> history = new ArrayList<>();
    static HashMap<String, ArrayList<Transaction>> groupedByUser = new HashMap<>();

    public static void printHistory(){
        System.out.println("All transactions:");
        for(Transaction t: history){
            System.out.println("* "+t);
        }
        System.out.println();
    }

    public static void findHisghestTransaction(String currency){
        double max = -1;
        for(Transaction t: history){
            if(t.getCurrency().equals(currency)){
                if(t.getAmount() > max){
                    max = t.getAmount();
                }
            }
        }

        if(max == -1){
            System.out.println("Something went wrong!");
        } else {
            System.out.println("The highest transaction in "+currency+" is "+max);
        }
    }

    public static void main(String[] args) {
        long now = System.currentTimeMillis();

        history.add(new Transaction("Jakub", 27.80, "EUR", now-7547864));
        history.add(new Transaction("Jakub", 200.98, "EUR", now));
        history.add(new Transaction("Jakub", 2007.00, "PLN", now-34000));
        history.add(new Transaction("Bartek", 20.98, "USD", now));
        history.add(new Transaction("Bartek", 1000000, "PLN", now-213721372));
        history.add(new Transaction("Wojtek", 2.34, "PLN", now-34563));

        printHistory();

        for(Transaction t: history){
            if(groupedByUser.containsKey(t.getUser())){
                groupedByUser.get(t.getUser()).add(t);
            } else {
                ArrayList<Transaction> list = new ArrayList<>();
                list.add(t);
                groupedByUser.put(t.getUser(), list);
            }
        }

        int max = 0;
        String maxUser = "";
        for (HashMap.Entry<String, ArrayList<Transaction>> entry : groupedByUser.entrySet()) {
            String user = entry.getKey();
            ArrayList<Transaction> userTransactions = entry.getValue();
            int count = userTransactions.size();
            double saldo = 0;
            for(Transaction t: userTransactions){
                saldo += t.getAmount();
            }

            if (max < userTransactions.size()){
                max = userTransactions.size();
                maxUser = user;
            }

            System.out.println(user+": "+saldo);
        }
        System.out.println("Max: "+maxUser+" has "+max+" transactions");
        System.out.println();

        findHisghestTransaction("EUR");
        System.out.println();

        history.sort((p1,p2) -> Double.compare(p1.getTimestamp(), p2.getTimestamp()));
        printHistory();
    }
}