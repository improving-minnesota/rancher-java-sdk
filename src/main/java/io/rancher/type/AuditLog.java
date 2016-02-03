package io.rancher.type;

import io.rancher.base.AbstractType;

public class AuditLog extends AbstractType {
    
    private String accountId;
    
    private String authType;
    
    private String authenticatedAsAccountId;
    
    private String authenticatedAsIdentityId;
    
    private String clientIp;
    
    private String created;
    
    private String description;
    
    private String eventType;
    
    private String kind;
    
    private String requestObject;
    
    private Integer resourceId;
    
    private String resourceType;
    
    private String responseCode;
    
    private String responseObject;
    
    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
      this.accountId = accountId;
    }
    
    public String getAuthType() {
        return this.authType;
    }

    public void setAuthType(String authType) {
      this.authType = authType;
    }
    
    public String getAuthenticatedAsAccountId() {
        return this.authenticatedAsAccountId;
    }

    public void setAuthenticatedAsAccountId(String authenticatedAsAccountId) {
      this.authenticatedAsAccountId = authenticatedAsAccountId;
    }
    
    public String getAuthenticatedAsIdentityId() {
        return this.authenticatedAsIdentityId;
    }

    public void setAuthenticatedAsIdentityId(String authenticatedAsIdentityId) {
      this.authenticatedAsIdentityId = authenticatedAsIdentityId;
    }
    
    public String getClientIp() {
        return this.clientIp;
    }

    public void setClientIp(String clientIp) {
      this.clientIp = clientIp;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
      this.eventType = eventType;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public String getRequestObject() {
        return this.requestObject;
    }

    public void setRequestObject(String requestObject) {
      this.requestObject = requestObject;
    }
    
    public Integer getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(Integer resourceId) {
      this.resourceId = resourceId;
    }
    
    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    
    public String getResponseCode() {
        return this.responseCode;
    }

    public void setResponseCode(String responseCode) {
      this.responseCode = responseCode;
    }
    
    public String getResponseObject() {
        return this.responseObject;
    }

    public void setResponseObject(String responseObject) {
      this.responseObject = responseObject;
    }
    
}
