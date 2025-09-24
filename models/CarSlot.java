package models;

import enums.VehicleType;

class CarSlot extends Slot {
    public CarSlot(String id, int distance) { super(id, distance); }
    @Override
    public boolean canFit(Vehicle v) { return v.getType() == VehicleType.CAR; }
}