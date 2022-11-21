package com.enigma.java.oop;

public class Block extends Rectangle {

    private Double height;

    public Block(Double length, Double width, Double height) {
        super(length, width); // refer to parent class => Rectangle Class
        this.height = height;
    }

    public Block() {
    }

    @Override
    public Double getSurface() {
        return 2*(this.length * this.width) + 2*(this.length * this.height) + 2*(this.height * this.width);
    }

}
