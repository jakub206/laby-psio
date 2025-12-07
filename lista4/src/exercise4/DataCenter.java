package exercise4;
import java.util.List;
import java.util.ArrayList;

public class DataCenter {
    private String location;
    private List<Server> servers;
    private List<NetworkSwitch> networkSwitches;

    public DataCenter(String location) {
        this.location = location;
        this.servers = new ArrayList<>();
        this.networkSwitches = new ArrayList<>();
    }

    public void addServer(String serverId, String model) {
        Server newServer = new Server(serverId, model);
        servers.add(newServer);
    }

    public void addNetworkSwitch(String model, int numPort) {
        NetworkSwitch newNetworkSwitch = new NetworkSwitch(model, numPort);
        networkSwitches.add(newNetworkSwitch);
    }

    public void showInfrastructure() {
        System.out.println();
        System.out.println("Infrastructure of DataCenter in "+location+":");
        System.out.println("Servers ("+servers.size()+"):");
        if (servers.isEmpty()) {
            System.out.println("No servers found");
        } else {
            for (Server server : servers) {
                System.out.println("* "+server);
            }
        }
        System.out.println("Network Switches ("+networkSwitches.size()+"):");
        if (networkSwitches.isEmpty()) {
            System.out.println("No network switches found");
        } else {
            for (NetworkSwitch networkSwitch : networkSwitches) {
                System.out.println("* "+networkSwitch);
            }
        }
    }

    public static void main(String[] args) {
        DataCenter dataCenter = new DataCenter("center1");

        dataCenter.showInfrastructure();

        dataCenter.addServer("server1", "model1");
        dataCenter.addServer("server2", "model2");
        dataCenter.addServer("server3", "model3");
        dataCenter.addNetworkSwitch("networkSwitch1", 4);
        dataCenter.addNetworkSwitch("networkSwitch2", 12);

        dataCenter.showInfrastructure();
    }
}
