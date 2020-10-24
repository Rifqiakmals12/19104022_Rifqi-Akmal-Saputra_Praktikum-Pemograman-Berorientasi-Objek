package com.RifqiAS.Tugas.Modul1;

public class Mahasiswa {
    String nama, ttl, alamat, agama, kelamin, pilJurusan, email;
    int nilaiUTBK, hp;

    // Constractor
    public Mahasiswa(String nama, String ttl, String alamat, String agama, String kelamin, String pilJurusan, String email, int nilaiUTBK, int hp) {
        this.nama = nama;
        this.ttl = ttl;
        this.alamat = alamat;
        this.agama = agama;
        this.kelamin = kelamin;
        this.pilJurusan = pilJurusan;
        this.email = email;
        this.nilaiUTBK = nilaiUTBK;
        this.hp = hp;
    }
}