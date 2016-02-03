package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class ContainerExec extends AbstractType {
    
    private Boolean attachStdin;
    
    private Boolean attachStdout;
    
    private List<String> command;
    
    private Boolean tty;
    
    public Boolean getAttachStdin() {
        return this.attachStdin;
    }

    public void setAttachStdin(Boolean attachStdin) {
      this.attachStdin = attachStdin;
    }
    
    public Boolean getAttachStdout() {
        return this.attachStdout;
    }

    public void setAttachStdout(Boolean attachStdout) {
      this.attachStdout = attachStdout;
    }
    
    public List<String> getCommand() {
        return this.command;
    }

    public void setCommand(List<String> command) {
      this.command = command;
    }
    
    public Boolean getTty() {
        return this.tty;
    }

    public void setTty(Boolean tty) {
      this.tty = tty;
    }
    
}
