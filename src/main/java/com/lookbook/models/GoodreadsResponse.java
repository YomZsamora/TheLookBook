
package com.lookbook.models;

import java.util.HashMap;
import java.util.Map;

public class GoodreadsResponse {

    private Request request;
    private Search search;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
