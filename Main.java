import models.*;
import enums.VehicleType;
import factory.ParkingLotFactory;
import interfaces.IPaymentProcessor;


public class Main {
    public static void main(String[] args) {
        // Create parking lot using factory
        ParkingLot lot = ParkingLotFactory.createMediumLot();

        // Vehicles
        Vehicle bike = new Vehicle("BIKE123", VehicleType.BIKE, false);
        Vehicle car = new Vehicle("CAR999", VehicleType.CAR, false);
        Vehicle tesla = new Vehicle("TESLA42", VehicleType.CAR, true); // EV car

        // Entry flow
        EntryGate entryGate = lot.getEntryGates().get(0);
        entryGate.allowEntry(bike);
        entryGate.allowEntry(car);
        entryGate.allowEntry(tesla);

        // Exit flow (billing + unpark)
        ExitGate exitGate = lot.getExitGates().get(0);
        BillingCounter counter = lot.getBillingCounters().get(0);

        IPaymentProcessor cash = new CashPayment();
        IPaymentProcessor card = new CardPayment();

        exitGate.processExit(bike, counter, cash);
        exitGate.processExit(tesla, counter, card);
    }
}
