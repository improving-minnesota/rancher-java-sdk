package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class Amazonec2Config extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private String accessKey;
    
    private String ami;
    
    private String deviceName;
    
    private String iamInstanceProfile;
    
    private String instanceType;
    
    private Boolean monitoring;
    
    private Boolean privateAddressOnly;
    
    private String region;
    
    private Boolean requestSpotInstance;
    
    private String rootSize;
    
    private String secretKey;
    
    private String securityGroup;
    
    private String sessionToken;
    
    private String spotPrice;
    
    private String sshKeypath;
    
    private String sshUser;
    
    private String subnetId;
    
    private String tags;
    
    private Boolean useEbsOptimizedInstance;
    
    private Boolean usePrivateAddress;
    
    private String volumeType;
    
    private String vpcId;
    
    private String zone;
    
    public String getAccessKey() {
        return this.accessKey;
    }

    public void setAccessKey(String accessKey) {
      this.accessKey = accessKey;
    }
    
    public String getAmi() {
        return this.ami;
    }

    public void setAmi(String ami) {
      this.ami = ami;
    }
    
    public String getDeviceName() {
        return this.deviceName;
    }

    public void setDeviceName(String deviceName) {
      this.deviceName = deviceName;
    }
    
    public String getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    public void setIamInstanceProfile(String iamInstanceProfile) {
      this.iamInstanceProfile = iamInstanceProfile;
    }
    
    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
      this.instanceType = instanceType;
    }
    
    public Boolean getMonitoring() {
        return this.monitoring;
    }

    public void setMonitoring(Boolean monitoring) {
      this.monitoring = monitoring;
    }
    
    public Boolean getPrivateAddressOnly() {
        return this.privateAddressOnly;
    }

    public void setPrivateAddressOnly(Boolean privateAddressOnly) {
      this.privateAddressOnly = privateAddressOnly;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public Boolean getRequestSpotInstance() {
        return this.requestSpotInstance;
    }

    public void setRequestSpotInstance(Boolean requestSpotInstance) {
      this.requestSpotInstance = requestSpotInstance;
    }
    
    public String getRootSize() {
        return this.rootSize;
    }

    public void setRootSize(String rootSize) {
      this.rootSize = rootSize;
    }
    
    public String getSecretKey() {
        return this.secretKey;
    }

    public void setSecretKey(String secretKey) {
      this.secretKey = secretKey;
    }
    
    public String getSecurityGroup() {
        return this.securityGroup;
    }

    public void setSecurityGroup(String securityGroup) {
      this.securityGroup = securityGroup;
    }
    
    public String getSessionToken() {
        return this.sessionToken;
    }

    public void setSessionToken(String sessionToken) {
      this.sessionToken = sessionToken;
    }
    
    public String getSpotPrice() {
        return this.spotPrice;
    }

    public void setSpotPrice(String spotPrice) {
      this.spotPrice = spotPrice;
    }
    
    public String getSshKeypath() {
        return this.sshKeypath;
    }

    public void setSshKeypath(String sshKeypath) {
      this.sshKeypath = sshKeypath;
    }
    
    public String getSshUser() {
        return this.sshUser;
    }

    public void setSshUser(String sshUser) {
      this.sshUser = sshUser;
    }
    
    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
      this.subnetId = subnetId;
    }
    
    public String getTags() {
        return this.tags;
    }

    public void setTags(String tags) {
      this.tags = tags;
    }
    
    public Boolean getUseEbsOptimizedInstance() {
        return this.useEbsOptimizedInstance;
    }

    public void setUseEbsOptimizedInstance(Boolean useEbsOptimizedInstance) {
      this.useEbsOptimizedInstance = useEbsOptimizedInstance;
    }
    
    public Boolean getUsePrivateAddress() {
        return this.usePrivateAddress;
    }

    public void setUsePrivateAddress(Boolean usePrivateAddress) {
      this.usePrivateAddress = usePrivateAddress;
    }
    
    public String getVolumeType() {
        return this.volumeType;
    }

    public void setVolumeType(String volumeType) {
      this.volumeType = volumeType;
    }
    
    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
      this.vpcId = vpcId;
    }
    
    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
      this.zone = zone;
    }
    
}
