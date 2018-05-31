
package com.lookbook.models;

import java.util.HashMap;
import java.util.Map;

public class BestBook {

    private String type;
    private Id_ id;
    private String title;
    private Author author;
    private String image_url;
    private String small_image_url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public BestBook() {
    }

    /**
     * 
     * @param id
     * @param author
     * @param title
     * @param image_url
     * @param small_image_url
     * @param type
     */
    public BestBook(String type, Id_ id, String title, Author author, String image_url, String small_image_url) {
        super();
        this.type = type;
        this.id = id;
        this.title = title;
        this.author = author;
        this.image_url = image_url;
        this.small_image_url = small_image_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Id_ getId() {
        return id;
    }

    public void setId(Id_ id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getImageUrl() {
        return image_url;
    }

    public void setImageUrl(String image_url) {
        this.image_url = image_url;
    }

    public String getSmallImageUrl() {
        return small_image_url;
    }

    public void setSmallImageUrl(String small_image_url) {
        this.small_image_url = small_image_url;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
