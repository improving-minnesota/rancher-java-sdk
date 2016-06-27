package io.rancher.type;

import io.rancher.base.AbstractType;

public class RevertToSnapshotInput extends AbstractType {
    
    private String snapshotId;
    
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
      this.snapshotId = snapshotId;
    }
    
}
