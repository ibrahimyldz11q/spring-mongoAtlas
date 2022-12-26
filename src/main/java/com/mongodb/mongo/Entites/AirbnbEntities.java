package com.mongodb.mongo.Entites;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "listingsAndReviews")
public class AirbnbEntities {

    @Id

    private int id;
    private String listing_url;
    private String name;
    private String summary;
    private String space;
    public AirbnbEntities
            (int id, String listing_url, String name, String summary, String space, String description, String notes) {
        this.id = id;
        this.listing_url = listing_url;
        this.name = name;
        this.summary = summary;
        this.space = space;
        this.description = description;
        this.notes = notes;
    }

    public AirbnbEntities(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getListing_url() {
        return listing_url;
    }

    public void setListing_url(String listing_url) {
        this.listing_url = listing_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    String description;
    String notes;


}
