package Week13.Task2;

import Week13.Task2.Interface.Payment;

public class CreditCardPayment implements Payment {

    public void processPayment(){
        System.out.println("Processing credit card payment");
    }
}
