package io.rancher.type;

import io.rancher.base.AbstractType;

public class InstanceConsole extends AbstractType {
    
    private String kind;
    
    private String password;
    
    private String url;
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
}
