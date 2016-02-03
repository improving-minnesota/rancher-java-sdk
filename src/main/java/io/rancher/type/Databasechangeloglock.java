package io.rancher.type;

import io.rancher.base.AbstractType;

public class Databasechangeloglock extends AbstractType {
    
    private Boolean locked;
    
    private String lockedby;
    
    private String lockgranted;
    
    public Boolean getLocked() {
        return this.locked;
    }

    public void setLocked(Boolean locked) {
      this.locked = locked;
    }
    
    public String getLockedby() {
        return this.lockedby;
    }

    public void setLockedby(String lockedby) {
      this.lockedby = lockedby;
    }
    
    public String getLockgranted() {
        return this.lockgranted;
    }

    public void setLockgranted(String lockgranted) {
      this.lockgranted = lockgranted;
    }
    
}
