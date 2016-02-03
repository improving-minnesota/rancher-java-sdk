package io.rancher.type;

import io.rancher.base.AbstractType;

public class VirtualboxConfig extends AbstractType {
    
    private String boot2dockerUrl;
    
    private String cpuCount;
    
    private String diskSize;
    
    private String hostonlyCidr;
    
    private String importBoot2dockerVm;
    
    private String memory;
    
    private Boolean noShare;
    
    public String getBoot2dockerUrl() {
        return this.boot2dockerUrl;
    }

    public void setBoot2dockerUrl(String boot2dockerUrl) {
      this.boot2dockerUrl = boot2dockerUrl;
    }
    
    public String getCpuCount() {
        return this.cpuCount;
    }

    public void setCpuCount(String cpuCount) {
      this.cpuCount = cpuCount;
    }
    
    public String getDiskSize() {
        return this.diskSize;
    }

    public void setDiskSize(String diskSize) {
      this.diskSize = diskSize;
    }
    
    public String getHostonlyCidr() {
        return this.hostonlyCidr;
    }

    public void setHostonlyCidr(String hostonlyCidr) {
      this.hostonlyCidr = hostonlyCidr;
    }
    
    public String getImportBoot2dockerVm() {
        return this.importBoot2dockerVm;
    }

    public void setImportBoot2dockerVm(String importBoot2dockerVm) {
      this.importBoot2dockerVm = importBoot2dockerVm;
    }
    
    public String getMemory() {
        return this.memory;
    }

    public void setMemory(String memory) {
      this.memory = memory;
    }
    
    public Boolean getNoShare() {
        return this.noShare;
    }

    public void setNoShare(Boolean noShare) {
      this.noShare = noShare;
    }
    
}
