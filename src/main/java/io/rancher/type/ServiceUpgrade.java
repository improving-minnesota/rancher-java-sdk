package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class ServiceUpgrade extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
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
