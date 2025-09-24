package decorators;
import interfaces.IPricingStrategy;
class EVChargingPricing extends PricingDecorator {
    public EVChargingPricing(IPricingStrategy base) { super(base); }
    @Override public double calculatePrice(long hours) {
        return base.calculatePrice(hours) + (hours * 5); 
    }
}