package models;

import java.time.LocalDateTime;

import interfaces.IPricingStrategy;

import java.time.Duration;

public class Ticket {
    private final Vehicle vehicle;
    private final Slot slot;
    private final LocalDateTime entryTime;

    public Ticket(Vehicle vehicle, Slot slot) {
        this.vehicle = vehicle;
        this.slot = slot;
        this.entryTime = LocalDateTime.now();
    }

    public double calculateFee(IPricingStrategy pricing) {
        long hours = 1;
        return pricing.calculatePrice(hours);
    }

    public Slot getSlot() { return slot; }
}
