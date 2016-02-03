package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class SetProjectMembersInput extends AbstractType {
    
    private List<ProjectMember> members;
    
    public List<ProjectMember> getMembers() {
        return this.members;
    }

    public void setMembers(List<ProjectMember> members) {
      this.members = members;
    }
    
}
