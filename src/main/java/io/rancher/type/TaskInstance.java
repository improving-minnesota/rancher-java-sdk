package io.rancher.type;

import io.rancher.base.AbstractType;

public class TaskInstance extends AbstractType {
    
    private String endTime;
    
    private String exception;
    
    private String name;
    
    private String serverId;
    
    private String startTime;
    
    private String taskId;
    
    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
      this.endTime = endTime;
    }
    
    public String getException() {
        return this.exception;
    }

    public void setException(String exception) {
      this.exception = exception;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getServerId() {
        return this.serverId;
    }

    public void setServerId(String serverId) {
      this.serverId = serverId;
    }
    
    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
      this.startTime = startTime;
    }
    
    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String taskId) {
      this.taskId = taskId;
    }
    
}
