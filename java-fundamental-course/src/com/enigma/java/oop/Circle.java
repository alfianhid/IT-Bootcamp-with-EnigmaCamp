package com.enigma.java.oop;

public class Circle extends Shape {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return Constant.PHI * Math.pow(this.radius, 2);
    }

    @Override
    public Double getPerimeter() {
        return 2 * (Constant.PHI * this.radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
