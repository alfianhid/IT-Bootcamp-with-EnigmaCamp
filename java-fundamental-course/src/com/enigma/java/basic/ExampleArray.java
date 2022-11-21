package com.enigma.java.basic;

import java.util.Scanner;

public class ExampleArray {

    public static void main(String[] args) {

        /**
         * Apa yang akan  dilakukan apabila kita akan menyimpan data lebih dari 1 ?
         * Dibawah ini contoh nya :
         */

//        String member = "Jack";
//        String member2 = "Sparrow";
//        String member3 = "Lina";
//        String member4 = "Brad";
//        String memebr5 = "Angeline";

        /**
         * Bayangkan jika data sudah mulai banyak ?
         * Maka muncul lah Array.
         * Array adalah sebuah variable tempat menyimpan data yang lebih dari 1, seperti di atas contohnya
         */

        // cara membuat sebuah array terdapat 3 macam :

        String[] members = {"Jack", "Sparrow", "Lina", "Brad", "Angeline"};
//        System.out.println(members[0]);
//        System.out.println(members[1]);
//        System.out.println(members[2]);
//        System.out.println(members[3]);
//        System.out.println(members[4]);

        String anotherMembers[] = {"Jack", "Sparrow", "Lina", "Brad", "Angeline"};

        String[] anotherMember = new String[5]; // index 0 - 4 | Isi array 5
        anotherMember[0] = "Jack";
        anotherMember[1] = "Sparrow";
        anotherMember[2] = "Lina";
        anotherMember[3] = "Brad";
        anotherMember[4] = "Angeline";

        // menggunakan for
//        for (int i = 0; i < anotherMember.length; i++) {
//            System.out.println("Member ke-" + i + " " + anotherMember[i]);
//        }

        /**
         * Pertanyaan nya bagaimana cara untuk menampilkan semua isi sebuah array tanpa mencetak satu persatu
         * Bisa menggunakan sebuah for atau forEach
         */

        // forEach
//        for (String member: members) {
//            System.out.println(member);
//        }

        /**
         * Buat lah sebuah variable languageProgramming yang di dapat menyimpan 5 buah bahasa pemrograman
         * Data yang disimpan berasal dari inputan
         */

        // Jawaban
        Scanner scanner = new Scanner(System.in);

        String languageProgrammings[] = new String[5];

        for (int i = 0; i < languageProgrammings.length; i++) {
            System.out.print("Bahasa pemrograman ke-" + i + ": ");
            languageProgrammings[i] = scanner.nextLine();
        }

        System.out.println("-------------------------------------");

        for (String item:languageProgrammings) {
            System.out.println(item);
        }

    }
}
