package com.Rifqias.Modul3.Asosiasi;

public class Mahasiswa {
    // Deklarasi variabel
    private int nim;
    private String nama;

    // Constructor 1 (kosong)
    public Mahasiswa(){

    }

    // Constructor 2 (nim dan nama)
    public Mahasiswa(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    // Getter dan Setter
    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
