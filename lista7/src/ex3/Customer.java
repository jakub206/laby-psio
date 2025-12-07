package ex3;

public class Customer {
    private String name;
    private int serviceTime;
    private int waitingTime;

    public Customer(String name, int serviceTime) {
        this.name = name;
        this.serviceTime = serviceTime;
        this.waitingTime = 0;
    }

    public String toString(){
        return name+", "+serviceTime+", "+waitingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(int serviceTime) {
        this.serviceTime = serviceTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }
}