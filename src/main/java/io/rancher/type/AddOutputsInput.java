package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;
import java.util.Map;

public class AddOutputsInput extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private Map<String, Object> outputs;
    
    public Map<String, Object> getOutputs() {
        return this.outputs;
    }

    public void setOutputs(Map<String, Object> outputs) {
      this.outputs = outputs;
    }
    
}
