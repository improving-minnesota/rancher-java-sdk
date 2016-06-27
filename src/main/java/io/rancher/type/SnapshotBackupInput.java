package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class SnapshotBackupInput extends AbstractType {
    
    private String backupTargetId;
    
    private Map<String, Object> data;
    
    private String name;
    
    private String removeTime;
    
    public String getBackupTargetId() {
        return this.backupTargetId;
    }

    public void setBackupTargetId(String backupTargetId) {
      this.backupTargetId = backupTargetId;
    }
    
    public Map<String, Object> getData() {
        return this.data;
    }

    public void setData(Map<String, Object> data) {
      this.data = data;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getRemoveTime() {
        return this.removeTime;
    }

    public void setRemoveTime(String removeTime) {
      this.removeTime = removeTime;
    }
    
}
