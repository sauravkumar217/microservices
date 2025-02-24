package com.d;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * A class that processes strings using dependency injection for StringReader and StringWriter.
 */
public class StringProcessor {
    private final StringReader stringReader;
    private final StringWriter stringWriter;

    /**
     * Constructor for StringProcessor using dependency injection.
     * @param stringReader The StringReader dependency to read strings.
     * @param stringWriter The StringWriter dependency to write strings.
     */
    public StringProcessor(StringReader stringReader, StringWriter stringWriter) {
        if (stringReader == null || stringWriter == null) {
            throw new IllegalArgumentException("StringReader and StringWriter cannot be null");
        }
        this.stringReader = stringReader;
        this.stringWriter = stringWriter;
    }

    /**
     * Reads a string from the StringReader and writes it to the StringWriter.
     */
    public void printString() {
        try {
            char[] buffer = new char[1024];
            int charsRead = stringReader.read(buffer);
            if (charsRead > 0) {
                stringWriter.write(buffer, 0, charsRead);
            }
            System.out.println("Processed string: " + stringWriter.toString());
        } catch (IOException e) {
            throw new RuntimeException("Error processing string: " + e.getMessage(), e);
        }
    }
}