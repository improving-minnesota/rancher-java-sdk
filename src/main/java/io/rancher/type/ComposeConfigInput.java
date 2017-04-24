package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;
import java.util.List;

public class ComposeConfigInput extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private List<String> serviceIds;
    
    public List<String> getServiceIds() {
        return this.serviceIds;
    }

    public void setServiceIds(List<String> serviceIds) {
      this.serviceIds = serviceIds;
    }
    
}
