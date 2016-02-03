package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class SetServiceLinksInput extends AbstractType {
    
    private List<ServiceLink> serviceLinks;
    
    public List<ServiceLink> getServiceLinks() {
        return this.serviceLinks;
    }

    public void setServiceLinks(List<ServiceLink> serviceLinks) {
      this.serviceLinks = serviceLinks;
    }
    
}
