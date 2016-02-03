package io.rancher.type;

import io.rancher.base.AbstractType;

public class AddRemoveLoadBalancerServiceLinkInput extends AbstractType {
    
    private LoadBalancerServiceLink serviceLink;
    
    public LoadBalancerServiceLink getServiceLink() {
        return this.serviceLink;
    }

    public void setServiceLink(LoadBalancerServiceLink serviceLink) {
      this.serviceLink = serviceLink;
    }
    
}
