package io.rancher.type;

import io.rancher.base.AbstractType;

public class ScalePolicy extends AbstractType {
    
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
