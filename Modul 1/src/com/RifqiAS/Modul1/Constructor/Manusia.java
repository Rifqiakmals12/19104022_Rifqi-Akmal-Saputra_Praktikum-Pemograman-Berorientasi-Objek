package com.RifqiAS.Modul1.Constructor;

public class Manusia {
    private String nama;
    private int umur;

    // Constructor pertama tanpa adanya parameter
    public Manusia(){}

    // Constructor kedua
    public Manusia(String nama) {
        this.nama = nama;
    }

    //Constructor ketiga
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
