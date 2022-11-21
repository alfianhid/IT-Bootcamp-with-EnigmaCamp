package com.enigma.java.basic;

import java.util.Scanner;

public class ExampleInputOutput {

    public static void main(String[] args) {

        // Scanner & BufferedScanner (read file)
        // Scanner
        // menerima dan merekam hasil inputan (keybaord)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Biodata Mahasiswa");

        System.out.print("Masukkan Nama Anda : ");
        String fullName = scanner.nextLine(); // string

        System.out.print("Masukkan Umur Anda : ");
        int age = scanner.nextInt(); // number / int

        System.out.println("Nama kamu adalah = " + fullName + " dan umurmu adalah = " + age);

    }
}
