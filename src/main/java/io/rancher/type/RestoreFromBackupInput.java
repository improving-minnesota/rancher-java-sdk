package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class RestoreFromBackupInput extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private String backupId;
    
    public String getBackupId() {
        return this.backupId;
    }

    public void setBackupId(String backupId) {
      this.backupId = backupId;
    }
    
}
