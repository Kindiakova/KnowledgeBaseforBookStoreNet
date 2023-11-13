package com.sample;

public class Author {
    private String name;
    private String lifespan;
    private double popularity;
    
    private boolean modern;

    public Author(String name, String lifespan, double popularity) {
        this.name = name;
        this.lifespan = lifespan;
        this.popularity = popularity;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLifespan() {
        return lifespan;
    }

    public void setLifespan(String lifespan) {
        this.lifespan = lifespan;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }
    
    public boolean isModern() {
        return modern;
    }

    public void setModern(boolean modern) {
        this.modern = modern;
    }
    
    @Override
    public String toString() {
    	String str = "";
    	if (modern) str = "(modern) ";
        return  str + name + '(' + lifespan + ')' + 
                ", Popularity = " + popularity;                
    }
}
