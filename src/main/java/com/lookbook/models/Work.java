
package com.lookbook.models;

import java.util.HashMap;
import java.util.Map;

public class Work {

    private Id id;
    private BooksCount books_count;
    private RatingsCount ratings_count;
    private TextReviewsCount textReviewsCount;
    private OriginalPublicationYear original_publication_year;
    private OriginalPublicationMonth originalPublicationMonth;
    private OriginalPublicationDay originalPublicationDay;
    private String average_rating;
    private BestBook best_book;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Work() {
    }

    /**
     * 
     * @param originalPublicationMonth
     * @param textReviewsCount
     * @param id
     * @param average_rating
     * @param ratings_count
     * @param best_book
     * @param originalPublicationDay
     * @param original_publication_year
     * @param books_count
     */
    public Work(Id id, BooksCount books_count, RatingsCount ratings_count, TextReviewsCount textReviewsCount, OriginalPublicationYear originalPublicationYear, OriginalPublicationMonth originalPublicationMonth, OriginalPublicationDay originalPublicationDay, String averageRating, BestBook bestBook) {
        super();
        this.id = id;
        this.books_count = books_count;
        this.ratings_count = ratings_count;
        this.textReviewsCount = textReviewsCount;
        this.original_publication_year = original_publication_year;
        this.originalPublicationMonth = originalPublicationMonth;
        this.originalPublicationDay = originalPublicationDay;
        this.average_rating = average_rating;
        this.best_book = best_book;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public BooksCount getBooksCount() {
        return books_count;
    }

    public void setBooksCount(BooksCount books_count) {
        this.books_count = books_count;
    }

    public RatingsCount getRatingsCount() {
        return ratings_count;
    }

    public void setRatingsCount(RatingsCount ratings_count) {
        this.ratings_count = ratings_count;
    }

    public TextReviewsCount getTextReviewsCount() {
        return textReviewsCount;
    }

    public void setTextReviewsCount(TextReviewsCount textReviewsCount) {
        this.textReviewsCount = textReviewsCount;
    }

    public OriginalPublicationYear getOriginalPublicationYear() {
        return original_publication_year;
    }

    public void setOriginalPublicationYear(OriginalPublicationYear original_publication_year) {
        this.original_publication_year = original_publication_year;
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
        return average_rating;
    }

    public void setAverageRating(String average_rating) {
        this.average_rating = average_rating;
    }

    public BestBook getBestBook() {
        return best_book;
    }

    public void setBestBook(BestBook best_book) {
        this.best_book = best_book;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
