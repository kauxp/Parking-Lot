package models;

import interfaces.IPaymentProcessor;
import interfaces.IPricingStrategy;

public class BillingCounter {
    private final String id;

    public BillingCounter(String id) { this.id = id; }

    public void processPayment(Vehicle vehicle, IPricingStrategy pricing, IPaymentProcessor payment) {
        Ticket ticket = vehicle.getTicket();
        double amount = ticket.calculateFee(pricing);
        payment.pay(amount);
        ticket.getSlot().vacate();
        vehicle.clearTicket();
    }
}
 