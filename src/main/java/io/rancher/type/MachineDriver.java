package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class MachineDriver extends AbstractType {
    
    private Boolean activateOnCreate;
    
    private Boolean builtin;
    
    private String checksum;
    
    private String created;
    
    private Map<String, Object> data;
    
    private Boolean defaultActive;
    
    private String description;
    
    private String externalId;
    
    private String kind;
    
    private String name;
    
    private String removeTime;
    
    private String removed;
    
    private String state;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Integer transitioningProgress;
    
    private String uiUrl;
    
    private String url;
    
    private String uuid;
    
    public Boolean getActivateOnCreate() {
        return this.activateOnCreate;
    }

    public void setActivateOnCreate(Boolean activateOnCreate) {
      this.activateOnCreate = activateOnCreate;
    }
    
    public Boolean getBuiltin() {
        return this.builtin;
    }

    public void setBuiltin(Boolean builtin) {
      this.builtin = builtin;
    }
    
    public String getChecksum() {
        return this.checksum;
    }

    public void setChecksum(String checksum) {
      this.checksum = checksum;
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
    
    public Boolean getDefaultActive() {
        return this.defaultActive;
    }

    public void setDefaultActive(Boolean defaultActive) {
      this.defaultActive = defaultActive;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
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
    
    public String getUiUrl() {
        return this.uiUrl;
    }

    public void setUiUrl(String uiUrl) {
      this.uiUrl = uiUrl;
    }
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
