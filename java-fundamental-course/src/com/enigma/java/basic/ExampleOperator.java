package com.enigma.java.basic;

public class ExampleOperator {

    public static void main(String[] args) {
        // arithmetic operator
//        int number1 = 15;
//        int number2 = 20;
//        int add = number1 + number2; // 35
//        int minus = number2 - number1; // 5
//        int multiply = number1 * number2;
//        int divide = number2 / number1;
//        int mod = number2 % number1;
//
//        System.out.println("Hasil penjumlahan = " + add);
//        System.out.println("Hasil pengurangan = " + minus);
//        System.out.println("Hasil perkalian = " + multiply);
//        System.out.println("Hasil pembagian = " + divide);
//        System.out.println("Hasil sisa bagi (mod) = " + mod);

        // unary operator == operator aritmatik [1 operand] => [+, -, ++, --]
//        System.out.println("Operator Unary");
//        int number = 5;
//        int result = +number; // nilai positif
//
//        int anotherNumber = 10;
//        int anotherResult = -anotherNumber; // nilai negatif
//        System.out.println(anotherResult);
//        System.out.println(++number);
//        System.out.println(--anotherNumber);
//
//        // relational operator
//        int a = 10;
//        int b = 5;
//        System.out.println(a == b);
//        System.out.println(a < b);
//        System.out.println(a > b);
//        System.out.println(a >= b);
//        System.out.println(a <= b);
//        System.out.println(a != b);

        System.out.println("Operator Conditional");
        int value = 4;
        int anotherValue = 5;
        System.out.println("Conditional AND");
        boolean result = value == 3 && anotherValue == 5;
        boolean anotherResult = value != 3 && anotherValue == 5;
        System.out.println("Hasil Operator AND pada syarat value == 3 dan anotherValue == 5 adalah " + result);
        System.out.println("Hasil Operator AND pada syarat value != 3 dan anotherValue == 5 adalah " + anotherResult);
        System.out.println();
        System.out.println("Conditional OR");
        result = value == 3 || anotherValue == 5;
        anotherResult = value != 3 || anotherValue != 5;
        System.out.println("Hasil Operator OR pada syarat value == 3 dan anotherValue == 5 adalah " + result);
        System.out.println("Hasil Operator OR pada syarat value != 3 dan anotherValue == 5 adalah " + anotherResult);
        System.out.println();

        System.out.println("Assigment Operator");
        int x = 100;
        x /= 5; // 100 / 5 = 100
        System.out.println("Hasil dari x = 100 - 100 adalah " + x);
    }
}
