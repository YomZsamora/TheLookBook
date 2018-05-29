
package com.lookbook.models;

import java.util.HashMap;
import java.util.Map;

public class Books {

    private GoodreadsResponse goodreadsResponse;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public GoodreadsResponse getGoodreadsResponse() {
        return goodreadsResponse;
    }

    public void setGoodreadsResponse(GoodreadsResponse goodreadsResponse) {
        this.goodreadsResponse = goodreadsResponse;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
