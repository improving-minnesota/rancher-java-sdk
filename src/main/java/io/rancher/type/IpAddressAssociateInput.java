package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class IpAddressAssociateInput extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private String ipAddressId;
    
    public String getIpAddressId() {
        return this.ipAddressId;
    }

    public void setIpAddressId(String ipAddressId) {
      this.ipAddressId = ipAddressId;
    }
    
}
