package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class DefaultNetwork extends AbstractType {
    
    private String accountId;
    
    private String created;
    
    private Map<String, Object> data;
    
    private String defaultPolicyAction;
    
    private String description;
    
    private List<String> dns;
    
    private List<String> dnsSearch;
    
    private Boolean hostPorts;
    
    private String kind;
    
    private Map<String, Object> metadata;
    
    private String name;
    
    private List<NetworkPolicyRule> policy;
    
    private String removeTime;
    
    private String removed;
    
    private String state;
    
    private List<Subnet> subnets;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Integer transitioningProgress;
    
    private String uuid;
    
    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
      this.accountId = accountId;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public Map<String, Object> getData() {
        return this.data;
    }

    public void setData(Map<String, Object> data) {
      this.data = data;
    }
    
    public String getDefaultPolicyAction() {
        return this.defaultPolicyAction;
    }

    public void setDefaultPolicyAction(String defaultPolicyAction) {
      this.defaultPolicyAction = defaultPolicyAction;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public List<String> getDns() {
        return this.dns;
    }

    public void setDns(List<String> dns) {
      this.dns = dns;
    }
    
    public List<String> getDnsSearch() {
        return this.dnsSearch;
    }

    public void setDnsSearch(List<String> dnsSearch) {
      this.dnsSearch = dnsSearch;
    }
    
    public Boolean getHostPorts() {
        return this.hostPorts;
    }

    public void setHostPorts(Boolean hostPorts) {
      this.hostPorts = hostPorts;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
      this.metadata = metadata;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public List<NetworkPolicyRule> getPolicy() {
        return this.policy;
    }

    public void setPolicy(List<NetworkPolicyRule> policy) {
      this.policy = policy;
    }
    
    public String getRemoveTime() {
        return this.removeTime;
    }

    public void setRemoveTime(String removeTime) {
      this.removeTime = removeTime;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public List<Subnet> getSubnets() {
        return this.subnets;
    }

    public void setSubnets(List<Subnet> subnets) {
      this.subnets = subnets;
    }
    
    public String getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(String transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public Integer getTransitioningProgress() {
        return this.transitioningProgress;
    }

    public void setTransitioningProgress(Integer transitioningProgress) {
      this.transitioningProgress = transitioningProgress;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
