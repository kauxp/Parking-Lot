package models;
import interfaces.IPaymentProcessor;
public class CashPayment implements IPaymentProcessor {
    @Override
    public boolean pay(double amount) {
        System.out.println("Processing card payment of $" + amount);
        return true; 
    }
    
}