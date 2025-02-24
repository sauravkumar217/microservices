package com.l;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(int size) {
        super(size, size); // Both width and height are set to the same size
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // Ensure height matches width to maintain square properties
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height); // Ensure width matches height to maintain square properties
        super.setHeight(height);
    }
}