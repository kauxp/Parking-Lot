package models;

import enums.VehicleType;
public class BusSlot extends Slot {
    public BusSlot(String id, int distance) { super(id, distance); }
    @Override
    public boolean canFit(Vehicle v) { return v.getType() == VehicleType.BUS; }
}