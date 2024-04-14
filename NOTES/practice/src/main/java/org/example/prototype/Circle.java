package org.example.prototype;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Circle is unique");
    }

    @Override
    void reset() {
        throw new UnsupportedOperationException("Reset not supported");
    }

}
