package com.s;

// Main.java (Testing)
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", 2008, 45, "978-0134685991");

        BookPersistence persistence = new BookPersistence();
        persistence.saveToFile(book, "book.txt");

        BookPrinter printer = new BookPrinter();
        printer.printBookDetails(book);
    }
}
