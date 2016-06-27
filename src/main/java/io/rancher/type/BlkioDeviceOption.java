package io.rancher.type;

import io.rancher.base.AbstractType;

public class BlkioDeviceOption extends AbstractType {
    
    private Integer readBps;
    
    private Integer readIops;
    
    private Integer weight;
    
    private Integer writeBps;
    
    private Integer writeIops;
    
    public Integer getReadBps() {
        return this.readBps;
    }

    public void setReadBps(Integer readBps) {
      this.readBps = readBps;
    }
    
    public Integer getReadIops() {
        return this.readIops;
    }

    public void setReadIops(Integer readIops) {
      this.readIops = readIops;
    }
    
    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(Integer weight) {
      this.weight = weight;
    }
    
    public Integer getWriteBps() {
        return this.writeBps;
    }

    public void setWriteBps(Integer writeBps) {
      this.writeBps = writeBps;
    }
    
    public Integer getWriteIops() {
        return this.writeIops;
    }

    public void setWriteIops(Integer writeIops) {
      this.writeIops = writeIops;
    }
    
}
