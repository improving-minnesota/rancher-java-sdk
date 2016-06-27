package io.rancher.type;

import io.rancher.base.AbstractType;

public class NfsConfig extends AbstractType {
    
    private String mountOptions;
    
    private String server;
    
    private String share;
    
    public String getMountOptions() {
        return this.mountOptions;
    }

    public void setMountOptions(String mountOptions) {
      this.mountOptions = mountOptions;
    }
    
    public String getServer() {
        return this.server;
    }

    public void setServer(String server) {
      this.server = server;
    }
    
    public String getShare() {
        return this.share;
    }

    public void setShare(String share) {
      this.share = share;
    }
    
}
