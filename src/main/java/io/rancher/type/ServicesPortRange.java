package io.rancher.type;

import io.rancher.base.AbstractType;

public class ServicesPortRange extends AbstractType {
    
    private Integer endPort;
    
    private Integer startPort;
    
    public Integer getEndPort() {
        return this.endPort;
    }

    public void setEndPort(Integer endPort) {
      this.endPort = endPort;
    }
    
    public Integer getStartPort() {
        return this.startPort;
    }

    public void setStartPort(Integer startPort) {
      this.startPort = startPort;
    }
    
}
