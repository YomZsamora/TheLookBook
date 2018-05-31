
package com.lookbook.models;

import java.util.HashMap;
import java.util.Map;

public class Id__ {

    private String type;
    private String content;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Id__() {
    }

    /**
     * 
     * @param content
     * @param type
     */
    public Id__(String type, String content) {
        super();
        this.type = type;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return content;
    }

    public void setText(String content) {
        this.content = content;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
