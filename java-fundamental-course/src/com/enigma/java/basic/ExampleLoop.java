package com.enigma.java.basic;

import java.util.Scanner;

public class ExampleLoop {

    public static void main(String[] args) {

        // for loop
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        // while
//        Scanner scanner = new Scanner(System.in);
//        boolean isStop = true;
//        while(isStop) {
//            String name = scanner.nextLine();
//            if(name.equals("jution")) {
//                isStop = false;
//            }
//        }

        // do while
//        int number = 1;
//        do {
//            System.out.println("Angka ke-"+number);
//            number++;
//        } while (number < 5);


        // example while
//        boolean running = true;
//        int counter = 0;
//        String jawab;
//        Scanner scan = new Scanner(System.in);
//
//        while( running ) {
//            System.out.println("Apakah anda ingin keluar?");
//            System.out.print("Jawab [ya/tidak]> ");
//
//            jawab = scan.nextLine();
//            // cek jawabnnya, kalau ya maka berhenti mengulang
//            if( jawab.equalsIgnoreCase("ya") ){
//                running = false;
//            }
//            counter++;
//        }
//        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");


        //nested for
        // membuat variabel
        int x, y;

        // melakukan parulang sebnayan x dan y kali
        for (x = 0; x <= 5; x++){
            for( y = 0; y <= 3; y++){
                System.out.format("Perulangan [x=%d, y=%d] %n", x, y);
            }
        }


    }


}
