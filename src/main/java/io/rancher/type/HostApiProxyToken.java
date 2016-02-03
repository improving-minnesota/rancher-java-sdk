package io.rancher.type;

import io.rancher.base.AbstractType;

public class HostApiProxyToken extends AbstractType {
    
    private String reportedUuid;
    
    private String token;
    
    private String url;
    
    public String getReportedUuid() {
        return this.reportedUuid;
    }

    public void setReportedUuid(String reportedUuid) {
      this.reportedUuid = reportedUuid;
    }
    
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
      this.token = token;
    }
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
}
