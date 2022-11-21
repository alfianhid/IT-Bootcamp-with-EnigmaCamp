package com.enigma.java.oop;

public class Rectangle {

    protected Double length;
    protected Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public Double getSurface() {
        return this.length * this.width;
    }

    public Double getAround() {
        return 2*(this.length + this.width);
    }

    public String print() {
        return "Rectangle { length= " + length + " width= " + width + " }";
    }



}
