package io.rancher.type;

import io.rancher.base.AbstractType;

public class ContainerLogs extends AbstractType {
    
    private Boolean follow;
    
    private Integer lines;
    
    public Boolean getFollow() {
        return this.follow;
    }

    public void setFollow(Boolean follow) {
      this.follow = follow;
    }
    
    public Integer getLines() {
        return this.lines;
    }

    public void setLines(Integer lines) {
      this.lines = lines;
    }
    
}
