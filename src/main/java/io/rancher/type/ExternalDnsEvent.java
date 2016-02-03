package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class ExternalDnsEvent extends AbstractType {
    
    private String accountId;
    
    private String created;
    
    private Map<String, Object> data;
    
    private String eventType;
    
    private String externalId;
    
    private String fqdn;
    
    private String kind;
    
    private String reportedAccountId;
    
    private String serviceName;
    
    private String stackName;
    
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
    
    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
      this.eventType = eventType;
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
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public String getReportedAccountId() {
        return this.reportedAccountId;
    }

    public void setReportedAccountId(String reportedAccountId) {
      this.reportedAccountId = reportedAccountId;
    }
    
    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String serviceName) {
      this.serviceName = serviceName;
    }
    
    public String getStackName() {
        return this.stackName;
    }

    public void setStackName(String stackName) {
      this.stackName = stackName;
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
