package com.Rifqias.Modul3.Asosiasi;

public class Dosen {
    // Deklarasi Variabel
    private String kodeDosen;
    private int nimMHS[] = new int[100];
    private int jmlMahasiswa;

    // Constractor Kosong
    public Dosen() {
    }

    // Getter dan Setter
    public String getKodeDosen() {
        return kodeDosen;
    }

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public int getJmlMahasiswa() {
        return jmlMahasiswa;
    }

    public int getNimMhs(int indeks){
        return (nimMHS[indeks]);
    }

    public void setNimMhs(int nim){
        nimMHS[jmlMahasiswa] = nim;
        jmlMahasiswa++;
    }
}
