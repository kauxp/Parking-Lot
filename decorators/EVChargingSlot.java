package decorators;

import models.Vehicle;
import models.Slot;

public class EVChargingSlot extends SlotDecorator {
    public EVChargingSlot(Slot slot) { 
        super(slot); 
    }

    @Override
    public void park(Vehicle v) {
        if (!v.isElectric()) {
            throw new IllegalArgumentException("Only electric vehicles allowed in charging slot.");
        }
        System.out.println("⚡ Charging started for " + v.getLicense());
        super.park(v);
    }

    @Override
    public boolean canFit(Vehicle v) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'canFit'");
    }
}
