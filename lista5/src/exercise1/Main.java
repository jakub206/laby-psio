package exercise1;

public class Main {
    public static void main(String[] args) {
        Device[] devices = new Device[4];

        devices[0] = new Laptop("Dell", "Inspiron", 2024, "6h");
        devices[1] = new Mobile("Samsung", "Galaxy S23", 2023, 6.1);
        devices[2] = new Mobile("Apple", "Iphone 17", 2025, 6.3);
        devices[3] = new Laptop("Apple", "MacBook Air 15.3", 2025, "10h");

        for(Device device : devices) {
            device.getInfo();
            System.out.println();
        }
    }
}
