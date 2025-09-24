package factory;
import models.*;
import decorators.EVChargingSlot;

public class ParkingLotFactory {

    public static ParkingLot createMediumLot() {
        ParkingLot lot = new ParkingLot();

        // Add slots with id + distance
        lot.addSlot(new BikeSlot("B1", 1));
        lot.addSlot(new BikeSlot("B2", 2));
        lot.addSlot(new CarSlot("C1", 3));
        lot.addSlot(new EVChargingSlot(new CarSlot("C2", 4))); // EV car slot
        lot.addSlot(new BusSlot("Bus1", 5));

        // Add gates
        EntryGate entry1 = new EntryGate("E1", lot);
        EntryGate entry2 = new EntryGate("E2", lot);
        ExitGate exit1 = new ExitGate("X1");
        ExitGate exit2 = new ExitGate("X2");

        lot.addEntryGate(entry1);
        lot.addEntryGate(entry2);
        lot.addExitGate(exit1);
        lot.addExitGate(exit2);

        // Add billing counters
        BillingCounter counter1 = new BillingCounter("B1");
        BillingCounter counter2 = new BillingCounter("B2");

        lot.addBillingCounter(counter1);
        lot.addBillingCounter(counter2);

        return lot;
    }
}
