package stratergies;

import interfaces.IPricingStrategy;

public class BusPricing implements IPricingStrategy {
    @Override
    public double calculatePrice(long hours) {
        return hours * 30;
    }
}
