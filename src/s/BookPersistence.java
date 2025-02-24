package com.s;

import java.io.FileWriter;
import java.io.IOException;

// BookPersistence.java
public class BookPersistence {
    public void saveToFile(Book book, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Book Name: " + book.getName() + "\n");
            writer.write("Author: " + book.getAuthorName() + "\n");
            writer.write("Year: " + book.getYear() + "\n");
            writer.write("Price: $" + book.getPrice() + "\n");
            writer.write("ISBN: " + book.getIsbn() + "\n");
        } catch (IOException e) {
            System.out.println("Error saving book: " + e.getMessage());
        }
    }
}
