package exercise5;

public class CardPayment extends PaymentMethod{
    private String cardNumber;
    private String cvv;

    public CardPayment(double amount, String currency,String cardNumber, String cvv){
        super(amount,currency);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void processPayment() {
        System.out.println("Credit Card payment processing... Success!");
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Card Number : " + cardNumber);
        System.out.println("CVV : " + cvv);
    }
}
