package io.rancher.type;

import io.rancher.base.AbstractType;

public class ServiceUpgradeStrategy extends AbstractType {
    
    private Integer batchSize;
    
    private Integer intervalMillis;
    
    public Integer getBatchSize() {
        return this.batchSize;
    }

    public void setBatchSize(Integer batchSize) {
      this.batchSize = batchSize;
    }
    
    public Integer getIntervalMillis() {
        return this.intervalMillis;
    }

    public void setIntervalMillis(Integer intervalMillis) {
      this.intervalMillis = intervalMillis;
    }
    
}
