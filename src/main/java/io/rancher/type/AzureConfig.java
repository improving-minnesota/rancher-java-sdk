package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class AzureConfig extends AbstractType {
    
    private String availabilitySet;
    
    private String clientId;
    
    private String clientSecret;
    
    private String customData;
    
    private String dns;
    
    private String dockerPort;
    
    private String environment;
    
    private String image;
    
    private String location;
    
    private Boolean noPublicIp;
    
    private List<String> openPort;
    
    private String privateIpAddress;
    
    private String resourceGroup;
    
    private String size;
    
    private String sshUser;
    
    private Boolean staticPublicIp;
    
    private String storageType;
    
    private String subnet;
    
    private String subnetPrefix;
    
    private String subscriptionId;
    
    private Boolean usePrivateIp;
    
    private String vnet;
    
    public String getAvailabilitySet() {
        return this.availabilitySet;
    }

    public void setAvailabilitySet(String availabilitySet) {
      this.availabilitySet = availabilitySet;
    }
    
    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
      this.clientId = clientId;
    }
    
    public String getClientSecret() {
        return this.clientSecret;
    }

    public void setClientSecret(String clientSecret) {
      this.clientSecret = clientSecret;
    }
    
    public String getCustomData() {
        return this.customData;
    }

    public void setCustomData(String customData) {
      this.customData = customData;
    }
    
    public String getDns() {
        return this.dns;
    }

    public void setDns(String dns) {
      this.dns = dns;
    }
    
    public String getDockerPort() {
        return this.dockerPort;
    }

    public void setDockerPort(String dockerPort) {
      this.dockerPort = dockerPort;
    }
    
    public String getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(String environment) {
      this.environment = environment;
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
    
    public Boolean getNoPublicIp() {
        return this.noPublicIp;
    }

    public void setNoPublicIp(Boolean noPublicIp) {
      this.noPublicIp = noPublicIp;
    }
    
    public List<String> getOpenPort() {
        return this.openPort;
    }

    public void setOpenPort(List<String> openPort) {
      this.openPort = openPort;
    }
    
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
      this.privateIpAddress = privateIpAddress;
    }
    
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public void setResourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
    }
    
    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
      this.size = size;
    }
    
    public String getSshUser() {
        return this.sshUser;
    }

    public void setSshUser(String sshUser) {
      this.sshUser = sshUser;
    }
    
    public Boolean getStaticPublicIp() {
        return this.staticPublicIp;
    }

    public void setStaticPublicIp(Boolean staticPublicIp) {
      this.staticPublicIp = staticPublicIp;
    }
    
    public String getStorageType() {
        return this.storageType;
    }

    public void setStorageType(String storageType) {
      this.storageType = storageType;
    }
    
    public String getSubnet() {
        return this.subnet;
    }

    public void setSubnet(String subnet) {
      this.subnet = subnet;
    }
    
    public String getSubnetPrefix() {
        return this.subnetPrefix;
    }

    public void setSubnetPrefix(String subnetPrefix) {
      this.subnetPrefix = subnetPrefix;
    }
    
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
      this.subscriptionId = subscriptionId;
    }
    
    public Boolean getUsePrivateIp() {
        return this.usePrivateIp;
    }

    public void setUsePrivateIp(Boolean usePrivateIp) {
      this.usePrivateIp = usePrivateIp;
    }
    
    public String getVnet() {
        return this.vnet;
    }

    public void setVnet(String vnet) {
      this.vnet = vnet;
    }
    
}
