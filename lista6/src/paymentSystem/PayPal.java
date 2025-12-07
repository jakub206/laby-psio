package paymentSystem;

public class PayPal implements PaymentMethod {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public boolean process(double amount) {
        System.out.println("Processing PayPal payment ("+amount+")...");
        if(amount < 1) {
            System.out.println("Failure! Amount must be at least 1");
            return false;
        }
        System.out.println("Success!");
        return true;
    }
}
