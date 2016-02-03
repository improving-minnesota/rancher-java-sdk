package io.rancher.type;

import io.rancher.base.AbstractType;

public class IpAddressAssociateInput extends AbstractType {
    
    private String ipAddressId;
    
    public String getIpAddressId() {
        return this.ipAddressId;
    }

    public void setIpAddressId(String ipAddressId) {
      this.ipAddressId = ipAddressId;
    }
    
}
