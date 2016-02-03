package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class ComposeConfigInput extends AbstractType {
    
    private List<String> serviceIds;
    
    public List<String> getServiceIds() {
        return this.serviceIds;
    }

    public void setServiceIds(List<String> serviceIds) {
      this.serviceIds = serviceIds;
    }
    
}
