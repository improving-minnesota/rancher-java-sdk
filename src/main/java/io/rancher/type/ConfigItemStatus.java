package io.rancher.type;

import io.rancher.base.AbstractType;

public class ConfigItemStatus extends AbstractType {
    
    private String accountId;
    
    private String agentId;
    
    private String appliedUpdated;
    
    private Integer appliedVersion;
    
    private String name;
    
    private String requestedUpdated;
    
    private Integer requestedVersion;
    
    private String sourceVersion;
    
    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
      this.accountId = accountId;
    }
    
    public String getAgentId() {
        return this.agentId;
    }

    public void setAgentId(String agentId) {
      this.agentId = agentId;
    }
    
    public String getAppliedUpdated() {
        return this.appliedUpdated;
    }

    public void setAppliedUpdated(String appliedUpdated) {
      this.appliedUpdated = appliedUpdated;
    }
    
    public Integer getAppliedVersion() {
        return this.appliedVersion;
    }

    public void setAppliedVersion(Integer appliedVersion) {
      this.appliedVersion = appliedVersion;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getRequestedUpdated() {
        return this.requestedUpdated;
    }

    public void setRequestedUpdated(String requestedUpdated) {
      this.requestedUpdated = requestedUpdated;
    }
    
    public Integer getRequestedVersion() {
        return this.requestedVersion;
    }

    public void setRequestedVersion(Integer requestedVersion) {
      this.requestedVersion = requestedVersion;
    }
    
    public String getSourceVersion() {
        return this.sourceVersion;
    }

    public void setSourceVersion(String sourceVersion) {
      this.sourceVersion = sourceVersion;
    }
    
}
