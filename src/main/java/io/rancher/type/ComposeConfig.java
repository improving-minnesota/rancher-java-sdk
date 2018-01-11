package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class ComposeConfig extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
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
