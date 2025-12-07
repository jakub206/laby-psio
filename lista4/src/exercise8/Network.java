package exercise8;

public class Network {
    private String subnetAddress;
    private int numOfDevices;

    public Network(String subnetAddress, int numOfDevices) {
        this.subnetAddress = subnetAddress;
        this.numOfDevices = numOfDevices;
    }

    public String toString(){
        return "Network: "+subnetAddress+", connected devices: "+numOfDevices;
    }
}
