package paymentSystem;

public interface PaymentMethod {
    boolean process(double amount);
}
