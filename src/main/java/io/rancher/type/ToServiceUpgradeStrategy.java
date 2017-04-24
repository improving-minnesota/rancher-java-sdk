package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class ToServiceUpgradeStrategy extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private Integer batchSize;
    
    private Integer finalScale;
    
    private Integer intervalMillis;
    
    private String toServiceId;
    
    private Boolean updateLinks;
    
    public Integer getBatchSize() {
        return this.batchSize;
    }

    public void setBatchSize(Integer batchSize) {
      this.batchSize = batchSize;
    }
    
    public Integer getFinalScale() {
        return this.finalScale;
    }

    public void setFinalScale(Integer finalScale) {
      this.finalScale = finalScale;
    }
    
    public Integer getIntervalMillis() {
        return this.intervalMillis;
    }

    public void setIntervalMillis(Integer intervalMillis) {
      this.intervalMillis = intervalMillis;
    }
    
    public String getToServiceId() {
        return this.toServiceId;
    }

    public void setToServiceId(String toServiceId) {
      this.toServiceId = toServiceId;
    }
    
    public Boolean getUpdateLinks() {
        return this.updateLinks;
    }

    public void setUpdateLinks(Boolean updateLinks) {
      this.updateLinks = updateLinks;
    }
    
}
