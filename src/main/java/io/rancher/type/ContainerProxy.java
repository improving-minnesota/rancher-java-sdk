package io.rancher.type;

import io.rancher.base.AbstractType;

public class ContainerProxy extends AbstractType {
    
    private Integer port;
    
    private String scheme;
    
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
    
}
