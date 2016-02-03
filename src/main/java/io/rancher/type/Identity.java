package io.rancher.type;

import io.rancher.base.AbstractType;

public class Identity extends AbstractType {
    
    private String all;
    
    private String externalId;
    
    private String externalIdType;
    
    private String login;
    
    private String name;
    
    private String profilePicture;
    
    private String profileUrl;
    
    private String projectId;
    
    private String role;
    
    public String getAll() {
        return this.all;
    }

    public void setAll(String all) {
      this.all = all;
    }
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
    public String getExternalIdType() {
        return this.externalIdType;
    }

    public void setExternalIdType(String externalIdType) {
      this.externalIdType = externalIdType;
    }
    
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
      this.login = login;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getProfilePicture() {
        return this.profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
      this.profilePicture = profilePicture;
    }
    
    public String getProfileUrl() {
        return this.profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
      this.profileUrl = profileUrl;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
      this.role = role;
    }
    
}
