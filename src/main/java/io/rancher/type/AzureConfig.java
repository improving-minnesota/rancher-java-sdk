package io.rancher.type;

import io.rancher.base.AbstractType;

public class AzureConfig extends AbstractType {
    
    private String dockerPort;
    
    private String dockerSwarmMasterPort;
    
    private String image;
    
    private String location;
    
    private String password;
    
    private String publishSettingsFile;
    
    private String size;
    
    private String sshPort;
    
    private String subscriptionCert;
    
    private String subscriptionId;
    
    private String username;
    
    public String getDockerPort() {
        return this.dockerPort;
    }

    public void setDockerPort(String dockerPort) {
      this.dockerPort = dockerPort;
    }
    
    public String getDockerSwarmMasterPort() {
        return this.dockerSwarmMasterPort;
    }

    public void setDockerSwarmMasterPort(String dockerSwarmMasterPort) {
      this.dockerSwarmMasterPort = dockerSwarmMasterPort;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
      this.location = location;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
    
    public String getPublishSettingsFile() {
        return this.publishSettingsFile;
    }

    public void setPublishSettingsFile(String publishSettingsFile) {
      this.publishSettingsFile = publishSettingsFile;
    }
    
    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
      this.size = size;
    }
    
    public String getSshPort() {
        return this.sshPort;
    }

    public void setSshPort(String sshPort) {
      this.sshPort = sshPort;
    }
    
    public String getSubscriptionCert() {
        return this.subscriptionCert;
    }

    public void setSubscriptionCert(String subscriptionCert) {
      this.subscriptionCert = subscriptionCert;
    }
    
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
      this.subscriptionId = subscriptionId;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
}
