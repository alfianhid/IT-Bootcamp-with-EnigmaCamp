package com.enigma.java.oop;

public class SquareWithAbstract extends Shape {

    private Double side;

    public SquareWithAbstract(Double side) {
        this.side = side;
    }

    @Override
    public Double getArea() {
        return this.side * this.side;
    }

    @Override
    public Double getPerimeter() {
        return 4 * this.side;
    }
}
