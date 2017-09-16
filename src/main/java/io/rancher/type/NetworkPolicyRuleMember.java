package io.rancher.type;

import io.rancher.base.AbstractType;

public class NetworkPolicyRuleMember extends AbstractType {
    
    private String selector;
    
    public String getSelector() {
        return this.selector;
    }

    public void setSelector(String selector) {
      this.selector = selector;
    }
    
}
