package com.enigma.java.basic;

public class PrimitiveDataType {

    public static void main(String[] args) {

        // primitive
        int age = 10;

        // non primitive
        Integer age2 = 100;

        Integer age3 = null; // default value primitive

        // conversion
        Integer agePrimitive = age;
        int ageNotPrimitive = age2;

        Integer ageObject = 29;
        short thisSort = ageObject.shortValue();
        long  thisLong = ageObject.longValue();

        System.out.println(thisSort);

        // primitive have a function
        String fullName = "Jution Candra Kirana";
        fullName.length();
    }
}
