package paymentSystem;

public class CryptoTransfer implements PaymentMethod {
    private String walletAddress;

    public CryptoTransfer(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public boolean process(double amount) {
        System.out.println("Processing transfer crypto (" + amount + ")...");
        System.out.println("Success!");
        return true;
    }
}
