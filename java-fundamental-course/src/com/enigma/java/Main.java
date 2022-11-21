package com.enigma.java;

import com.enigma.java.oop.*;

public class Main {

    public static void main(String[] args) {

        // create Car object and fill car constructor
        //Car avanza = new Car("Black", 0, 2021);

        // call car method
        //avanza.fillFuel(10);
        //avanza.fillFuel(5);
        //avanza.engineStart();

        // print result
        //System.out.println(avanza);
        /*
        Rectangle rectangle = new Rectangle(6.0, 2.0);
        System.out.println(rectangle.print());
        System.out.println("Luas = " + rectangle.getSurface());
        System.out.println("Keliling = " + rectangle.getAround());

        Block block = new Block(6.0, 4.0, 3.0);
        System.out.println(block.getSurface());

        // Can use child parent when this child extends to parent
        Rectangle block1 = new Block(10.0, 7.0, 5.0);
        System.out.println(block1.getSurface());

        // this casting from Object class
        Object block2 = new Block(10.0, 7.0, 5.0);
        Object rectangle2 = new Rectangle(6.0, 2.0);

        // other casting from String to Integer (Non Primitive)
        String number  = "5";
        System.out.println(Integer.parseInt(number));

        */

        // Object Interaction
        /*
        Hero luna = new Hero("Luna", 100, 10);
        System.out.println(luna);

        Hero abandon = new Hero("Abandon", 150, 100);
        System.out.println(abandon);

        Hero medusa = new Hero("Medusa", 200, 20);
        System.out.println(medusa);

        Hero razor = new Hero("Razor", 300, 20);

        // explain: abandon attack with baseDamage(20) and medusa's hp reduce as much as the opponent's damage
        abandon.attack(medusa);
        abandon.attack(medusa);
        abandon.attack(medusa);
        System.out.println(medusa);

        // medusa.getHeal(luna);
        // System.out.println(medusa);

        // explain: medusa adding luna's hp as much as medusa have
        // medusa.cure(luna);
        // System.out.println(medusa);
        // System.out.println(luna);

        */

        // Hands On -> Create class Monster and Make Hero attack Monster
        /*
        Hero abandon = new Hero("Abandon", 150, 20);

        Monster godzilla = new Monster("Godzilla", 100, 35);
        System.out.println(godzilla);

        // hero attack monster
        abandon.attack(godzilla);
        System.out.println(godzilla);
        */

        // Hands On -> Interface
        /*
        HeroWithInterface luna = new HeroWithInterface("Luna", 100, 10);
        System.out.println("Nyawa awal");
        System.out.println(luna);

        HeroWithInterface abandon = new HeroWithInterface("Abandon", 150, 100);
        System.out.println("Nyawa awal");
        System.out.println(abandon);

        luna.attack(abandon);
        System.out.println("Nyawa setelah diserang");
        System.out.println(abandon);
         */

        // Hands On -> Abstraction
        // Get SumArea
        RectangleWithAbstract rectangle = new RectangleWithAbstract(7.0, 8.0);
        SquareWithAbstract square = new SquareWithAbstract(7.0);
        Circle circle = new Circle(7.0);

        Shape[] shapes = {rectangle, square, circle};

        // call sumArea
        ShapeCalculate shapeCalculate = new ShapeCalculate();
        Double totalArea = shapeCalculate.sumArea(shapes);
        System.out.println("Total Luas Area = " + totalArea);

    }
}
