package com.d;

import java.io.StringReader;
import java.io.StringWriter;

public class Test {
    public static void main(String[] args) {
        // Create dependencies
        StringReader stringReader = new StringReader("Hello, Dependency Injection!");
        StringWriter stringWriter = new StringWriter();

        // Inject dependencies into StringProcessor
        StringProcessor processor = new StringProcessor(stringReader, stringWriter);

        // Use the processor
        processor.printString();
    }
}