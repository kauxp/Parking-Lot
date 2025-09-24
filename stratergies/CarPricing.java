package stratergies;

import interfaces.IPricingStrategy;

class CarPricing implements IPricingStrategy {
    @Override public double calculatePrice(long hours) {
        return hours * 20; 
    }
}