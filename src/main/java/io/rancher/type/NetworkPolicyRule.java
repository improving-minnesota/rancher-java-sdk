package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class NetworkPolicyRule extends AbstractType {
    
    private String action;
    
    private NetworkPolicyRuleBetween between;
    
    private NetworkPolicyRuleMember from;
    
    private List<String> ports;
    
    private NetworkPolicyRuleMember to;
    
    private String within;
    
    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
      this.action = action;
    }
    
    public NetworkPolicyRuleBetween getBetween() {
        return this.between;
    }

    public void setBetween(NetworkPolicyRuleBetween between) {
      this.between = between;
    }
    
    public NetworkPolicyRuleMember getFrom() {
        return this.from;
    }

    public void setFrom(NetworkPolicyRuleMember from) {
      this.from = from;
    }
    
    public List<String> getPorts() {
        return this.ports;
    }

    public void setPorts(List<String> ports) {
      this.ports = ports;
    }
    
    public NetworkPolicyRuleMember getTo() {
        return this.to;
    }

    public void setTo(NetworkPolicyRuleMember to) {
      this.to = to;
    }
    
    public String getWithin() {
        return this.within;
    }

    public void setWithin(String within) {
      this.within = within;
    }
    
}
