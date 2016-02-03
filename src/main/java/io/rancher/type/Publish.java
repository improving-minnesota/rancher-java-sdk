package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class Publish extends AbstractType {
    
    private Map<String, Object> data;
    
    private String name;
    
    private List<String> previousIds;
    
    private String publisher;
    
    private String resourceId;
    
    private String resourceType;
    
    private Integer time;
    
    private String transitioning;
    
    private String transitioningInternalMessage;
    
    private String transitioningMessage;
    
    private Integer transitioningProgress;
    
    public Map<String, Object> getData() {
        return this.data;
    }

    public void setData(Map<String, Object> data) {
      this.data = data;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public List<String> getPreviousIds() {
        return this.previousIds;
    }

    public void setPreviousIds(List<String> previousIds) {
      this.previousIds = previousIds;
    }
    
    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
      this.publisher = publisher;
    }
    
    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
      this.resourceId = resourceId;
    }
    
    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    
    public Integer getTime() {
        return this.time;
    }

    public void setTime(Integer time) {
      this.time = time;
    }
    
    public String getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(String transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningInternalMessage() {
        return this.transitioningInternalMessage;
    }

    public void setTransitioningInternalMessage(String transitioningInternalMessage) {
      this.transitioningInternalMessage = transitioningInternalMessage;
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
    
}
