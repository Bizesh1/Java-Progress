package Classwork.Jul23;

// 4. Create a payment system without modifying existing code when adding new payment mwthod
//     Initial: payment -> Credit card
//     Add: Paypal and UPI

class Payment {
    public void pay() {
        System.out.println("Payment made.");
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using Credit Card.");
    }
}

class PaypalPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using Paypal.");
    }
}

class UPIPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using UPI.");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        creditCardPayment.pay();

        Payment paypalPayment = new PaypalPayment();
        paypalPayment.pay();

        Payment upiPayment = new UPIPayment();
        upiPayment.pay();
    }
}
