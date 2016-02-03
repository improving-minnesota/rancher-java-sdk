package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class SetProjectMembersInput extends AbstractType {
    
    private List<Object> members;
    
    public List<Object> getMembers() {
        return this.members;
    }

    public void setMembers(List<Object> members) {
      this.members = members;
    }
    
}
