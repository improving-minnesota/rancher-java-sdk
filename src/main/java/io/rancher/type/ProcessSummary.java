package io.rancher.type;

import io.rancher.base.AbstractType;

public class ProcessSummary extends AbstractType {
    
    private Integer delay;
    
    private String processName;
    
    private Integer ready;
    
    private Integer running;
    
    public Integer getDelay() {
        return this.delay;
    }

    public void setDelay(Integer delay) {
      this.delay = delay;
    }
    
    public String getProcessName() {
        return this.processName;
    }

    public void setProcessName(String processName) {
      this.processName = processName;
    }
    
    public Integer getReady() {
        return this.ready;
    }

    public void setReady(Integer ready) {
      this.ready = ready;
    }
    
    public Integer getRunning() {
        return this.running;
    }

    public void setRunning(Integer running) {
      this.running = running;
    }
    
}
