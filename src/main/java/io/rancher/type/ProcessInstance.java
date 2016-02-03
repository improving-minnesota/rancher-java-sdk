package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class ProcessInstance extends AbstractType {
    
    private Map<String, Object> data;
    
    private String endTime;
    
    private String exitReason;
    
    private String phase;
    
    private Integer priority;
    
    private String processName;
    
    private String resourceId;
    
    private String resourceType;
    
    private String result;
    
    private String runningProcessServerId;
    
    private String startProcessServerId;
    
    private String startTime;
    
    public Map<String, Object> getData() {
        return this.data;
    }

    public void setData(Map<String, Object> data) {
      this.data = data;
    }
    
    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
      this.endTime = endTime;
    }
    
    public String getExitReason() {
        return this.exitReason;
    }

    public void setExitReason(String exitReason) {
      this.exitReason = exitReason;
    }
    
    public String getPhase() {
        return this.phase;
    }

    public void setPhase(String phase) {
      this.phase = phase;
    }
    
    public Integer getPriority() {
        return this.priority;
    }

    public void setPriority(Integer priority) {
      this.priority = priority;
    }
    
    public String getProcessName() {
        return this.processName;
    }

    public void setProcessName(String processName) {
      this.processName = processName;
    }
    
    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
      this.resourceId = resourceId;
    }
    
    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    
    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
      this.result = result;
    }
    
    public String getRunningProcessServerId() {
        return this.runningProcessServerId;
    }

    public void setRunningProcessServerId(String runningProcessServerId) {
      this.runningProcessServerId = runningProcessServerId;
    }
    
    public String getStartProcessServerId() {
        return this.startProcessServerId;
    }

    public void setStartProcessServerId(String startProcessServerId) {
      this.startProcessServerId = startProcessServerId;
    }
    
    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
      this.startTime = startTime;
    }
    
}
