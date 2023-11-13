package com.sample;

import java.util.List;
import java.util.Set;

public class Store {
    private int id;
    private List<Book> booksInStock;
    private String workingHours;
    private String address;
    private Set<String> authorsInStock;
    private Set<String> genresInStock;
    private double exIncome;
    private boolean highIncome; 

    public Store(int id, List<Book> booksInStock, String workingHours, String address) {
        this.id = id;
        this.booksInStock = booksInStock;
        this.workingHours = workingHours;
        this.address = address;
    }
    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Book> getBooksInStock() {
        return booksInStock;
    }

    public void setBooksInStock(List<Book> booksInStock) {
        this.booksInStock = booksInStock;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getProfit() {
        double profit = 0;
        for (Book element : booksInStock) {
        	profit += element.getPrice()*element.getPopularity();
        }
        return profit;
    }
    
    public Set<String> getAuthorsInStock() {
        return authorsInStock;
    }

    public void setAuthorsInStock(Set<String> authorsInStock) {
        this.authorsInStock = authorsInStock;
    }
    
    public Set<String> getGenresInStock() {
        return genresInStock;
    }
    
    public void setGenresInStock(Set<String> genresInStock) {
        this.genresInStock = genresInStock;
    }

    public void setExIncome(double exIncome) {
        this.exIncome = exIncome;
    }
    
    public double getExIncome() {
        return exIncome;
    }
    
    public void setHighIncome(boolean highIncome) {
        this.highIncome = highIncome;
    }
    
    public boolean getHighIncome() {
        return highIncome;
    }
    
    @Override
    public String toString() {
    	String str = "";
    	if (highIncome) str = "(!high)";
    	StringBuilder result = new StringBuilder( 
        		"Store " + id + ":\n" +  
                address + '\n' +
                workingHours + '\n' +                                
                "Expected Income = " + exIncome + str + "\n" +
                "Authors in stock = " + authorsInStock + "\n" +
                "Genres in stock = " + genresInStock +	"\n");

              
        result.append("Books in stock: [");
        for (Book book : booksInStock) {
              result.append(book.getTitle()).append(", ");
        }        
        if (booksInStock.size() > 0)
        	result.delete(result.length() - 2, result.length());
        result.append("]");
        
        return result.toString();
    }

}
