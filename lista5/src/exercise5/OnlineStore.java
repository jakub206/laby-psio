package exercise5;

public class OnlineStore {
    public static void processCodeAuthorization(PaymentMethod paymentMethod) {
        if(paymentMethod instanceof TwoFactorAuth){
            TwoFactorAuth twoFactorAuth = (TwoFactorAuth) paymentMethod;
            twoFactorAuth.codeAuthorization();
        } else {
            System.out.println("Credit Card Payment - not code authorization needed");
        }
    }

    public static void main(String[] args) {
        PaymentMethod[] paymentMethods = new PaymentMethod[3];

        paymentMethods[0] = new BlikPayment(27.31,"PLN", "345908");
        paymentMethods[1] = new CardPayment(3.24,"EUR", "354284784943919419","347");
        paymentMethods[2] = new BlikPayment(145.78,"PLN","767213");

        for(PaymentMethod paymentMethod : paymentMethods){
            processCodeAuthorization(paymentMethod);
            paymentMethod.processPayment();
            paymentMethod.getInfo();
            System.out.println();
        }
    }
}
