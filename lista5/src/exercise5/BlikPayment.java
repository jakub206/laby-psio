package exercise5;

public class BlikPayment extends PaymentMethod implements TwoFactorAuth{
    private String code;

    public BlikPayment(double amount, String currency, String code) {
        super(amount, currency);
        this.code = code;
    }

    @Override
    public void processPayment() {
        System.out.println("BLIK payment for code ("+code+") processing... Success!");
    }

    @Override
    public void codeAuthorization() {
        System.out.println("BLIK Payment Code Authorization...");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("BLIK code : " + code);
    }
}
