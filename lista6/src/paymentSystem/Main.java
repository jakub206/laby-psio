package paymentSystem;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<PaymentMethod> paymentMethods = new ArrayList<>();

        paymentMethods.add(new Blik("29081"));
        paymentMethods.add(new CreditCard("2015476325841234"));
        paymentMethods.add(new PayPal("jakubd@gmail.com"));
        paymentMethods.add(new CryptoTransfer("DCRfW62x28x74YpXzW7R5rX65B2f6z3p4c"));

        for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.process(500);
            System.out.println();
        }
    }
}
