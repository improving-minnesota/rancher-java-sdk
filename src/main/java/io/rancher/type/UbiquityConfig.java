package io.rancher.type;

import io.rancher.base.AbstractType;

public class UbiquityConfig extends AbstractType {
    
    private String apiToken;
    
    private String apiUsername;
    
    private String clientId;
    
    private String flavorId;
    
    private String imageId;
    
    private String zoneId;
    
    public String getApiToken() {
        return this.apiToken;
    }

    public void setApiToken(String apiToken) {
      this.apiToken = apiToken;
    }
    
    public String getApiUsername() {
        return this.apiUsername;
    }

    public void setApiUsername(String apiUsername) {
      this.apiUsername = apiUsername;
    }
    
    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
      this.clientId = clientId;
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
    
    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
      this.zoneId = zoneId;
    }
    
}
