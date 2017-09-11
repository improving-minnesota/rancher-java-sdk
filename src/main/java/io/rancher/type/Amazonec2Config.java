package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class Amazonec2Config extends AbstractType {
    
    private String accessKey;
    
    private String ami;
    
    private String blockDurationMinutes;
    
    private String deviceName;
    
    private String endpoint;
    
    private String iamInstanceProfile;
    
    private Boolean insecureTransport;
    
    private String instanceType;
    
    private String keypairName;
    
    private Boolean monitoring;
    
    private List<String> openPort;
    
    private Boolean privateAddressOnly;
    
    private String region;
    
    private Boolean requestSpotInstance;
    
    private String retries;
    
    private String rootSize;
    
    private String secretKey;
    
    private List<String> securityGroup;
    
    private String sessionToken;
    
    private String spotPrice;
    
    private String sshKeypath;
    
    private String sshUser;
    
    private String subnetId;
    
    private String tags;
    
    private Boolean useEbsOptimizedInstance;
    
    private Boolean usePrivateAddress;
    
    private String userdata;
    
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
    
    public String getBlockDurationMinutes() {
        return this.blockDurationMinutes;
    }

    public void setBlockDurationMinutes(String blockDurationMinutes) {
      this.blockDurationMinutes = blockDurationMinutes;
    }
    
    public String getDeviceName() {
        return this.deviceName;
    }

    public void setDeviceName(String deviceName) {
      this.deviceName = deviceName;
    }
    
    public String getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(String endpoint) {
      this.endpoint = endpoint;
    }
    
    public String getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    public void setIamInstanceProfile(String iamInstanceProfile) {
      this.iamInstanceProfile = iamInstanceProfile;
    }
    
    public Boolean getInsecureTransport() {
        return this.insecureTransport;
    }

    public void setInsecureTransport(Boolean insecureTransport) {
      this.insecureTransport = insecureTransport;
    }
    
    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
      this.instanceType = instanceType;
    }
    
    public String getKeypairName() {
        return this.keypairName;
    }

    public void setKeypairName(String keypairName) {
      this.keypairName = keypairName;
    }
    
    public Boolean getMonitoring() {
        return this.monitoring;
    }

    public void setMonitoring(Boolean monitoring) {
      this.monitoring = monitoring;
    }
    
    public List<String> getOpenPort() {
        return this.openPort;
    }

    public void setOpenPort(List<String> openPort) {
      this.openPort = openPort;
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
    
    public String getRetries() {
        return this.retries;
    }

    public void setRetries(String retries) {
      this.retries = retries;
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
    
    public List<String> getSecurityGroup() {
        return this.securityGroup;
    }

    public void setSecurityGroup(List<String> securityGroup) {
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
    
    public String getUserdata() {
        return this.userdata;
    }

    public void setUserdata(String userdata) {
      this.userdata = userdata;
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
