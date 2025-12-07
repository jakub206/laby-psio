package exercise1;

import java.util.List;
import java.util.ArrayList;

public class Server {
    private String adressIP;
    private String ram;
    private int numCPU;
    private List<HardDrive> hardDrives;

    public Server(String adressIP, String ram, int numCPU) {
        this.adressIP = adressIP;
        this.ram = ram;
        this.numCPU = numCPU;
        this.hardDrives = new ArrayList<>();
    }

    public void addHardDrive(String capacity, String type, String speed) {
        HardDrive drive = new HardDrive(capacity, type, speed);
        this.hardDrives.add(drive);
        System.out.println("New drive added");
    }

    public void showHardwareInfo() {
        System.out.println("Server Info");
        System.out.println("Adress IP: " + this.adressIP);
        System.out.println("RAM: " + this.ram);
        System.out.println("Number of CPU: " + this.numCPU);
        System.out.println("Hard Drives:");
        if  (this.hardDrives.isEmpty()) {
            System.out.println("No Hard Drives");
        } else {
            for (HardDrive drive : this.hardDrives) {
                System.out.println("* "+drive.toString());
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Server s1 = new Server("127.0.0.1", "128GB", 16);
        Server s2 = new Server("127.0.1.2", "512GB", 64);
        Server s3 = new Server("127.0.2.2", "64GB", 5);

        s1.addHardDrive("2TB","HDD", "7000 RPM");
        s1.addHardDrive("512GB", "SSD", "3000 RPM");

        s2.addHardDrive("5TB","HDD", "8200 RPM");
        s2.addHardDrive("256GB", "SSD", "2000 RPM");
        s2.addHardDrive("512GB", "HDD", "4500 RPM");
        s2.addHardDrive("1TB", "SSD", "6600 RPM");

        s3.addHardDrive("256GB","HDD", "7000 RPM");

        System.out.println();
        s1.showHardwareInfo();
        s2.showHardwareInfo();
        s3.showHardwareInfo();
    }
}
