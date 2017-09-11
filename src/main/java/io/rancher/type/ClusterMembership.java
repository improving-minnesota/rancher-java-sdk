package io.rancher.type;

import io.rancher.base.AbstractType;

public class ClusterMembership extends AbstractType {
    
    private Boolean clustered;
    
    private String config;
    
    private Integer heartbeat;
    
    private String name;
    
    private String uuid;
    
    public Boolean getClustered() {
        return this.clustered;
    }

    public void setClustered(Boolean clustered) {
      this.clustered = clustered;
    }
    
    public String getConfig() {
        return this.config;
    }

    public void setConfig(String config) {
      this.config = config;
    }
    
    public Integer getHeartbeat() {
        return this.heartbeat;
    }

    public void setHeartbeat(Integer heartbeat) {
      this.heartbeat = heartbeat;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
