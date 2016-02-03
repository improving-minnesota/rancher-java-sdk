package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class AddOutputsInput extends AbstractType {
    
    private Map<String, Object> outputs;
    
    public Map<String, Object> getOutputs() {
        return this.outputs;
    }

    public void setOutputs(Map<String, Object> outputs) {
      this.outputs = outputs;
    }
    
}
