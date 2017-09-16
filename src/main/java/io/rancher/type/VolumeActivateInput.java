package io.rancher.type;

import io.rancher.base.AbstractType;

public class VolumeActivateInput extends AbstractType {
    
    private String hostId;
    
    public String getHostId() {
        return this.hostId;
    }

    public void setHostId(String hostId) {
      this.hostId = hostId;
    }
    
}
