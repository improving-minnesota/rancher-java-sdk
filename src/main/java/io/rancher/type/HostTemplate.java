package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class HostTemplate extends AbstractType {
    
    private String accountId;
    
    private String created;
    
    private Map<String, Object> data;
    
    private String description;
    
    private String driver;
    
    private String flavorPrefix;
    
    private String kind;
    
    private String name;
    
    private Map<String, Object> publicValues;
    
    private String removeTime;
    
    private String removed;
    
    private Map<String, Object> secretValues;
    
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
    
    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
      this.driver = driver;
    }
    
    public String getFlavorPrefix() {
        return this.flavorPrefix;
    }

    public void setFlavorPrefix(String flavorPrefix) {
      this.flavorPrefix = flavorPrefix;
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
    
    public Map<String, Object> getPublicValues() {
        return this.publicValues;
    }

    public void setPublicValues(Map<String, Object> publicValues) {
      this.publicValues = publicValues;
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
    
    public Map<String, Object> getSecretValues() {
        return this.secretValues;
    }

    public void setSecretValues(Map<String, Object> secretValues) {
      this.secretValues = secretValues;
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
