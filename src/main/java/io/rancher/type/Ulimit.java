package io.rancher.type;

import io.rancher.base.AbstractType;

public class Ulimit extends AbstractType {
    
    private Integer hard;
    
    private String name;
    
    private Integer soft;
    
    public Integer getHard() {
        return this.hard;
    }

    public void setHard(Integer hard) {
      this.hard = hard;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Integer getSoft() {
        return this.soft;
    }

    public void setSoft(Integer soft) {
      this.soft = soft;
    }
    
}
