package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class Registry extends AbstractType {
    
    private String accountId;
    
    private String blockDevicePath;
    
    private String created;
    
    private Map<String, Object> data;
    
    private String description;
    
    private String driverName;
    
    private String externalId;
    
    private String kind;
    
    private String name;
    
    private String removeTime;
    
    private String removed;
    
    private String serverAddress;
    
    private String state;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Integer transitioningProgress;
    
    private String uuid;
    
    private String volumeAccessMode;
    
    private List<String> volumeCapabilities;
    
    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
      this.accountId = accountId;
    }
    
    public String getBlockDevicePath() {
        return this.blockDevicePath;
    }

    public void setBlockDevicePath(String blockDevicePath) {
      this.blockDevicePath = blockDevicePath;
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
    
    public String getDriverName() {
        return this.driverName;
    }

    public void setDriverName(String driverName) {
      this.driverName = driverName;
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
    
    public String getServerAddress() {
        return this.serverAddress;
    }

    public void setServerAddress(String serverAddress) {
      this.serverAddress = serverAddress;
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
    
    public String getVolumeAccessMode() {
        return this.volumeAccessMode;
    }

    public void setVolumeAccessMode(String volumeAccessMode) {
      this.volumeAccessMode = volumeAccessMode;
    }
    
    public List<String> getVolumeCapabilities() {
        return this.volumeCapabilities;
    }

    public void setVolumeCapabilities(List<String> volumeCapabilities) {
      this.volumeCapabilities = volumeCapabilities;
    }
    
}
