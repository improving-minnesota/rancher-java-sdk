package io.rancher.type;

import io.rancher.base.AbstractType;

public class RecreateOnQuorumStrategyConfig extends AbstractType {
    
    private Integer quorum;
    
    public Integer getQuorum() {
        return this.quorum;
    }

    public void setQuorum(Integer quorum) {
      this.quorum = quorum;
    }
    
}
