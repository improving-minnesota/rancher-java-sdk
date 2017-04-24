package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;
import java.util.List;

public class SetLoadBalancerServiceLinksInput extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private List<LoadBalancerServiceLink> serviceLinks;
    
    public List<LoadBalancerServiceLink> getServiceLinks() {
        return this.serviceLinks;
    }

    public void setServiceLinks(List<LoadBalancerServiceLink> serviceLinks) {
      this.serviceLinks = serviceLinks;
    }
    
}
