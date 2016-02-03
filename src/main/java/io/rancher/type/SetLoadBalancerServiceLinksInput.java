package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class SetLoadBalancerServiceLinksInput extends AbstractType {
    
    private List<LoadBalancerServiceLink> serviceLinks;
    
    public List<LoadBalancerServiceLink> getServiceLinks() {
        return this.serviceLinks;
    }

    public void setServiceLinks(List<LoadBalancerServiceLink> serviceLinks) {
      this.serviceLinks = serviceLinks;
    }
    
}
