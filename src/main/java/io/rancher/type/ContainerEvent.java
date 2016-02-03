package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class ContainerEvent extends AbstractType {
    
    private String accountId;
    
    private String created;
    
    private Map<String, Object> data;
    
    private Map<String, Object> dockerInspect;
    
    private String externalFrom;
    
    private String externalId;
    
    private String externalStatus;
    
    private Integer externalTimestamp;
    
    private String hostId;
    
    private String kind;
    
    private String reportedHostUuid;
    
    private String state;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Integer transitioningProgress;
    
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
    
    public Map<String, Object> getDockerInspect() {
        return this.dockerInspect;
    }

    public void setDockerInspect(Map<String, Object> dockerInspect) {
      this.dockerInspect = dockerInspect;
    }
    
    public String getExternalFrom() {
        return this.externalFrom;
    }

    public void setExternalFrom(String externalFrom) {
      this.externalFrom = externalFrom;
    }
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
    public String getExternalStatus() {
        return this.externalStatus;
    }

    public void setExternalStatus(String externalStatus) {
      this.externalStatus = externalStatus;
    }
    
    public Integer getExternalTimestamp() {
        return this.externalTimestamp;
    }

    public void setExternalTimestamp(Integer externalTimestamp) {
      this.externalTimestamp = externalTimestamp;
    }
    
    public String getHostId() {
        return this.hostId;
    }

    public void setHostId(String hostId) {
      this.hostId = hostId;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public String getReportedHostUuid() {
        return this.reportedHostUuid;
    }

    public void setReportedHostUuid(String reportedHostUuid) {
      this.reportedHostUuid = reportedHostUuid;
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
    
}
