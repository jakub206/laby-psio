package exercise4;

public class NetworkSwitch {
    private String model;
    private int numPort;

    public NetworkSwitch(String model, int numPort) {
        this.model = model;
        this.numPort = numPort;
    }

    public String toString() {
        return "Model: "+model+", number of ports: "+numPort;
    }
}
