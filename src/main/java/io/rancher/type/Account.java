package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;
import java.util.Map;

public class Account extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    
    public String getAgentsLink() {
        return this.links.get("agents");
    }
    
    public String getBackupsLink() {
        return this.links.get("backups");
    }
    
    public String getCertificatesLink() {
        return this.links.get("certificates");
    }
    
    public String getCredentialsLink() {
        return this.links.get("credentials");
    }
    
    public String getEnvironmentsLink() {
        return this.links.get("environments");
    }
    
    public String getHostsLink() {
        return this.links.get("hosts");
    }
    
    public String getImagesLink() {
        return this.links.get("images");
    }
    
    public String getInstancesLink() {
        return this.links.get("instances");
    }
    
    public String getLabelsLink() {
        return this.links.get("labels");
    }
    
    public String getMountsLink() {
        return this.links.get("mounts");
    }
    
    public String getNetworksLink() {
        return this.links.get("networks");
    }
    
    public String getPortsLink() {
        return this.links.get("ports");
    }
    
    public String getServicesLink() {
        return this.links.get("services");
    }
    
    public String getSnapshotsLink() {
        return this.links.get("snapshots");
    }
    
    public String getVolumesLink() {
        return this.links.get("volumes");
    }
    

    
    private String created;
    
    private Map<String, Object> data;
    
    private String description;
    
    private String externalId;
    
    private String externalIdType;
    
    private String identity;
    
    private String kind;
    
    private String name;
    
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
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
    public String getExternalIdType() {
        return this.externalIdType;
    }

    public void setExternalIdType(String externalIdType) {
      this.externalIdType = externalIdType;
    }
    
    public String getIdentity() {
        return this.identity;
    }

    public void setIdentity(String identity) {
      this.identity = identity;
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
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
