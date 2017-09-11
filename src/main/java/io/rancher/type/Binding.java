package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class Binding extends AbstractType {
    
    private Map<String, Object> services;
    
    public Map<String, Object> getServices() {
        return this.services;
    }

    public void setServices(Map<String, Object> services) {
      this.services = services;
    }
    
}
