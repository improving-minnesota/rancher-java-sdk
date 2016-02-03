package io.rancher.type;

import io.rancher.base.AbstractType;

public class RackspaceConfig extends AbstractType {
    
    private String apiKey;
    
    private String dockerInstall;
    
    private String endpointType;
    
    private String flavorId;
    
    private String imageId;
    
    private String region;
    
    private String sshPort;
    
    private String sshUser;
    
    private String username;
    
    public String getApiKey() {
        return this.apiKey;
    }

    public void setApiKey(String apiKey) {
      this.apiKey = apiKey;
    }
    
    public String getDockerInstall() {
        return this.dockerInstall;
    }

    public void setDockerInstall(String dockerInstall) {
      this.dockerInstall = dockerInstall;
    }
    
    public String getEndpointType() {
        return this.endpointType;
    }

    public void setEndpointType(String endpointType) {
      this.endpointType = endpointType;
    }
    
    public String getFlavorId() {
        return this.flavorId;
    }

    public void setFlavorId(String flavorId) {
      this.flavorId = flavorId;
    }
    
    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
      this.imageId = imageId;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public String getSshPort() {
        return this.sshPort;
    }

    public void setSshPort(String sshPort) {
      this.sshPort = sshPort;
    }
    
    public String getSshUser() {
        return this.sshUser;
    }

    public void setSshUser(String sshUser) {
      this.sshUser = sshUser;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
}
