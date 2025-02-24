package com.o;

import com.o.Book;
import com.o.BookPersistence;
import com.o.Invoice;
import com.o.InvoicePersistence;

public class PersistenceManager {
    private BookPersistence bookPersistence;
    private InvoicePersistence invoicePersistence;

    // Constructor with dependency injection
    public PersistenceManager(BookPersistence bookPersistence, InvoicePersistence invoicePersistence) {
        if (bookPersistence == null || invoicePersistence == null) {
            throw new IllegalArgumentException("Persistence implementations cannot be null");
        }
        this.bookPersistence = bookPersistence;
        this.invoicePersistence = invoicePersistence;
    }

    // Method to persist a book with null check
    public void persistBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        bookPersistence.save(book);
    }

    // Method to persist an invoice with null check
    public void persistInvoice(Invoice invoice) {
        if (invoice == null) {
            throw new IllegalArgumentException("Invoice cannot be null");
        }
        invoicePersistence.save(invoice);
    }

    // Main method to test the setup with improved error handling
    public static void main(String[] args) {
        try {
            // Configure persistence with database for books and file for invoices
            BookPersistence dbPersistence = new DatabasePersistence();
            InvoicePersistence fileInvoicePersistence = new InvoicePersistence() { // Direct implementation of InvoicePersistence
                @Override
                public void save(Invoice invoice) {
                    System.out.println("Saving invoice to file: " + invoice);
                }
            };

            PersistenceManager manager = new PersistenceManager(dbPersistence, fileInvoicePersistence);

            // Create and persist a book
            Book book = new Book("Java Microservices", 29.99);
            manager.persistBook(book);

            // Create and persist an invoice
            Invoice invoice = new Invoice(book, "INV001");
            manager.persistInvoice(invoice);
        } catch (Exception e) {
            System.err.println("Error in persistence setup: " + e.getMessage());
            e.printStackTrace();
        }
    }
}