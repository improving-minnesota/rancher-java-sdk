package io.rancher.type;

import io.rancher.base.AbstractType;

public class VmwarevsphereConfig extends AbstractType {
    
    private String boot2dockerUrl;
    
    private String computeIp;
    
    private String cpuCount;
    
    private String datacenter;
    
    private String datastore;
    
    private String diskSize;
    
    private String memorySize;
    
    private String network;
    
    private String password;
    
    private String pool;
    
    private String username;
    
    private String vcenter;
    
    public String getBoot2dockerUrl() {
        return this.boot2dockerUrl;
    }

    public void setBoot2dockerUrl(String boot2dockerUrl) {
      this.boot2dockerUrl = boot2dockerUrl;
    }
    
    public String getComputeIp() {
        return this.computeIp;
    }

    public void setComputeIp(String computeIp) {
      this.computeIp = computeIp;
    }
    
    public String getCpuCount() {
        return this.cpuCount;
    }

    public void setCpuCount(String cpuCount) {
      this.cpuCount = cpuCount;
    }
    
    public String getDatacenter() {
        return this.datacenter;
    }

    public void setDatacenter(String datacenter) {
      this.datacenter = datacenter;
    }
    
    public String getDatastore() {
        return this.datastore;
    }

    public void setDatastore(String datastore) {
      this.datastore = datastore;
    }
    
    public String getDiskSize() {
        return this.diskSize;
    }

    public void setDiskSize(String diskSize) {
      this.diskSize = diskSize;
    }
    
    public String getMemorySize() {
        return this.memorySize;
    }

    public void setMemorySize(String memorySize) {
      this.memorySize = memorySize;
    }
    
    public String getNetwork() {
        return this.network;
    }

    public void setNetwork(String network) {
      this.network = network;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
    
    public String getPool() {
        return this.pool;
    }

    public void setPool(String pool) {
      this.pool = pool;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
    public String getVcenter() {
        return this.vcenter;
    }

    public void setVcenter(String vcenter) {
      this.vcenter = vcenter;
    }
    
}
