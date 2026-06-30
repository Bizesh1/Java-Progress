
interface Payment {
    void pay (double amount);
}

//credit card payment class
class CreditCardPayment implements Payment {

    @Override
    public void pay (double amount) {
        System.out.println("Payment of Rs. " + amount + " made using Credit Card.");
    }
}

// UPI payment class

class UPI implements Payment {

    @Override
    public void pay (double amount){
        System.out.println("Payment of Rs. " + amount + " made using UPI.");
    }
}

public class PaymentDemo {

    public static void main (String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new UPI();

        payment1.pay(5000);
        payment2.pay(1500);
    }
}