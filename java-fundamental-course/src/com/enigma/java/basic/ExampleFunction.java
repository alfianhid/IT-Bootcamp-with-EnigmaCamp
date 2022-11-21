package com.enigma.java.basic;

public class ExampleFunction {

    /**
     * Pada Java pembuatan function / method ada beberapa cara,
     * tetapi intinya fungsi tsb apakah mempunyai nilai balikan atau tidak (void)
     */

    // cara ini, ketika kita panggil harus instance class dahulu
    void salamKenal() {
        System.out.println("Hai salam kenal semua.");
    }

    // cara ini dipanggil tanpa perlu instance class, karena static
    static void salamSapa() {
        System.out.println("Horas....");
    }

    // fungsi dengan sebuah parameter
    static void sebutNama(String name) {
        System.out.println("Nama kamu adalah " + name);
    }

    // fungsi dengan nilai balikan
    static int luasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    public static void main(String[] args) {
        ExampleFunction exampleFunction = new ExampleFunction();
        exampleFunction.salamKenal();

        salamSapa();

        sebutNama("Jution Candra Kirana");

        System.out.println("Luas peregi dengan panjang 10 adalah " + luasPersegi(10));
    }
}
