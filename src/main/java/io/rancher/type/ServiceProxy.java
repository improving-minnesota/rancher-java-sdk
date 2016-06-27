package io.rancher.type;

import io.rancher.base.AbstractType;

public class ServiceProxy extends AbstractType {
    
    private Integer port;
    
    private String scheme;
    
    private String service;
    
    private String token;
    
    private String url;
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }
    
    public String getScheme() {
        return this.scheme;
    }

    public void setScheme(String scheme) {
      this.scheme = scheme;
    }
    
    public String getService() {
        return this.service;
    }

    public void setService(String service) {
      this.service = service;
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
