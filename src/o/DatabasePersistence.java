package com.o;

public class DatabasePersistence implements BookPersistence {
    @Override
    public void save(Book book) {
        // Simulate saving to a database
        System.out.println("Saving to database: " + book);
    }
}