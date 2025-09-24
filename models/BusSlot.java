package models;

import enums.VehicleType;
class BusSlot extends Slot {
    public BusSlot(String id, int distance) { super(id, distance); }
    @Override
    public boolean canFit(Vehicle v) { return v.getType() == VehicleType.BUS; }
}