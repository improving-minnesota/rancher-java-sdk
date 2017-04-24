package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class ScalePolicy extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private Integer increment;
    
    private Integer max;
    
    private Integer min;
    
    public Integer getIncrement() {
        return this.increment;
    }

    public void setIncrement(Integer increment) {
      this.increment = increment;
    }
    
    public Integer getMax() {
        return this.max;
    }

    public void setMax(Integer max) {
      this.max = max;
    }
    
    public Integer getMin() {
        return this.min;
    }

    public void setMin(Integer min) {
      this.min = min;
    }
    
}
