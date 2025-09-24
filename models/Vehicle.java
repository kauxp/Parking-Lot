package models;
import enums.VehicleType;

public class Vehicle {
    private final String license;
    private final VehicleType type;
    private final boolean isElectric;
    private Ticket ticket;  

    public Vehicle(String license, VehicleType type, boolean isElectric) {
        this.license = license;
        this.type = type;
        this.isElectric = isElectric;
    }

    public VehicleType getType() { return type; }
    public boolean isElectric() { return isElectric; }
    public String getLicense() { return license; }

    public Ticket getTicket() { return ticket; }
    public void assignTicket(Ticket ticket) { this.ticket = ticket; }
    public void clearTicket() { this.ticket = null; }
}