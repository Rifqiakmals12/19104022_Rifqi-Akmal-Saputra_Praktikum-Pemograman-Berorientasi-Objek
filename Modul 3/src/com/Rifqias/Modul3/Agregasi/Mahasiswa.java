package com.Rifqias.Modul3.Agregasi;

public class Mahasiswa {
    // Deklarasi variabel
    private String nama;
    private int nim;

    // Constructor yang parameternya berisi variabel nama dan nim
    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Getter nama dan nim
    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }
}
