package io.rancher.type;

import io.rancher.base.AbstractType;

public class SoftlayerConfig extends AbstractType {
    
    private String apiEndpoint;
    
    private String apiKey;
    
    private String cpu;
    
    private String diskSize;
    
    private String domain;
    
    private String hostname;
    
    private Boolean hourlyBilling;
    
    private String image;
    
    private Boolean localDisk;
    
    private String memory;
    
    private Boolean privateNetOnly;
    
    private String privateVlanId;
    
    private String publicVlanId;
    
    private String region;
    
    private String user;
    
    public String getApiEndpoint() {
        return this.apiEndpoint;
    }

    public void setApiEndpoint(String apiEndpoint) {
      this.apiEndpoint = apiEndpoint;
    }
    
    public String getApiKey() {
        return this.apiKey;
    }

    public void setApiKey(String apiKey) {
      this.apiKey = apiKey;
    }
    
    public String getCpu() {
        return this.cpu;
    }

    public void setCpu(String cpu) {
      this.cpu = cpu;
    }
    
    public String getDiskSize() {
        return this.diskSize;
    }

    public void setDiskSize(String diskSize) {
      this.diskSize = diskSize;
    }
    
    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
      this.domain = domain;
    }
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public Boolean getHourlyBilling() {
        return this.hourlyBilling;
    }

    public void setHourlyBilling(Boolean hourlyBilling) {
      this.hourlyBilling = hourlyBilling;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public Boolean getLocalDisk() {
        return this.localDisk;
    }

    public void setLocalDisk(Boolean localDisk) {
      this.localDisk = localDisk;
    }
    
    public String getMemory() {
        return this.memory;
    }

    public void setMemory(String memory) {
      this.memory = memory;
    }
    
    public Boolean getPrivateNetOnly() {
        return this.privateNetOnly;
    }

    public void setPrivateNetOnly(Boolean privateNetOnly) {
      this.privateNetOnly = privateNetOnly;
    }
    
    public String getPrivateVlanId() {
        return this.privateVlanId;
    }

    public void setPrivateVlanId(String privateVlanId) {
      this.privateVlanId = privateVlanId;
    }
    
    public String getPublicVlanId() {
        return this.publicVlanId;
    }

    public void setPublicVlanId(String publicVlanId) {
      this.publicVlanId = publicVlanId;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
