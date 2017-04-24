package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class ServiceLink extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private String name;
    
    private String serviceId;
    
    private String uuid;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(String serviceId) {
      this.serviceId = serviceId;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
