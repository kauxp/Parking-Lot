package stratergies;

import interfaces.IParkingStrategy;
import models.Vehicle;
import models.Slot;

import java.util.List;

public class NearestParkingStrategy implements IParkingStrategy {

    @Override
    public Slot findParkingSlot(Vehicle vehicle, List<Slot> availableSlots) {
        Slot nearest = null;
        int minDistance = Integer.MAX_VALUE;
        for (Slot slot : availableSlots) {
            if (!slot.isOccupied() && slot.canFit(vehicle) && slot.getDistance() < minDistance) {
                nearest = slot;
                minDistance = slot.getDistance();
            }
        }
        return nearest;
        
    }
    
}
