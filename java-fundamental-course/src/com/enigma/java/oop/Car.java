package com.enigma.java.oop;

public class Car {

    private String color;
    private Integer fuel;
    private Integer year;

    // create a constructor with params
    public Car(String color, Integer fuel, Integer year) {
        this.color = color;
        this.fuel = fuel;
        this.year = year;
    }

    // create a constructor with no params
    public Car() {
    }

    // crate a method, when other class call this Car class must be call this method before method engineStart running
    public void fillFuel(int fuel) {
        this.fuel += fuel;
    }

    // create a method
    public void engineStart() {
        if(this.fuel > 0) {
            System.out.println("Breem breemm...");
        } else {
            System.out.println("Insufficient fuel");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fuel=" + fuel +
                ", year=" + year +
                '}';
    }
}
