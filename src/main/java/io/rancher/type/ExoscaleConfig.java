package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class ExoscaleConfig extends AbstractType {
    
    private String apiKey;
    
    private String apiSecretKey;
    
    private String availabilityZone;
    
    private String diskSize;
    
    private String image;
    
    private String instanceProfile;
    
    private List<String> securityGroup;
    
    private String url;
    
    public String getApiKey() {
        return this.apiKey;
    }

    public void setApiKey(String apiKey) {
      this.apiKey = apiKey;
    }
    
    public String getApiSecretKey() {
        return this.apiSecretKey;
    }

    public void setApiSecretKey(String apiSecretKey) {
      this.apiSecretKey = apiSecretKey;
    }
    
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
      this.availabilityZone = availabilityZone;
    }
    
    public String getDiskSize() {
        return this.diskSize;
    }

    public void setDiskSize(String diskSize) {
      this.diskSize = diskSize;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getInstanceProfile() {
        return this.instanceProfile;
    }

    public void setInstanceProfile(String instanceProfile) {
      this.instanceProfile = instanceProfile;
    }
    
    public List<String> getSecurityGroup() {
        return this.securityGroup;
    }

    public void setSecurityGroup(List<String> securityGroup) {
      this.securityGroup = securityGroup;
    }
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
}
