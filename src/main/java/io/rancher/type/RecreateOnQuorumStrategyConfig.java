package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class RecreateOnQuorumStrategyConfig extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private Integer quorum;
    
    public Integer getQuorum() {
        return this.quorum;
    }

    public void setQuorum(Integer quorum) {
      this.quorum = quorum;
    }
    
}
