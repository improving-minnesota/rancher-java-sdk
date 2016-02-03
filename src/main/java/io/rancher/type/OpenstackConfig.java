package io.rancher.type;

import io.rancher.base.AbstractType;

public class OpenstackConfig extends AbstractType {
    
    private String authUrl;
    
    private String availabilityZone;
    
    private String domainId;
    
    private String domainName;
    
    private String endpointType;
    
    private String flavorId;
    
    private String flavorName;
    
    private String floatingipPool;
    
    private String imageId;
    
    private String imageName;
    
    private Boolean insecure;
    
    private String netId;
    
    private String netName;
    
    private String password;
    
    private String region;
    
    private String secGroups;
    
    private String sshPort;
    
    private String sshUser;
    
    private String tenantId;
    
    private String tenantName;
    
    private String username;
    
    public String getAuthUrl() {
        return this.authUrl;
    }

    public void setAuthUrl(String authUrl) {
      this.authUrl = authUrl;
    }
    
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
      this.availabilityZone = availabilityZone;
    }
    
    public String getDomainId() {
        return this.domainId;
    }

    public void setDomainId(String domainId) {
      this.domainId = domainId;
    }
    
    public String getDomainName() {
        return this.domainName;
    }

    public void setDomainName(String domainName) {
      this.domainName = domainName;
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
    
    public String getFlavorName() {
        return this.flavorName;
    }

    public void setFlavorName(String flavorName) {
      this.flavorName = flavorName;
    }
    
    public String getFloatingipPool() {
        return this.floatingipPool;
    }

    public void setFloatingipPool(String floatingipPool) {
      this.floatingipPool = floatingipPool;
    }
    
    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
      this.imageId = imageId;
    }
    
    public String getImageName() {
        return this.imageName;
    }

    public void setImageName(String imageName) {
      this.imageName = imageName;
    }
    
    public Boolean getInsecure() {
        return this.insecure;
    }

    public void setInsecure(Boolean insecure) {
      this.insecure = insecure;
    }
    
    public String getNetId() {
        return this.netId;
    }

    public void setNetId(String netId) {
      this.netId = netId;
    }
    
    public String getNetName() {
        return this.netName;
    }

    public void setNetName(String netName) {
      this.netName = netName;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public String getSecGroups() {
        return this.secGroups;
    }

    public void setSecGroups(String secGroups) {
      this.secGroups = secGroups;
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
    
    public String getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(String tenantId) {
      this.tenantId = tenantId;
    }
    
    public String getTenantName() {
        return this.tenantName;
    }

    public void setTenantName(String tenantName) {
      this.tenantName = tenantName;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
}
