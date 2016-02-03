package io.rancher.type;

import io.rancher.base.AbstractType;

public class LoadBalancerAppCookieStickinessPolicy extends AbstractType {
    
    private String cookie;
    
    private Integer maxLength;
    
    private String mode;
    
    private String name;
    
    private Boolean prefix;
    
    private Boolean requestLearn;
    
    private Integer timeout;
    
    public String getCookie() {
        return this.cookie;
    }

    public void setCookie(String cookie) {
      this.cookie = cookie;
    }
    
    public Integer getMaxLength() {
        return this.maxLength;
    }

    public void setMaxLength(Integer maxLength) {
      this.maxLength = maxLength;
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
    
    public Boolean getPrefix() {
        return this.prefix;
    }

    public void setPrefix(Boolean prefix) {
      this.prefix = prefix;
    }
    
    public Boolean getRequestLearn() {
        return this.requestLearn;
    }

    public void setRequestLearn(Boolean requestLearn) {
      this.requestLearn = requestLearn;
    }
    
    public Integer getTimeout() {
        return this.timeout;
    }

    public void setTimeout(Integer timeout) {
      this.timeout = timeout;
    }
    
}
