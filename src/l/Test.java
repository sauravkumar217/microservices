package com.l;

public class Test {
    public static void useRectangle(Rectangle rectangle) {
        int width = 5;
        int height = 4;

        rectangle.setWidth(width);
        rectangle.setHeight(height);

        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
    }

    public static void main(String[] args) {
        System.out.println("Testing with Rectangle:");
        Rectangle rectangle = new Rectangle();
        useRectangle(rectangle);

        System.out.println("\nTesting with Square:");
        Rectangle square = new Square(0); // Create a Square as a Rectangle
        useRectangle(square); // This will show unexpected behavior
    }
}