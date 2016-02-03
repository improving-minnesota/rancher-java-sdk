package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class InServiceUpgradeStrategy extends AbstractType {
    
    private Integer batchSize;
    
    private Integer intervalMillis;
    
    private LaunchConfig launchConfig;
    
    private LaunchConfig previousLaunchConfig;
    
    private List<Object> previousSecondaryLaunchConfigs;
    
    private List<Object> secondaryLaunchConfigs;
    
    private Boolean startFirst;
    
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
    
    public LaunchConfig getLaunchConfig() {
        return this.launchConfig;
    }

    public void setLaunchConfig(LaunchConfig launchConfig) {
      this.launchConfig = launchConfig;
    }
    
    public LaunchConfig getPreviousLaunchConfig() {
        return this.previousLaunchConfig;
    }

    public void setPreviousLaunchConfig(LaunchConfig previousLaunchConfig) {
      this.previousLaunchConfig = previousLaunchConfig;
    }
    
    public List<Object> getPreviousSecondaryLaunchConfigs() {
        return this.previousSecondaryLaunchConfigs;
    }

    public void setPreviousSecondaryLaunchConfigs(List<Object> previousSecondaryLaunchConfigs) {
      this.previousSecondaryLaunchConfigs = previousSecondaryLaunchConfigs;
    }
    
    public List<Object> getSecondaryLaunchConfigs() {
        return this.secondaryLaunchConfigs;
    }

    public void setSecondaryLaunchConfigs(List<Object> secondaryLaunchConfigs) {
      this.secondaryLaunchConfigs = secondaryLaunchConfigs;
    }
    
    public Boolean getStartFirst() {
        return this.startFirst;
    }

    public void setStartFirst(Boolean startFirst) {
      this.startFirst = startFirst;
    }
    
}
