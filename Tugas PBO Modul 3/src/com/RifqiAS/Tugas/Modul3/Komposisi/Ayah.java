package com.RifqiAS.Tugas.Modul3.Komposisi;

/** Code By Rifqi Akmal Saputra
 */

// Class Ayah
public class Ayah {
    // Deklarasi variabel
    private int idAyah; // idAyah bertipe data integer
    private String namaAyah; // namaAyah bertipe data string
    private int umurAyah; // umurAyah bertipe data integer

    // Constractor yang memiliki parameter idAyah, namaAyah, dan umurAyah
    public Ayah(int idAyah, String namaAyah, int umurAyah) {
        this.idAyah = idAyah;
        this.namaAyah = namaAyah;
        this.umurAyah = umurAyah;
    }

    // Method getter IdAyah, NamaAyah, dan UmurAyah
    public int getIdAyah() {
        return idAyah;
    }

    public String getNamaAyah() {
        return namaAyah;
    }

    public int getUmurAyah() {
        return umurAyah;
    }

}
