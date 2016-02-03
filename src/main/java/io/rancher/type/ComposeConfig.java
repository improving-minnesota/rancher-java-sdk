package io.rancher.type;

import io.rancher.base.AbstractType;

public class ComposeConfig extends AbstractType {
    
    private String dockerComposeConfig;
    
    private String rancherComposeConfig;
    
    public String getDockerComposeConfig() {
        return this.dockerComposeConfig;
    }

    public void setDockerComposeConfig(String dockerComposeConfig) {
      this.dockerComposeConfig = dockerComposeConfig;
    }
    
    public String getRancherComposeConfig() {
        return this.rancherComposeConfig;
    }

    public void setRancherComposeConfig(String rancherComposeConfig) {
      this.rancherComposeConfig = rancherComposeConfig;
    }
    
}
