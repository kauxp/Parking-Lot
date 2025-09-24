package models;

import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private List<Slot> slots;
    public ParkingFloor(int floorNumber, List<Slot> slots) {
        this.floorNumber = floorNumber;
        this.slots = slots;
    }
    public List<Slot> getSlots() { return slots; }
}
