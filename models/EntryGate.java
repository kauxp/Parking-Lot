package models;

public class EntryGate {
    private final String id;
    private final ParkingLot lot;

    public EntryGate(String id, ParkingLot lot) {
        this.id = id;
        this.lot = lot;
    }

    public Ticket admitVehicle(Vehicle vehicle) {
        lot.parkVehicle(vehicle);
        return vehicle.getTicket();
    }

    public void allowEntry(Vehicle bike) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'allowEntry'");
    }
}
 