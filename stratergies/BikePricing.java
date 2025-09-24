package stratergies;

import interfaces.IPricingStrategy;

public class BikePricing implements IPricingStrategy {
    @Override
    public double calculatePrice(long hours) {
        return hours * 10;
    }
}
