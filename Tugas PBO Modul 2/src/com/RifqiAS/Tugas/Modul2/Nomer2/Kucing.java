package com.RifqiAS.Tugas.Modul2.Nomer2;

/** Code By Rifqi Akmal Saputra
 */

// Class Kucing yang mewarisi Class Binatang
public class Kucing extends Binatang {

    // Inisiasi variabel
    public String nama;
    public String meong;

    // Method getName untuk mencetak nama binatangnya
    public void getNama(){
        System.out.println("Nama Binatang\t: " + nama);
    }
    // Method terbang untuk mencetak kebiasaan hewan Kucing
    public void meong(){
        System.out.println("Tingkah Laku\t: " + meong);
    }
}
