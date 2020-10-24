package com.RifqiAS.Tugas.Modul2.Nomer2;

/** Code By Rifqi Akmal Saputra
 */

// Class Burung yang mewarisi Class Binatang
public class Burung extends Binatang {

    // Inisiasi variabel
    public String nama;
    public String terbang;

    // Method getName untuk mencetak nama binatangnya
    public void getNama(){
        System.out.println("Nama Binatang\t: " + nama);
    }
    // Method terbang untuk mencetak kebiasaan hewan burung
    public void terbang(){
        System.out.println("Tingkah Laku\t: " + terbang);
    }
}
