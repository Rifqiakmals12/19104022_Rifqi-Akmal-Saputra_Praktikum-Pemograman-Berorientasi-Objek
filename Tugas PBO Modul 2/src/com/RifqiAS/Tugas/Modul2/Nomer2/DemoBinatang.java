package com.RifqiAS.Tugas.Modul2.Nomer2;

/** Code By Rifqi Akmal Saputra
 */

// Class DemoBinatang
public class DemoBinatang {
    public static void main(String[] args) {

        // Inisiasi Objek Burung
        Burung burung = new Burung();
        burung.nama = "Burung Hantu";
        burung.makan = "Tikus";
        burung.tidur = "Burung Hantu Tidur Pada Siang Hari";
        burung.terbang = "Burung Hantu Terbang Menggunakan Sayap";

        // Memanggil Method
        System.out.println("\t\t\t*** BURUNG ***");
        burung.getNama();
        burung.binatang();
        burung.terbang();

        System.out.println();

        // Inisiasi Objek Ikan
        Ikan ikan = new Ikan();
        ikan.nama = "Ikan Hiu";
        ikan.makan = "Ikan Hiu Makan Ikan Kecil";
        ikan.tidur = "Ikan Hiu Tidur Pada Malam Hari";
        ikan.berenang = "Ikan Hiu Berenang Menggunakan Sirip";

        System.out.println();

        // Memanggil Method
        System.out.println("\t\t\t*** IKAN ***");
        ikan.getNama();
        ikan.binatang();
        ikan.berenang();

        System.out.println();

        // Inisiasi Objek Kucing
        Kucing kucing = new Kucing();
        kucing.nama = "Kucing Kapung";
        kucing.makan = "Kucing Kampung Makan Royal Canin";
        kucing.tidur = "Kucing Kampung Tidur Pada Malam Hari";
        kucing.meong = "Kucing Kampung Meong Saat Musim Kawin";

        // Memanggil Method
        System.out.println("\t\t\t*** KUCING ***");
        kucing.getNama();
        kucing.binatang();
        kucing.meong();
    }
}
