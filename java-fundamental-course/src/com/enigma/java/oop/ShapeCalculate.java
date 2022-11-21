package com.enigma.java.oop;

public class ShapeCalculate {

    public Double sumArea(Shape[] shapes) {
        Double total = 0.0;
        for (Shape shape : shapes) {
            System.out.println("Luas = " + shape.getArea());
            total += shape.getArea();
        }
        return total;
    }
}
