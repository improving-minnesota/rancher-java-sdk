package io.rancher.type;

import io.rancher.base.AbstractType;

public class NetworkPolicyRuleBetween extends AbstractType {
    
    private String groupBy;
    
    private String selector;
    
    public String getGroupBy() {
        return this.groupBy;
    }

    public void setGroupBy(String groupBy) {
      this.groupBy = groupBy;
    }
    
    public String getSelector() {
        return this.selector;
    }

    public void setSelector(String selector) {
      this.selector = selector;
    }
    
}
