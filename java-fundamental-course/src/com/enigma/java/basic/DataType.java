package com.enigma.java.basic;

public class DataType {

    public static void main(String[] args) {

        // Number Data Type
        byte byteDataType = 100;
        short shortDataType = 1000;
        int intDataType = 10000000;
        long longDataType = 1000000000;
        long longDataType2 = 1000000000L;
        float floatDataType = 10.10F;
        double doubleDataType = 22.07;

        // Decimal, Hex, Binary
        int decimalInt = 25;
        int hexInt = 0xA132B;
        int binInt = 0b01010101;

        // Underscore
        int amount = 1_000_000_000;

        // Number Data Type Conversion
        /**
         * 1. Widening Casting (automatically)
         * 2. Narrowing Casting (manual)
         */

        // byte thisByte = 10;
        // short thisShort = thisByte;

        short thisShort = (byte) 10;

        // Char
        char charDataType = 'A';
        char charDataType2 = 'B';

        // Boolean -> true | false
        boolean boolTrue = true;
        boolean boolFalse; // default boolean is false

        // String
        String bootcamp = "Enigma Camp";
        String bankName = "BNI";

        // String Concat
        String kampusMerdeka = bootcamp + " x " + bankName;
    }
}
