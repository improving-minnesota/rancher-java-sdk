package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class NetworkDriverService extends AbstractType {
    
    private String accountId;
    
    private Boolean assignServiceIpAddress;
    
    private Integer createIndex;
    
    private String created;
    
    private Integer currentScale;
    
    private Map<String, Object> data;
    
    private String description;
    
    private String externalId;
    
    private String fqdn;
    
    private String healthState;
    
    private List<String> instanceIds;
    
    private String kind;
    
    private LaunchConfig launchConfig;
    
    private LbTargetConfig lbConfig;
    
    private Map<String, Object> linkedServices;
    
    private Map<String, Object> metadata;
    
    private String name;
    
    private NetworkDriver networkDriver;
    
    private List<PublicEndpoint> publicEndpoints;
    
    private String removeTime;
    
    private String removed;
    
    private Boolean retainIp;
    
    private Integer scale;
    
    private ScalePolicy scalePolicy;
    
    private List<SecondaryLaunchConfig> secondaryLaunchConfigs;
    
    private String selectorContainer;
    
    private String selectorLink;
    
    private String stackId;
    
    private Boolean startOnCreate;
    
    private String state;
    
    private Boolean system;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Integer transitioningProgress;
    
    private ServiceUpgrade upgrade;
    
    private String uuid;
    
    private String vip;
    
    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
      this.accountId = accountId;
    }
    
    public Boolean getAssignServiceIpAddress() {
        return this.assignServiceIpAddress;
    }

    public void setAssignServiceIpAddress(Boolean assignServiceIpAddress) {
      this.assignServiceIpAddress = assignServiceIpAddress;
    }
    
    public Integer getCreateIndex() {
        return this.createIndex;
    }

    public void setCreateIndex(Integer createIndex) {
      this.createIndex = createIndex;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public Integer getCurrentScale() {
        return this.currentScale;
    }

    public void setCurrentScale(Integer currentScale) {
      this.currentScale = currentScale;
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
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
    public String getFqdn() {
        return this.fqdn;
    }

    public void setFqdn(String fqdn) {
      this.fqdn = fqdn;
    }
    
    public String getHealthState() {
        return this.healthState;
    }

    public void setHealthState(String healthState) {
      this.healthState = healthState;
    }
    
    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
      this.instanceIds = instanceIds;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public LaunchConfig getLaunchConfig() {
        return this.launchConfig;
    }

    public void setLaunchConfig(LaunchConfig launchConfig) {
      this.launchConfig = launchConfig;
    }
    
    public LbTargetConfig getLbConfig() {
        return this.lbConfig;
    }

    public void setLbConfig(LbTargetConfig lbConfig) {
      this.lbConfig = lbConfig;
    }
    
    public Map<String, Object> getLinkedServices() {
        return this.linkedServices;
    }

    public void setLinkedServices(Map<String, Object> linkedServices) {
      this.linkedServices = linkedServices;
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
    
    public NetworkDriver getNetworkDriver() {
        return this.networkDriver;
    }

    public void setNetworkDriver(NetworkDriver networkDriver) {
      this.networkDriver = networkDriver;
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
    
    public Boolean getRetainIp() {
        return this.retainIp;
    }

    public void setRetainIp(Boolean retainIp) {
      this.retainIp = retainIp;
    }
    
    public Integer getScale() {
        return this.scale;
    }

    public void setScale(Integer scale) {
      this.scale = scale;
    }
    
    public ScalePolicy getScalePolicy() {
        return this.scalePolicy;
    }

    public void setScalePolicy(ScalePolicy scalePolicy) {
      this.scalePolicy = scalePolicy;
    }
    
    public List<SecondaryLaunchConfig> getSecondaryLaunchConfigs() {
        return this.secondaryLaunchConfigs;
    }

    public void setSecondaryLaunchConfigs(List<SecondaryLaunchConfig> secondaryLaunchConfigs) {
      this.secondaryLaunchConfigs = secondaryLaunchConfigs;
    }
    
    public String getSelectorContainer() {
        return this.selectorContainer;
    }

    public void setSelectorContainer(String selectorContainer) {
      this.selectorContainer = selectorContainer;
    }
    
    public String getSelectorLink() {
        return this.selectorLink;
    }

    public void setSelectorLink(String selectorLink) {
      this.selectorLink = selectorLink;
    }
    
    public String getStackId() {
        return this.stackId;
    }

    public void setStackId(String stackId) {
      this.stackId = stackId;
    }
    
    public Boolean getStartOnCreate() {
        return this.startOnCreate;
    }

    public void setStartOnCreate(Boolean startOnCreate) {
      this.startOnCreate = startOnCreate;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public Boolean getSystem() {
        return this.system;
    }

    public void setSystem(Boolean system) {
      this.system = system;
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
    
    public ServiceUpgrade getUpgrade() {
        return this.upgrade;
    }

    public void setUpgrade(ServiceUpgrade upgrade) {
      this.upgrade = upgrade;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public String getVip() {
        return this.vip;
    }

    public void setVip(String vip) {
      this.vip = vip;
    }
    
}
