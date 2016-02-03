package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class Port extends AbstractType {
    
    private String accountId;
    
    private String created;
    
    private Map<String, Object> data;
    
    private String description;
    
    private String instanceId;
    
    private String kind;
    
    private String name;
    
    private String privateIpAddressId;
    
    private Integer privatePort;
    
    private String protocol;
    
    private String publicIpAddressId;
    
    private Integer publicPort;
    
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
    
    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
      this.instanceId = instanceId;
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
    
    public String getPrivateIpAddressId() {
        return this.privateIpAddressId;
    }

    public void setPrivateIpAddressId(String privateIpAddressId) {
      this.privateIpAddressId = privateIpAddressId;
    }
    
    public Integer getPrivatePort() {
        return this.privatePort;
    }

    public void setPrivatePort(Integer privatePort) {
      this.privatePort = privatePort;
    }
    
    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
      this.protocol = protocol;
    }
    
    public String getPublicIpAddressId() {
        return this.publicIpAddressId;
    }

    public void setPublicIpAddressId(String publicIpAddressId) {
      this.publicIpAddressId = publicIpAddressId;
    }
    
    public Integer getPublicPort() {
        return this.publicPort;
    }

    public void setPublicPort(Integer publicPort) {
      this.publicPort = publicPort;
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
