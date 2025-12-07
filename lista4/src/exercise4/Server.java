package exercise4;

public class Server {
    private String serverId;
    private String model;

    public Server(String serverId, String model) {
        this.serverId = serverId;
        this.model = model;
    }
    public String toString() {
        return "ID: " + serverId + ", model: " + model;
    }
}
