package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class LbTargetConfig extends AbstractType {
    
    private List<TargetPortRule> portRules;
    
    public List<TargetPortRule> getPortRules() {
        return this.portRules;
    }

    public void setPortRules(List<TargetPortRule> portRules) {
      this.portRules = portRules;
    }
    
}
