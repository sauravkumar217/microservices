package com.o;

public class Invoice {
    private Book book;
    private String invoiceId;

    public Invoice(Book book, String invoiceId) {
        this.book = book;
        this.invoiceId = invoiceId;
    }

    public Book getBook() {
        return book;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    @Override
    public String toString() {
        return "Invoice{invoiceId='" + invoiceId + "', book=" + book + "}";
    }
}