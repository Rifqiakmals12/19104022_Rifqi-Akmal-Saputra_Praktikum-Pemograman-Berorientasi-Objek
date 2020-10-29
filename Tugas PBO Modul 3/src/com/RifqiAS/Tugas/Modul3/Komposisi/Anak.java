package com.RifqiAS.Tugas.Modul3.Komposisi;

/** Code By Rifqi Akmal Saputra
 */

// Class Anak
public class Anak {

    // Deklarasi Variabel
    private int idAnak; // idAnak bertipe data integer
    private String namaAnak; // namaAnak bertipe data string
    private int umurAnak; // umurAnak bertipe data interger
    private String statusAnak; // statusAnak bertipe data string

    // Constractor yang memiliki parameter idAnak, namaAnak, umurAnak, dan statusAnak
    public Anak(int idAnak, String namaAnak, int umurAnak, String statusAnak) {
        this.idAnak = idAnak;
        this.namaAnak = namaAnak;
        this.umurAnak = umurAnak;
        this.statusAnak = statusAnak;
    }

    // Method getter IdAnak, NamaAnak, UmurAnak, dan statusAnak
    public int getIdAnak() {
        return idAnak;
    }

    public String getNamaAnak() {
        return namaAnak;
    }

    public int getUmurAnak() {
        return umurAnak;
    }

    public String getStatusAnak() {
        return statusAnak;
    }

}
