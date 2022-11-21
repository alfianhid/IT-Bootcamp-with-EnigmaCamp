package com.enigma.java.oop;

public class RectangleWithAbstract extends Shape {

    private Double length;
    private Double width;

    public RectangleWithAbstract(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Double getArea() {
        return this.length * this.width;
    }

    @Override
    public Double getPerimeter() {
        return 2*(this.length * this.width);
    }

    @Override
    public String toString() {
        return "RectangleWithAbstract{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
