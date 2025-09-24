package models;
import interfaces.IPaymentProcessor;
public class CardPayment implements IPaymentProcessor {
    @Override
    public boolean pay(double amount) {
        System.out.println("Processing card payment of $" + amount);
        return true; 
    }
    
}
