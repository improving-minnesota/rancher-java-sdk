package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class ServiceLog extends AbstractType {
    
    private String accountId;
    
    private String created;
    
    private Map<String, Object> data;
    
    private String description;
    
    private String endTime;
    
    private String eventType;
    
    private String instanceId;
    
    private String kind;
    
    private String level;
    
    private String serviceId;
    
    private Boolean subLog;
    
    private String transactionId;
    
    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
      this.accountId = accountId;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public Map<String, Object> getData() {
        return this.data;
    }

    public void setData(Map<String, Object> data) {
      this.data = data;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
      this.endTime = endTime;
    }
    
    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
      this.eventType = eventType;
    }
    
    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
      this.instanceId = instanceId;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
      this.level = level;
    }
    
    public String getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(String serviceId) {
      this.serviceId = serviceId;
    }
    
    public Boolean getSubLog() {
        return this.subLog;
    }

    public void setSubLog(Boolean subLog) {
      this.subLog = subLog;
    }
    
    public String getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(String transactionId) {
      this.transactionId = transactionId;
    }
    
}
