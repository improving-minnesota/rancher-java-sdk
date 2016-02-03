package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class ProcessExecution extends AbstractType {
    
    private Map<String, Object> log;
    
    private String processInstanceId;
    
    private String uuid;
    
    public Map<String, Object> getLog() {
        return this.log;
    }

    public void setLog(Map<String, Object> log) {
      this.log = log;
    }
    
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
      this.processInstanceId = processInstanceId;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
