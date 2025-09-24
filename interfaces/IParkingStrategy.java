package interfaces;

import models.Slot;
import models.Vehicle;
import java.util.List;

public interface IParkingStrategy {
    Slot findParkingSlot(Vehicle vehicle, List<Slot> slots);
}
