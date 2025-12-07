package ex6;

import java.util.UUID;

public class Order {
    private UUID orderId;
    private UUID itemId;
    private int amount;

    public Order(UUID itemId, int amount){
        this.itemId = itemId;
        this.amount = amount;
    }

    public String toString(){
        return orderId+", "+itemId+ ", " + amount;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public UUID getItemId() {
        return itemId;
    }

    public void setItemId(UUID itemId) {
        this.itemId = itemId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}