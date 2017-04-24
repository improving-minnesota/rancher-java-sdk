package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class ContainerLogs extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
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
