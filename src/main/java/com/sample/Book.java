package com.sample;

public class Book {
    private String title;
    private Genre genre;
    private Author author;
    private double price;
    private boolean modern;
    private double popularity;

    public Book(String title, Genre genre, Author author, double price) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.price = price;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public boolean isModern() {
        return modern;
    }

    public void setModern(boolean modern) {
        this.modern = modern;
    }
    
    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public double getPopularity() {
        return popularity;
    }
    
    @Override
    public String toString() {
    	String str = "";
    	if (modern) str = " Modern ";
        return '\"' + title + "\" by " + author.getName() + 
                ", Genre = " + str + genre.getTitle() +
                ", Price = " + price + 
                ", Popularity = " + popularity;
    }

}
