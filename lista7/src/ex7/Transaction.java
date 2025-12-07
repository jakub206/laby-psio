package ex7;

public class Transaction {
    private String user;
    private double amount;
    private String currency;
    private long timestamp;

    public Transaction(String user, double amount, String currency, long timestamp) {
        this.user = user;
        this.amount = amount;
        this.currency = currency;
        this.timestamp = timestamp;
    }

    public String toString() {
        return "User: " + user + ", Amount: " + amount + ", Currency: " + currency + ", Timestamp: " + timestamp;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}