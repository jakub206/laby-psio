package exercise8;

public class Rule {
    private int port;
    private String adressIP;
    private String action;

    public Rule(int port, String adressIP, String action) {
        this.port = port;
        this.adressIP = adressIP;
        this.action = action;
    }

    public int getPort() {
        return port;
    }

    public String getAdressIP() {
        return adressIP;
    }

    public String getAction() {
        return action;
    }

    public String toString(){
        return "Rule port: "+port+", adressIP: "+adressIP+", action: "+action;
    }
}
