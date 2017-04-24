package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class HaConfig extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private Integer clusterSize;
    
    private String dbHost;
    
    private Integer dbSize;
    
    private Boolean enabled;
    
    public Integer getClusterSize() {
        return this.clusterSize;
    }

    public void setClusterSize(Integer clusterSize) {
      this.clusterSize = clusterSize;
    }
    
    public String getDbHost() {
        return this.dbHost;
    }

    public void setDbHost(String dbHost) {
      this.dbHost = dbHost;
    }
    
    public Integer getDbSize() {
        return this.dbSize;
    }

    public void setDbSize(Integer dbSize) {
      this.dbSize = dbSize;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
}
