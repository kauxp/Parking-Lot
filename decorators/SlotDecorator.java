package decorators;

import models.Slot;
import models.Vehicle;

abstract class SlotDecorator extends Slot {
    protected Slot slot;

    public SlotDecorator(Slot slot) {
        super(slot.getId(), slot.getDistance());
        this.slot = slot;
    }

    @Override
    public void park(Vehicle v) {
        slot.park(v);
    }

    @Override
    public void vacate() {
        slot.vacate();
    }

    @Override
    public boolean isOccupied() {
        return slot.isOccupied();
    }
}
