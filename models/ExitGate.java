package models;

import interfaces.IPaymentProcessor;
import interfaces.IPricingStrategy;

public class ExitGate {
    private final String id;

    public ExitGate(String id) { this.id = id; }

    public void releaseVehicle(Vehicle vehicle, BillingCounter counter, IPricingStrategy pricing, IPaymentProcessor payment) {
        counter.processPayment(vehicle, pricing, payment);
    }
}