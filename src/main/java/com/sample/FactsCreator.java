package com.sample;

import java.util.ArrayList;
import java.util.List;

public class FactsCreator {

    public static List<Author> createAuthors() {
        List<Author> authors = new ArrayList<>();

        authors.add(new Author("George Orwell", "1903-1950", 90));
        authors.add(new Author("Jane Austen", "1775-1817", 60));
        authors.add(new Author("F. Scott Fitzgerald", "1896-1940", 98));
        authors.add(new Author("Taras Shevchenko", "1814-1861", 93));
        authors.add(new Author("Illarion Pavlyuk", "1980-", 88));
        authors.add(new Author("J.K. Rowling", "1965-", 95));
        authors.add(new Author("Harper Lee", "1926-2016", 50));
        authors.add(new Author("Agatha Christie", "1890-1976", 77));
        authors.add(new Author("J.R.R. Tolkien", "1892-1973", 85));
        authors.add(new Author("Virginia Woolf", "1882-1941", 44));

        return authors;
    }

    public static List<Genre> createGenres() {
        List<Genre> genres = new ArrayList<>();

        genres.add(new Genre("Fiction", 90));
        genres.add(new Genre("Romance", 95));
        genres.add(new Genre("Mystery", 80));
        genres.add(new Genre("Historical", 30));
        genres.add(new Genre("Magical Realism", 89));
        genres.add(new Genre("Fantasy", 95));
        genres.add(new Genre("Thriller", 91));
        genres.add(new Genre("Detective", 80));
        genres.add(new Genre("Adventure", 70));
        genres.add(new Genre("Modernist", 50));
        genres.add(new Genre("Ukrainian Poetry", 56));
        genres.add(new Genre("Contemporary", 75));

        return genres;
    }

    public static List<Book> createBooks(List<Author> authors, List<Genre> genres) {
        List<Book> books = new ArrayList<>();
        
        books.add(new Book("Animal Farm", genres.get(0), authors.get(0), 160.0));
        books.add(new Book("1984", genres.get(0), authors.get(0), 120.0));

        books.add(new Book("Sense and Sensibility", genres.get(1), authors.get(1), 80.0));
        books.add(new Book("Emma", genres.get(1), authors.get(1), 210.0));
        books.add(new Book("Pride and Prejudice", genres.get(1), authors.get(1), 220.0));

        books.add(new Book("The Beautiful and Damned", genres.get(2), authors.get(2), 95.75));
        books.add(new Book("Tender Is the Night", genres.get(2), authors.get(2), 212.50));
        books.add(new Book("The Great Gatsby", genres.get(2), authors.get(2), 200.0));
        
        books.add(new Book("Kobzar", genres.get(9), authors.get(3), 205.0));
        books.add(new Book("Haydamaky", genres.get(9), authors.get(3), 122.0));
        
        books.add(new Book("I see you are interested in the dark", genres.get(0), authors.get(4), 490.0));
        books.add(new Book("White Ash", genres.get(1), authors.get(4), 318.0));
        books.add(new Book("Dance of Bewilderment", genres.get(2), authors.get(4), 220.0));
        
        books.add(new Book("Harry Potter and the Philosopher's Stone", genres.get(5), authors.get(5), 320.0));
        books.add(new Book("Harry Potter and the Chamber of Secrets", genres.get(5), authors.get(5), 220.0));
        books.add(new Book("Harry Potter and the Prisoner of Azkaban", genres.get(5), authors.get(5), 324.0));
        books.add(new Book("Harry Potter and the Goblet of Fire", genres.get(5), authors.get(5), 236.0));
        books.add(new Book("Harry Potter and the Order of the Phoenix", genres.get(5), authors.get(5), 238.0));
        books.add(new Book("Harry Potter and the Half-Blood Prince", genres.get(5), authors.get(5), 330.60));
        books.add(new Book("Harry Potter and the Deathly Hallows", genres.get(5), authors.get(5), 332.0));
        
        books.add(new Book("To Kill a Mockingbird", genres.get(6), authors.get(6), 105.45));
        books.add(new Book("Go Set a Watchman", genres.get(6), authors.get(6), 170.0));
        books.add(new Book("To Set a Mockingbird", genres.get(6), authors.get(6), 210.0));
        
        books.add(new Book("Murder on the Orient Express", genres.get(7), authors.get(7), 221.0));
        books.add(new Book("And Then There Were None", genres.get(7), authors.get(7), 320.0));
        books.add(new Book("The Murder of Roger Ackroyd", genres.get(7), authors.get(7), 422.0));

        books.add(new Book("The Fellowship of the Ring", genres.get(8), authors.get(8), 215.0));
        books.add(new Book("The Two Towers", genres.get(8), authors.get(8), 265.0));
        books.add(new Book("The Return of the King", genres.get(8), authors.get(8), 527.0));
        books.add(new Book("The Hobbit", genres.get(8), authors.get(8), 499.99));

        books.add(new Book("To the Lighthouse", genres.get(9), authors.get(9), 250.0));
        books.add(new Book("Orlando", genres.get(9), authors.get(9), 319.0));
        books.add(new Book("Mrs Dalloway", genres.get(9), authors.get(9), 418.0));

        return books;
    }
    
    private static List<Book> generateBooksInStock(List<Book> books, int... bookIndices) {
        List<Book> booksInStock = new ArrayList<>();
        for (int index : bookIndices) {
            booksInStock.add(books.get(index));
        }
        return booksInStock;
    }
    
    public static List<Store> createStores(List<Book> books) {
        List<Store> stores = new ArrayList<>();

        stores.add(new Store(1, generateBooksInStock(books, 0, 2, 7, 10, 11, 14, 17, 18, 21, 24, 25), "9 AM - 6 PM", "123 Main St"));
        stores.add(new Store(2, generateBooksInStock(books, 1, 3, 8, 12, 13, 16, 19, 22, 26, 27, 28), "10 AM - 7 PM", "456 Oak St"));
        stores.add(new Store(3, generateBooksInStock(books, 2, 4, 9, 15, 20, 23, 29, 30, 31), "8 AM - 5 PM", "789 Elm St"));
        
        stores.add(new Store(4, generateBooksInStock(books, 5, 6, 19, 21, 23, 25, 28, 29), "11 AM - 8 PM", "567 Maple St"));
        stores.add(new Store(5, generateBooksInStock(books, 7, 8, 13, 14, 17, 18, 20, 22), "10 AM - 6 PM", "890 Pine St"));
        stores.add(new Store(6, generateBooksInStock(books, 0, 3, 10, 12, 15, 16, 26, 27, 30), "9 AM - 7 PM", "345 Birch St"));

        return stores;
    }
  
}
   
