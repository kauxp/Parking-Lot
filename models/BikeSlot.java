package models;

import enums.VehicleType;

public class BikeSlot extends Slot {
    public BikeSlot(String id, int distance) { super(id, distance); }
    @Override
    public boolean canFit(Vehicle v) { return v.getType() == VehicleType.BIKE; }
}
