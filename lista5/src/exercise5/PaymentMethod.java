package exercise5;

abstract public class PaymentMethod {
    protected double amount;
    protected String currency;

    public PaymentMethod(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    abstract public void processPayment();

    public void getInfo(){
        System.out.println("----- Payment Info -----");
        System.out.println("Amount : " + amount);
        System.out.println("Currency : " + currency);
    }
}
