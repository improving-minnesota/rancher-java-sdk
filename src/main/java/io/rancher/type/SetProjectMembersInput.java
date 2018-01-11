package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;
import java.util.List;

public class SetProjectMembersInput extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private List<ProjectMember> members;
    
    public List<ProjectMember> getMembers() {
        return this.members;
    }

    public void setMembers(List<ProjectMember> members) {
      this.members = members;
    }
    
}
