package com.RifqiAS.Modul4.Interface;

public class DemoInterface {
    public static void main(String[] args) {
        // Deklarasi Paket
        Paket paket = new Paket("PBO",
                "Bagus",
                90000,
                "888 mb",
                85000);

        // Memanggil method hitungHargaPaket
        paket.hitungHargaPaket();
        // Memanggil method cetakPaket
        paket.cetakPaket();
    }
}
