package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class Host extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    
    public String getAccountLink() {
        return this.links.get("account");
    }
    
    public String getAgentLink() {
        return this.links.get("agent");
    }
    
    public String getHostsLink() {
        return this.links.get("hosts");
    }
    
    public String getInstancesLink() {
        return this.links.get("instances");
    }
    
    public String getVolumesLink() {
        return this.links.get("volumes");
    }
    

    
    private String accountId;
    
    private String agentId;
    
    private String agentState;
    
    private String apiProxy;
    
    private Integer computeTotal;
    
    private String created;
    
    private Map<String, Object> data;
    
    private String description;
    
    private String hostname;
    
    private Map<String, Object> info;
    
    private String kind;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private String physicalHostId;
    
    private List<PublicEndpoint> publicEndpoints;
    
    private String removeTime;
    
    private String removed;
    
    private String state;
    
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
    
    public String getAgentId() {
        return this.agentId;
    }

    public void setAgentId(String agentId) {
      this.agentId = agentId;
    }
    
    public String getAgentState() {
        return this.agentState;
    }

    public void setAgentState(String agentState) {
      this.agentState = agentState;
    }
    
    public String getApiProxy() {
        return this.apiProxy;
    }

    public void setApiProxy(String apiProxy) {
      this.apiProxy = apiProxy;
    }
    
    public Integer getComputeTotal() {
        return this.computeTotal;
    }

    public void setComputeTotal(Integer computeTotal) {
      this.computeTotal = computeTotal;
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
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public Map<String, Object> getInfo() {
        return this.info;
    }

    public void setInfo(Map<String, Object> info) {
      this.info = info;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getPhysicalHostId() {
        return this.physicalHostId;
    }

    public void setPhysicalHostId(String physicalHostId) {
      this.physicalHostId = physicalHostId;
    }
    
    public List<PublicEndpoint> getPublicEndpoints() {
        return this.publicEndpoints;
    }

    public void setPublicEndpoints(List<PublicEndpoint> publicEndpoints) {
      this.publicEndpoints = publicEndpoints;
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
