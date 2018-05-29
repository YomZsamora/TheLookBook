
package com.lookbook.models;

import java.util.HashMap;
import java.util.Map;

public class Work {

    private Id id;
    private BooksCount booksCount;
    private RatingsCount ratingsCount;
    private TextReviewsCount textReviewsCount;
    private OriginalPublicationYear originalPublicationYear;
    private OriginalPublicationMonth originalPublicationMonth;
    private OriginalPublicationDay originalPublicationDay;
    private String averageRating;
    private BestBook bestBook;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public BooksCount getBooksCount() {
        return booksCount;
    }

    public void setBooksCount(BooksCount booksCount) {
        this.booksCount = booksCount;
    }

    public RatingsCount getRatingsCount() {
        return ratingsCount;
    }

    public void setRatingsCount(RatingsCount ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    public TextReviewsCount getTextReviewsCount() {
        return textReviewsCount;
    }

    public void setTextReviewsCount(TextReviewsCount textReviewsCount) {
        this.textReviewsCount = textReviewsCount;
    }

    public OriginalPublicationYear getOriginalPublicationYear() {
        return originalPublicationYear;
    }

    public void setOriginalPublicationYear(OriginalPublicationYear originalPublicationYear) {
        this.originalPublicationYear = originalPublicationYear;
    }

    public OriginalPublicationMonth getOriginalPublicationMonth() {
        return originalPublicationMonth;
    }

    public void setOriginalPublicationMonth(OriginalPublicationMonth originalPublicationMonth) {
        this.originalPublicationMonth = originalPublicationMonth;
    }

    public OriginalPublicationDay getOriginalPublicationDay() {
        return originalPublicationDay;
    }

    public void setOriginalPublicationDay(OriginalPublicationDay originalPublicationDay) {
        this.originalPublicationDay = originalPublicationDay;
    }

    public String getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }

    public BestBook getBestBook() {
        return bestBook;
    }

    public void setBestBook(BestBook bestBook) {
        this.bestBook = bestBook;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
