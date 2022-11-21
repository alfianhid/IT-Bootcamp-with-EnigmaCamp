package com.enigma.java.basic;

import java.util.Scanner;

public class ExampleArrayMulti {

    public static void main(String[] args) {

//        String[][]  members = {
//                {"Jack", "+62721"},
//                {"Mila", "+67262"},
//                {"Robert", "+72821"}
//        };
//
//        // pemanggilan cara pertama
//        for (int i = 0; i < members.length; i++) {
//            System.out.println("Name: " + members[i][0]);
//            System.out.println("Contact: " + members[i][1]);
//            System.out.println("---------------------------");
//        };
//
//        // pemanggilan cara kedua menggunakan forEach
//        for (String[] member : members) {
//            System.out.println("Name: " + member[0]);
//            System.out.println("Contact: " + member[1]);
//            System.out.println("---------------------------");
//        }

        /**
         * Buat lah sebuah variabel array 2 dimensi yang menyimpan data customer (nama dan kota asal)
         */

        String[][] customers = new String[2][3];
        Scanner scanner = new Scanner(System.in);

        for (int row = 0; row < customers.length; row++) {
            for (int col = 0; col < customers[row].length; col++) {
                System.out.printf("Siapa nama customer yang akan di inputkan [%d, %d]: ", row, col);
                customers[row][col] = scanner.nextLine();
            }
        }

        System.out.println("-------------------------------------");
        for (int row = 0; row < customers.length; row++) {
            for (int col = 0; col < customers[row].length; col++) {
                System.out.format("| %s | \t", customers[row][col]);
            }
            System.out.println("");
        }

        System.out.println("-------------------------------------");
    }
}
