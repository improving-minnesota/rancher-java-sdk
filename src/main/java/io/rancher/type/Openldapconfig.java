package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class Openldapconfig extends AbstractType {
    
    private String accessMode;
    
    private List<Identity> allowedIdentities;
    
    private Integer connectionTimeout;
    
    private String domain;
    
    private Boolean enabled;
    
    private String groupDNField;
    
    private String groupMemberMappingAttribute;
    
    private String groupMemberUserAttribute;
    
    private String groupNameField;
    
    private String groupObjectClass;
    
    private String groupSearchDomain;
    
    private String groupSearchField;
    
    private String loginDomain;
    
    private String name;
    
    private Integer port;
    
    private String server;
    
    private String serviceAccountPassword;
    
    private String serviceAccountUsername;
    
    private Boolean tls;
    
    private Integer userDisabledBitMask;
    
    private String userEnabledAttribute;
    
    private String userLoginField;
    
    private String userMemberAttribute;
    
    private String userNameField;
    
    private String userObjectClass;
    
    private String userSearchField;
    
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
    
    public Integer getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public void setConnectionTimeout(Integer connectionTimeout) {
      this.connectionTimeout = connectionTimeout;
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
    
    public String getGroupDNField() {
        return this.groupDNField;
    }

    public void setGroupDNField(String groupDNField) {
      this.groupDNField = groupDNField;
    }
    
    public String getGroupMemberMappingAttribute() {
        return this.groupMemberMappingAttribute;
    }

    public void setGroupMemberMappingAttribute(String groupMemberMappingAttribute) {
      this.groupMemberMappingAttribute = groupMemberMappingAttribute;
    }
    
    public String getGroupMemberUserAttribute() {
        return this.groupMemberUserAttribute;
    }

    public void setGroupMemberUserAttribute(String groupMemberUserAttribute) {
      this.groupMemberUserAttribute = groupMemberUserAttribute;
    }
    
    public String getGroupNameField() {
        return this.groupNameField;
    }

    public void setGroupNameField(String groupNameField) {
      this.groupNameField = groupNameField;
    }
    
    public String getGroupObjectClass() {
        return this.groupObjectClass;
    }

    public void setGroupObjectClass(String groupObjectClass) {
      this.groupObjectClass = groupObjectClass;
    }
    
    public String getGroupSearchDomain() {
        return this.groupSearchDomain;
    }

    public void setGroupSearchDomain(String groupSearchDomain) {
      this.groupSearchDomain = groupSearchDomain;
    }
    
    public String getGroupSearchField() {
        return this.groupSearchField;
    }

    public void setGroupSearchField(String groupSearchField) {
      this.groupSearchField = groupSearchField;
    }
    
    public String getLoginDomain() {
        return this.loginDomain;
    }

    public void setLoginDomain(String loginDomain) {
      this.loginDomain = loginDomain;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }
    
    public String getServer() {
        return this.server;
    }

    public void setServer(String server) {
      this.server = server;
    }
    
    public String getServiceAccountPassword() {
        return this.serviceAccountPassword;
    }

    public void setServiceAccountPassword(String serviceAccountPassword) {
      this.serviceAccountPassword = serviceAccountPassword;
    }
    
    public String getServiceAccountUsername() {
        return this.serviceAccountUsername;
    }

    public void setServiceAccountUsername(String serviceAccountUsername) {
      this.serviceAccountUsername = serviceAccountUsername;
    }
    
    public Boolean getTls() {
        return this.tls;
    }

    public void setTls(Boolean tls) {
      this.tls = tls;
    }
    
    public Integer getUserDisabledBitMask() {
        return this.userDisabledBitMask;
    }

    public void setUserDisabledBitMask(Integer userDisabledBitMask) {
      this.userDisabledBitMask = userDisabledBitMask;
    }
    
    public String getUserEnabledAttribute() {
        return this.userEnabledAttribute;
    }

    public void setUserEnabledAttribute(String userEnabledAttribute) {
      this.userEnabledAttribute = userEnabledAttribute;
    }
    
    public String getUserLoginField() {
        return this.userLoginField;
    }

    public void setUserLoginField(String userLoginField) {
      this.userLoginField = userLoginField;
    }
    
    public String getUserMemberAttribute() {
        return this.userMemberAttribute;
    }

    public void setUserMemberAttribute(String userMemberAttribute) {
      this.userMemberAttribute = userMemberAttribute;
    }
    
    public String getUserNameField() {
        return this.userNameField;
    }

    public void setUserNameField(String userNameField) {
      this.userNameField = userNameField;
    }
    
    public String getUserObjectClass() {
        return this.userObjectClass;
    }

    public void setUserObjectClass(String userObjectClass) {
      this.userObjectClass = userObjectClass;
    }
    
    public String getUserSearchField() {
        return this.userSearchField;
    }

    public void setUserSearchField(String userSearchField) {
      this.userSearchField = userSearchField;
    }
    
}
