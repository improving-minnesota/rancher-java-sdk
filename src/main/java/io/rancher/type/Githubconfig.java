package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class Githubconfig extends AbstractType {
    
    private String accessMode;
    
    private List<Identity> allowedIdentities;
    
    private String clientId;
    
    private String clientSecret;
    
    private Boolean enabled;
    
    private String hostname;
    
    private String name;
    
    private String scheme;
    
    public String getAccessMode() {
        return this.accessMode;
    }

    public void setAccessMode(String accessMode) {
      this.accessMode = accessMode;
    }
    
    public List<Identity> getAllowedIdentities() {
        return this.allowedIdentities;
    }

    public void setAllowedIdentities(List<Identity> allowedIdentities) {
      this.allowedIdentities = allowedIdentities;
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
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getScheme() {
        return this.scheme;
    }

    public void setScheme(String scheme) {
      this.scheme = scheme;
    }
    
}
