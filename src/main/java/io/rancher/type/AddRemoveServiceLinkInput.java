package io.rancher.type;

import io.rancher.base.AbstractType;

public class AddRemoveServiceLinkInput extends AbstractType {
    
    private ServiceLink serviceLink;
    
    public ServiceLink getServiceLink() {
        return this.serviceLink;
    }

    public void setServiceLink(ServiceLink serviceLink) {
      this.serviceLink = serviceLink;
    }
    
}
