package io.rancher.type;

import io.rancher.base.AbstractType;

public class Azureadconfig extends AbstractType {
    
    private String accessMode;
    
    private String adminAccountPassword;
    
    private String adminAccountUsername;
    
    private String clientId;
    
    private String domain;
    
    private Boolean enabled;
    
    private String name;
    
    private String tenantId;
    
    public String getAccessMode() {
        return this.accessMode;
    }

    public void setAccessMode(String accessMode) {
      this.accessMode = accessMode;
    }
    
    public String getAdminAccountPassword() {
        return this.adminAccountPassword;
    }

    public void setAdminAccountPassword(String adminAccountPassword) {
      this.adminAccountPassword = adminAccountPassword;
    }
    
    public String getAdminAccountUsername() {
        return this.adminAccountUsername;
    }

    public void setAdminAccountUsername(String adminAccountUsername) {
      this.adminAccountUsername = adminAccountUsername;
    }
    
    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
      this.clientId = clientId;
    }
    
    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
      this.domain = domain;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(String tenantId) {
      this.tenantId = tenantId;
    }
    
}
