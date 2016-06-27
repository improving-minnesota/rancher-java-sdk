package io.rancher.type;

import io.rancher.base.AbstractType;

public class RestoreFromBackupInput extends AbstractType {
    
    private String backupId;
    
    public String getBackupId() {
        return this.backupId;
    }

    public void setBackupId(String backupId) {
      this.backupId = backupId;
    }
    
}
