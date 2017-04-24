package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class InstanceStop extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private Boolean remove;
    
    private Integer timeout;
    
    public Boolean getRemove() {
        return this.remove;
    }

    public void setRemove(Boolean remove) {
      this.remove = remove;
    }
    
    public Integer getTimeout() {
        return this.timeout;
    }

    public void setTimeout(Integer timeout) {
      this.timeout = timeout;
    }
    
}
