package io.rancher.type;

import io.rancher.base.AbstractType;

public class VmwarevcloudairConfig extends AbstractType {
    
    private String catalog;
    
    private String catalogitem;
    
    private String computeid;
    
    private String cpuCount;
    
    private String dockerPort;
    
    private String edgegateway;
    
    private String memorySize;
    
    private String orgvdcnetwork;
    
    private String password;
    
    private Boolean provision;
    
    private String publicip;
    
    private String sshPort;
    
    private String username;
    
    private String vdcid;
    
    public String getCatalog() {
        return this.catalog;
    }

    public void setCatalog(String catalog) {
      this.catalog = catalog;
    }
    
    public String getCatalogitem() {
        return this.catalogitem;
    }

    public void setCatalogitem(String catalogitem) {
      this.catalogitem = catalogitem;
    }
    
    public String getComputeid() {
        return this.computeid;
    }

    public void setComputeid(String computeid) {
      this.computeid = computeid;
    }
    
    public String getCpuCount() {
        return this.cpuCount;
    }

    public void setCpuCount(String cpuCount) {
      this.cpuCount = cpuCount;
    }
    
    public String getDockerPort() {
        return this.dockerPort;
    }

    public void setDockerPort(String dockerPort) {
      this.dockerPort = dockerPort;
    }
    
    public String getEdgegateway() {
        return this.edgegateway;
    }

    public void setEdgegateway(String edgegateway) {
      this.edgegateway = edgegateway;
    }
    
    public String getMemorySize() {
        return this.memorySize;
    }

    public void setMemorySize(String memorySize) {
      this.memorySize = memorySize;
    }
    
    public String getOrgvdcnetwork() {
        return this.orgvdcnetwork;
    }

    public void setOrgvdcnetwork(String orgvdcnetwork) {
      this.orgvdcnetwork = orgvdcnetwork;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
    
    public Boolean getProvision() {
        return this.provision;
    }

    public void setProvision(Boolean provision) {
      this.provision = provision;
    }
    
    public String getPublicip() {
        return this.publicip;
    }

    public void setPublicip(String publicip) {
      this.publicip = publicip;
    }
    
    public String getSshPort() {
        return this.sshPort;
    }

    public void setSshPort(String sshPort) {
      this.sshPort = sshPort;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
    public String getVdcid() {
        return this.vdcid;
    }

    public void setVdcid(String vdcid) {
      this.vdcid = vdcid;
    }
    
}
