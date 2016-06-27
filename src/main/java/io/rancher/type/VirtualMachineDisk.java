package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class VirtualMachineDisk extends AbstractType {
    
    private String driver;
    
    private String name;
    
    private Map<String, Object> opts;
    
    private Integer readIops;
    
    private Boolean root;
    
    private String size;
    
    private Integer writeIops;
    
    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
      this.driver = driver;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Map<String, Object> getOpts() {
        return this.opts;
    }

    public void setOpts(Map<String, Object> opts) {
      this.opts = opts;
    }
    
    public Integer getReadIops() {
        return this.readIops;
    }

    public void setReadIops(Integer readIops) {
      this.readIops = readIops;
    }
    
    public Boolean getRoot() {
        return this.root;
    }

    public void setRoot(Boolean root) {
      this.root = root;
    }
    
    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
      this.size = size;
    }
    
    public Integer getWriteIops() {
        return this.writeIops;
    }

    public void setWriteIops(Integer writeIops) {
      this.writeIops = writeIops;
    }
    
}
