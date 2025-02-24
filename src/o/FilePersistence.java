package com.o;

public class FilePersistence implements BookPersistence {
    @Override
    public void save(Book book) {
        System.out.println("Saving to file: " + book);
    }
}