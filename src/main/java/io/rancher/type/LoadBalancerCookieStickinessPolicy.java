package io.rancher.type;

import io.rancher.base.AbstractType;

public class LoadBalancerCookieStickinessPolicy extends AbstractType {
    
    private String cookie;
    
    private String domain;
    
    private Boolean indirect;
    
    private String mode;
    
    private String name;
    
    private Boolean nocache;
    
    private Boolean postonly;
    
    public String getCookie() {
        return this.cookie;
    }

    public void setCookie(String cookie) {
      this.cookie = cookie;
    }
    
    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
      this.domain = domain;
    }
    
    public Boolean getIndirect() {
        return this.indirect;
    }

    public void setIndirect(Boolean indirect) {
      this.indirect = indirect;
    }
    
    public String getMode() {
        return this.mode;
    }

    public void setMode(String mode) {
      this.mode = mode;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Boolean getNocache() {
        return this.nocache;
    }

    public void setNocache(Boolean nocache) {
      this.nocache = nocache;
    }
    
    public Boolean getPostonly() {
        return this.postonly;
    }

    public void setPostonly(Boolean postonly) {
      this.postonly = postonly;
    }
    
}
