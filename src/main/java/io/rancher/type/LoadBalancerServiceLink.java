package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class LoadBalancerServiceLink extends AbstractType {
    
    private List<String> ports;
    
    private String serviceId;
    
    private String uuid;
    
    public List<String> getPorts() {
        return this.ports;
    }

    public void setPorts(List<String> ports) {
      this.ports = ports;
    }
    
    public String getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(String serviceId) {
      this.serviceId = serviceId;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
