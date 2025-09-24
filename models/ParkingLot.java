package models;

import java.util.ArrayList;
import java.util.List;
import interfaces.IParkingStrategy;

public class ParkingLot {
    private final List<Slot> slots = new ArrayList<>();
    private final List<EntryGate> entryGates = new ArrayList<>();
    private final List<ExitGate> exitGates = new ArrayList<>();
    private final List<BillingCounter> billingCounters = new ArrayList<>();
    private IParkingStrategy parkingStrategy;

    public void addSlot(Slot slot) { slots.add(slot); }

    public void addEntryGate(EntryGate gate) { entryGates.add(gate); }
    public void addExitGate(ExitGate gate) { exitGates.add(gate); }
    public void addBillingCounter(BillingCounter counter) { billingCounters.add(counter); }

    public Slot findSlot(Vehicle v) {
        Slot slot = parkingStrategy.findParkingSlot(v, slots);
        return slot;
    }

    public void parkVehicle(Vehicle v) {
        Slot slot = findSlot(v);
        slot.park(v);
        Ticket ticket = new Ticket(v, slot);
        v.assignTicket(ticket);
    }

    public Object getEntryGates() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEntryGates'");
    }

    public Object getExitGates() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getExitGates'");
    }

    public Object getBillingCounters() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBillingCounters'");
    }
    
}

