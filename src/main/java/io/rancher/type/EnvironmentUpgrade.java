package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;
import java.util.Map;

public class EnvironmentUpgrade extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private String dockerCompose;
    
    private Map<String, Object> environment;
    
    private String externalId;
    
    private String rancherCompose;
    
    public String getDockerCompose() {
        return this.dockerCompose;
    }

    public void setDockerCompose(String dockerCompose) {
      this.dockerCompose = dockerCompose;
    }
    
    public Map<String, Object> getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(Map<String, Object> environment) {
      this.environment = environment;
    }
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
    public String getRancherCompose() {
        return this.rancherCompose;
    }

    public void setRancherCompose(String rancherCompose) {
      this.rancherCompose = rancherCompose;
    }
    
}
