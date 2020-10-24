package com.RifqiAS.Tugas.Modul2.Nomer1;

/** Code By Rifqi Akmal Saputra
 */

// Class Club
public class Club {
    String nama;
    int tahunBerdiri;
    String stadion;
    int juaraUcl;
    String deskripsi;

    // Constructor 1 Parameter nya kosong
    public Club() {

    }

    // Constractor 2 yang berisi 1 parameter (nama)
    public Club(String nama) {
        this.nama = nama;
    }

    // Constractor 3 yang berisi 2 parameter (nama, deskripsi)
    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    // Constractor 4 yang berisi 3 parameter (nama, tahunBerdiri, stadion)
    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }

    // Constractor 5 yang berisi 5 parameter (nama, tahunBerdiri, stadion, juaraUcl, deskripsi)
    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    // Method getTeam
    public void getTeam(){
        System.out.println("Nama Club\t\t: " + nama);
        System.out.println("Tahun Berdiri\t: " + tahunBerdiri);
        System.out.println("Nama Stadion\t: " + stadion);
        System.out.println("Juara UCL\t\t: " + juaraUcl);
        System.out.println("Deskripsi Club\t: " + deskripsi);
    }
}
