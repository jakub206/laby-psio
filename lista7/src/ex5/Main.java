package ex5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static ArrayList<Passager> passagers = new ArrayList<>();

    public static void printPassagers() {
        for (Passager p : passagers) {
            System.out.println("* "+p);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        passagers.add(new RegularPassager("Marcin", true));
        passagers.add(new RegularPassager("Natalia", false));
        passagers.add(new RegularPassager("Szymon", false));
        passagers.add(new RegularPassager("Joanna", true));
        passagers.add(new VipPassager("Jakub", "VIP1234"));
        passagers.add(new VipPassager("Wojtek", "VIP9876"));
        passagers.add(new VipPassager("Bartek", "VIP3721"));
        passagers.add(new VipPassager("Wiktoria", "VIP5436"));

        System.out.println("All passagers:");
        printPassagers();

        int los = 0;
        for(Passager passager : passagers){
            if(passager instanceof VipPassager){
                passager.setCheckedIn(true);
            } else if(los%2==1){
                passager.setCheckedIn(true);
            }
            los++;
        }

        passagers.removeIf(p -> !p.isCheckedIn());

        System.out.println("After check-in: ");
        printPassagers();

        int hasExtraLuggage = 0;
        int vipNum = 0;
        for(Passager passager : passagers){
            if(passager instanceof VipPassager){
                vipNum++;
            } else {
                if(((RegularPassager) passager).getHasExtraLuggage()){
                    hasExtraLuggage++;
                }
            }
        }
        System.out.println("Number of VIPs: " + vipNum);
        System.out.println("Extra Luggages: " + hasExtraLuggage);
        System.out.println();

        LinkedList<Passager> passagerQueue = new LinkedList<>();

        for(Passager passager : passagers){
            if(passager instanceof VipPassager){
                passagerQueue.addFirst(passager);
            }  else {
                passagerQueue.addLast(passager);
            }
        }

        System.out.println("Boarding queue:");
        for(Passager passager : passagerQueue){
            System.out.println("* "+passager);
        }
    }
}