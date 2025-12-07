package exercise8;
import java.util.List;
import java.util.ArrayList;

public class Firewall {
    private List<Rule> rules;
    private Network connectedNetwork;

    public Firewall(Network connectedNetwork) {
        this.connectedNetwork = connectedNetwork;
        this.rules = new ArrayList<>();
    }

    public void addRule(int port, String adressIP, String action){
        Rule rule = new Rule(port, adressIP, action);
        this.rules.add(rule);
    }

    public void showRules(){
        System.out.println();
        System.out.println("Firewall ("+connectedNetwork+") Rules: ");
        if (rules.isEmpty()){
            System.out.println("No rules found");
        } else {
            for (Rule rule : rules) {
                System.out.println("* " + rule);
            }
        }
    }

    public void filterConnection(String adressIP, int port){
        for  (Rule rule : rules) {
            if (rule.getAdressIP().equals(adressIP) && rule.getPort() == port) {
                if(rule.getAction().equals("allow")){
                    System.out.println("[CONNECTION ALLOWED] Rule found");
                    return;
                } else if (rule.getAction().equals("deny")){
                    System.out.println("[CONNECTION DENIED] Rule found");
                    return;
                }
            }
        }
        System.out.println("Rule not found");
    }

    public static void main(String[] args) {
        Firewall f1 = new Firewall(new Network("1.0.1.1", 9000));

        f1.addRule(2929, "192.168.1.1", "allow");
        f1.addRule(1111, "192.168.2.2", "deny");
        f1.addRule(2222, "192.168.3.3", "allow");

        f1.showRules();

        f1.filterConnection("192.168.1.1", 9000);
        f1.filterConnection("192.168.2.2", 1111);
        f1.filterConnection("192.168.3.3", 2222);
    }
}
