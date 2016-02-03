package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class InServiceUpgradeStrategy extends AbstractType {
    
    private Integer batchSize;
    
    private Integer intervalMillis;
    
    private LaunchConfig launchConfig;
    
    private LaunchConfig previousLaunchConfig;
    
    private List<SecondaryLaunchConfig> previousSecondaryLaunchConfigs;
    
    private List<SecondaryLaunchConfig> secondaryLaunchConfigs;
    
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
    
    public List<SecondaryLaunchConfig> getPreviousSecondaryLaunchConfigs() {
        return this.previousSecondaryLaunchConfigs;
    }

    public void setPreviousSecondaryLaunchConfigs(List<SecondaryLaunchConfig> previousSecondaryLaunchConfigs) {
      this.previousSecondaryLaunchConfigs = previousSecondaryLaunchConfigs;
    }
    
    public List<SecondaryLaunchConfig> getSecondaryLaunchConfigs() {
        return this.secondaryLaunchConfigs;
    }

    public void setSecondaryLaunchConfigs(List<SecondaryLaunchConfig> secondaryLaunchConfigs) {
      this.secondaryLaunchConfigs = secondaryLaunchConfigs;
    }
    
    public Boolean getStartFirst() {
        return this.startFirst;
    }

    public void setStartFirst(Boolean startFirst) {
      this.startFirst = startFirst;
    }
    
}
