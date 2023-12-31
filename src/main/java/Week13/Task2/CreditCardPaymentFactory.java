package Week13.Task2;

import Week13.Task2.Interface.Payment;
import Week13.Task2.Interface.PaymentFactory;

public class CreditCardPaymentFactory implements PaymentFactory {


    public Payment createPayment(){
        return new CreditCardPayment();
    }
}
