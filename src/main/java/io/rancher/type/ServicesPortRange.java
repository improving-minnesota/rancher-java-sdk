package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class ServicesPortRange extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private Integer endPort;
    
    private Integer startPort;
    
    public Integer getEndPort() {
        return this.endPort;
    }

    public void setEndPort(Integer endPort) {
      this.endPort = endPort;
    }
    
    public Integer getStartPort() {
        return this.startPort;
    }

    public void setStartPort(Integer startPort) {
      this.startPort = startPort;
    }
    
}
