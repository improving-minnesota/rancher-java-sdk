package io.rancher.type;

import io.rancher.base.AbstractType;

public class ProcessPool extends AbstractType {
    
    private Integer activeTasks;
    
    private Integer completedTasks;
    
    private Integer maxPoolSize;
    
    private Integer minPoolSize;
    
    private String name;
    
    private Integer poolSize;
    
    private Integer queueRemainingCapacity;
    
    private Integer queueSize;
    
    private Integer rejectedTasks;
    
    public Integer getActiveTasks() {
        return this.activeTasks;
    }

    public void setActiveTasks(Integer activeTasks) {
      this.activeTasks = activeTasks;
    }
    
    public Integer getCompletedTasks() {
        return this.completedTasks;
    }

    public void setCompletedTasks(Integer completedTasks) {
      this.completedTasks = completedTasks;
    }
    
    public Integer getMaxPoolSize() {
        return this.maxPoolSize;
    }

    public void setMaxPoolSize(Integer maxPoolSize) {
      this.maxPoolSize = maxPoolSize;
    }
    
    public Integer getMinPoolSize() {
        return this.minPoolSize;
    }

    public void setMinPoolSize(Integer minPoolSize) {
      this.minPoolSize = minPoolSize;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Integer getPoolSize() {
        return this.poolSize;
    }

    public void setPoolSize(Integer poolSize) {
      this.poolSize = poolSize;
    }
    
    public Integer getQueueRemainingCapacity() {
        return this.queueRemainingCapacity;
    }

    public void setQueueRemainingCapacity(Integer queueRemainingCapacity) {
      this.queueRemainingCapacity = queueRemainingCapacity;
    }
    
    public Integer getQueueSize() {
        return this.queueSize;
    }

    public void setQueueSize(Integer queueSize) {
      this.queueSize = queueSize;
    }
    
    public Integer getRejectedTasks() {
        return this.rejectedTasks;
    }

    public void setRejectedTasks(Integer rejectedTasks) {
      this.rejectedTasks = rejectedTasks;
    }
    
}
