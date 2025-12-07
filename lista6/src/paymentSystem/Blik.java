package paymentSystem;

public class Blik implements PaymentMethod {
    private String code;

    public Blik(String code) {
        this.code = code;
    }

    @Override
    public boolean process(double amount) {
        System.out.println("Processing BLIK payment ("+amount+")...");
        if(code.length()<6){
            System.out.println("Failure! Invalid code");
            return false;
        }
        System.out.println("Success!");
        return true;
    }
}
