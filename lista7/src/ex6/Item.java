package ex6;

import java.util.UUID;

public class Item {
    private UUID itemId;
    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.itemId = UUID.randomUUID();
        this.name = name;
        this.quantity = quantity;
    }

    public String toString(){
        return itemId+ ", " + name + ", " + quantity;
    }

    public UUID getItemId() {
        return itemId;
    }

    public void setItemId(UUID itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}