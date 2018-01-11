package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;
import java.util.List;

public class Subscribe extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private String agentId;
    
    private List<String> eventNames;
    
    public String getAgentId() {
        return this.agentId;
    }

    public void setAgentId(String agentId) {
      this.agentId = agentId;
    }
    
    public List<String> getEventNames() {
        return this.eventNames;
    }

    public void setEventNames(List<String> eventNames) {
      this.eventNames = eventNames;
    }
    
}
