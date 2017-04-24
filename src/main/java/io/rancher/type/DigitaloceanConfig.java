package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class DigitaloceanConfig extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private String accessToken;
    
    private Boolean backups;
    
    private String image;
    
    private Boolean ipv6;
    
    private Boolean privateNetworking;
    
    private String region;
    
    private String size;
    
    private String sshPort;
    
    private String sshUser;
    
    private String userdata;
    
    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
      this.accessToken = accessToken;
    }
    
    public Boolean getBackups() {
        return this.backups;
    }

    public void setBackups(Boolean backups) {
      this.backups = backups;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public Boolean getIpv6() {
        return this.ipv6;
    }

    public void setIpv6(Boolean ipv6) {
      this.ipv6 = ipv6;
    }
    
    public Boolean getPrivateNetworking() {
        return this.privateNetworking;
    }

    public void setPrivateNetworking(Boolean privateNetworking) {
      this.privateNetworking = privateNetworking;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
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
    
    public String getSshUser() {
        return this.sshUser;
    }

    public void setSshUser(String sshUser) {
      this.sshUser = sshUser;
    }
    
    public String getUserdata() {
        return this.userdata;
    }

    public void setUserdata(String userdata) {
      this.userdata = userdata;
    }
    
}
