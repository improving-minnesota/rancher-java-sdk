package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class ExternalHandlerExternalHandlerProcessMap extends AbstractType {
    
    private String created;
    
    private Map<String, Object> data;
    
    private String description;
    
    private String externalHandlerId;
    
    private String externalHandlerProcessId;
    
    private String kind;
    
    private String name;
    
    private String onError;
    
    private String removeTime;
    
    private String removed;
    
    private String state;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Integer transitioningProgress;
    
    private String uuid;
    
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
    
    public String getExternalHandlerId() {
        return this.externalHandlerId;
    }

    public void setExternalHandlerId(String externalHandlerId) {
      this.externalHandlerId = externalHandlerId;
    }
    
    public String getExternalHandlerProcessId() {
        return this.externalHandlerProcessId;
    }

    public void setExternalHandlerProcessId(String externalHandlerProcessId) {
      this.externalHandlerProcessId = externalHandlerProcessId;
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
    
    public String getOnError() {
        return this.onError;
    }

    public void setOnError(String onError) {
      this.onError = onError;
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
