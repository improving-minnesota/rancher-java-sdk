package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class SetLoadBalancerServiceLinksInput extends AbstractType {
    
    private List<Object> serviceLinks;
    
    public List<Object> getServiceLinks() {
        return this.serviceLinks;
    }

    public void setServiceLinks(List<Object> serviceLinks) {
      this.serviceLinks = serviceLinks;
    }
    
}
