package io.rancher.type;

import io.rancher.base.AbstractType;

public class ServiceUpgrade extends AbstractType {
    
    private InServiceUpgradeStrategy inServiceStrategy;
    
    private ToServiceUpgradeStrategy toServiceStrategy;
    
    public InServiceUpgradeStrategy getInServiceStrategy() {
        return this.inServiceStrategy;
    }

    public void setInServiceStrategy(InServiceUpgradeStrategy inServiceStrategy) {
      this.inServiceStrategy = inServiceStrategy;
    }
    
    public ToServiceUpgradeStrategy getToServiceStrategy() {
        return this.toServiceStrategy;
    }

    public void setToServiceStrategy(ToServiceUpgradeStrategy toServiceStrategy) {
      this.toServiceStrategy = toServiceStrategy;
    }
    
}
