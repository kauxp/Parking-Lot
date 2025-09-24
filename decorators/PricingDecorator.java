package decorators;
import interfaces.IPricingStrategy;

abstract class PricingDecorator implements IPricingStrategy {
    protected final IPricingStrategy base;
    
    protected PricingDecorator(IPricingStrategy base) { 
        this.base = base; 
    }
}