package com.sample;

public class Genre {
    private String title;
    private double popularity;

    public Genre(String title, double popularity) {
        this.title = title;
        this.popularity = popularity;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }
}
