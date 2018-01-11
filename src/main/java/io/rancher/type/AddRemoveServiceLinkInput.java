package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class AddRemoveServiceLinkInput extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private ServiceLink serviceLink;
    
    public ServiceLink getServiceLink() {
        return this.serviceLink;
    }

    public void setServiceLink(ServiceLink serviceLink) {
      this.serviceLink = serviceLink;
    }
    
}
