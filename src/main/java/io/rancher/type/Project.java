package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class Project extends AbstractType {
    
    private Boolean allowSystemRole;
    
    private String created;
    
    private Map<String, Object> data;
    
    private String defaultNetworkId;
    
    private String description;
    
    private String healthState;
    
    private Integer hostRemoveDelaySeconds;
    
    private String kind;
    
    private List<ProjectMember> members;
    
    private String name;
    
    private String orchestration;
    
    private List<String> projectLinks;
    
    private String projectTemplateId;
    
    private String removeTime;
    
    private String removed;
    
    private ServicesPortRange servicesPortRange;
    
    private String state;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Integer transitioningProgress;
    
    private String uuid;
    
    private String version;
    
    private Boolean virtualMachine;
    
    public Boolean getAllowSystemRole() {
        return this.allowSystemRole;
    }

    public void setAllowSystemRole(Boolean allowSystemRole) {
      this.allowSystemRole = allowSystemRole;
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
    
    public String getDefaultNetworkId() {
        return this.defaultNetworkId;
    }

    public void setDefaultNetworkId(String defaultNetworkId) {
      this.defaultNetworkId = defaultNetworkId;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getHealthState() {
        return this.healthState;
    }

    public void setHealthState(String healthState) {
      this.healthState = healthState;
    }
    
    public Integer getHostRemoveDelaySeconds() {
        return this.hostRemoveDelaySeconds;
    }

    public void setHostRemoveDelaySeconds(Integer hostRemoveDelaySeconds) {
      this.hostRemoveDelaySeconds = hostRemoveDelaySeconds;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public List<ProjectMember> getMembers() {
        return this.members;
    }

    public void setMembers(List<ProjectMember> members) {
      this.members = members;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getOrchestration() {
        return this.orchestration;
    }

    public void setOrchestration(String orchestration) {
      this.orchestration = orchestration;
    }
    
    public List<String> getProjectLinks() {
        return this.projectLinks;
    }

    public void setProjectLinks(List<String> projectLinks) {
      this.projectLinks = projectLinks;
    }
    
    public String getProjectTemplateId() {
        return this.projectTemplateId;
    }

    public void setProjectTemplateId(String projectTemplateId) {
      this.projectTemplateId = projectTemplateId;
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
    
    public ServicesPortRange getServicesPortRange() {
        return this.servicesPortRange;
    }

    public void setServicesPortRange(ServicesPortRange servicesPortRange) {
      this.servicesPortRange = servicesPortRange;
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
    
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
      this.version = version;
    }
    
    public Boolean getVirtualMachine() {
        return this.virtualMachine;
    }

    public void setVirtualMachine(Boolean virtualMachine) {
      this.virtualMachine = virtualMachine;
    }
    
}
