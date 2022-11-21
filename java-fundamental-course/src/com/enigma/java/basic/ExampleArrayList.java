package com.enigma.java.basic;

import java.util.ArrayList;

public class ExampleArrayList {
    public static void main(String[] args) {

        /**
         * Kenapa ada ArrayList, sebenernya ini untuk menipulasi sebuah isi array yang tidak dapat di lakukan oleh array biasa
         * ArrayList bisa menerima banyak tipe data
         */

        ArrayList kulkas = new ArrayList();

        // isi kulkas
        kulkas.add("Daging Sapi");
        kulkas.add("Minuman");
        kulkas.add(100);
        kulkas.add(true);

        // menghapus isi kulkas
        kulkas.remove("Minuman");

        // menampilkan isi kulkas semua
        System.out.println(kulkas);

        // menampilkan isi kulkas 1 persata
        System.out.println(kulkas.get(0));
        System.out.println(kulkas.get(1));

        // jumlah isi dalam kulkas
        System.out.println(kulkas.size());
    }
}


