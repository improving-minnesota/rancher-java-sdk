package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class Volume extends AbstractType {
    
    private String accessMode;
    
    private String accountId;
    
    private String created;
    
    private Map<String, Object> data;
    
    private String description;
    
    private String driver;
    
    private Map<String, Object> driverOpts;
    
    private String externalId;
    
    private String hostId;
    
    private String imageId;
    
    private String instanceId;
    
    private Boolean isHostPath;
    
    private String kind;
    
    private List<MountEntry> mounts;
    
    private String name;
    
    private String removeTime;
    
    private String removed;
    
    private Integer sizeMb;
    
    private String stackId;
    
    private String state;
    
    private String storageDriverId;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Integer transitioningProgress;
    
    private String uri;
    
    private String uuid;
    
    private String volumeTemplateId;
    
    public String getAccessMode() {
        return this.accessMode;
    }

    public void setAccessMode(String accessMode) {
      this.accessMode = accessMode;
    }
    
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
    
    public Map<String, Object> getDriverOpts() {
        return this.driverOpts;
    }

    public void setDriverOpts(Map<String, Object> driverOpts) {
      this.driverOpts = driverOpts;
    }
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
    public String getHostId() {
        return this.hostId;
    }

    public void setHostId(String hostId) {
      this.hostId = hostId;
    }
    
    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
      this.imageId = imageId;
    }
    
    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
      this.instanceId = instanceId;
    }
    
    public Boolean getIsHostPath() {
        return this.isHostPath;
    }

    public void setIsHostPath(Boolean isHostPath) {
      this.isHostPath = isHostPath;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public List<MountEntry> getMounts() {
        return this.mounts;
    }

    public void setMounts(List<MountEntry> mounts) {
      this.mounts = mounts;
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
    
    public Integer getSizeMb() {
        return this.sizeMb;
    }

    public void setSizeMb(Integer sizeMb) {
      this.sizeMb = sizeMb;
    }
    
    public String getStackId() {
        return this.stackId;
    }

    public void setStackId(String stackId) {
      this.stackId = stackId;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public String getStorageDriverId() {
        return this.storageDriverId;
    }

    public void setStorageDriverId(String storageDriverId) {
      this.storageDriverId = storageDriverId;
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
    
    public String getUri() {
        return this.uri;
    }

    public void setUri(String uri) {
      this.uri = uri;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public String getVolumeTemplateId() {
        return this.volumeTemplateId;
    }

    public void setVolumeTemplateId(String volumeTemplateId) {
      this.volumeTemplateId = volumeTemplateId;
    }
    
}
