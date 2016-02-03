package io.rancher.type;

import io.rancher.base.AbstractType;

public class PublicEndpoint extends AbstractType {
    
    private String hostId;
    
    private String instanceId;
    
    private String ipAddress;
    
    private Integer port;
    
    private String serviceId;
    
    public String getHostId() {
        return this.hostId;
    }

    public void setHostId(String hostId) {
      this.hostId = hostId;
    }
    
    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
      this.instanceId = instanceId;
    }
    
    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
      this.ipAddress = ipAddress;
    }
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }
    
    public String getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(String serviceId) {
      this.serviceId = serviceId;
    }
    
}
