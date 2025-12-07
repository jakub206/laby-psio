package paymentSystem;

public class CreditCard implements PaymentMethod {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean process(double amount) {
        System.out.println("Processing card payment ("+amount+")...");
        System.out.println("Success!");
        return true;
    }
}
