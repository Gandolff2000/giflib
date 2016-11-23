package com.treehouse.giftlib.model;


import java.time.LocalDate;

public class Gif {
    private String name;
    private LocalDate dateUpload;
    private String username;
    private boolean favorite;

    public Gif(String name, LocalDate dateUpload, String username, boolean favorite) {
        this.name = name;
        this.dateUpload = dateUpload;
        this.username = username;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUpload() {
        return dateUpload;
    }

    public void setDateUpload(LocalDate dateUpload) {
        this.dateUpload = dateUpload;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
