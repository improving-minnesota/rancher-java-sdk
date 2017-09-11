package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class Subnet extends AbstractType {
    
    private String accountId;
    
    private Integer cidrSize;
    
    private String created;
    
    private Map<String, Object> data;
    
    private String description;
    
    private String endAddress;
    
    private String gateway;
    
    private String kind;
    
    private String name;
    
    private String networkAddress;
    
    private String networkId;
    
    private String removeTime;
    
    private String removed;
    
    private String startAddress;
    
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
    
    public Integer getCidrSize() {
        return this.cidrSize;
    }

    public void setCidrSize(Integer cidrSize) {
      this.cidrSize = cidrSize;
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
    
    public String getEndAddress() {
        return this.endAddress;
    }

    public void setEndAddress(String endAddress) {
      this.endAddress = endAddress;
    }
    
    public String getGateway() {
        return this.gateway;
    }

    public void setGateway(String gateway) {
      this.gateway = gateway;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNetworkAddress() {
        return this.networkAddress;
    }

    public void setNetworkAddress(String networkAddress) {
      this.networkAddress = networkAddress;
    }
    
    public String getNetworkId() {
        return this.networkId;
    }

    public void setNetworkId(String networkId) {
      this.networkId = networkId;
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
    
    public String getStartAddress() {
        return this.startAddress;
    }

    public void setStartAddress(String startAddress) {
      this.startAddress = startAddress;
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
