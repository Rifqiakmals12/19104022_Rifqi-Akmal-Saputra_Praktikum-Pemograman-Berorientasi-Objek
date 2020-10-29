package com.RifqiAS.Tugas.Modul4;

/** Code By Rifqi Akmal Saputra
 */

// Class Abstract Employee
public abstract class Employee {
    // Deklarasi variabel
    public String nama; // nama bertipe data string
    public String nip; // nip bertipe data string
    public long upah; // upah bertipe data long
    public long komisi; // komisi bertipe data long
    public int totalPenjualan; // totalPenjualan bertipe data integer
    public int totalProjek; // totalProject bertipe data integer

    // Constructor yang memiliki parameter nama, nip, upah, komisi, totalPenjualan, totalProjek
    Employee(String nama, String nip, long upah, long komisi, int totalPenjualan, int totalProjek) {
        this.nama = nama;
        this.nip = nip;
        this.upah = upah;
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
        this.totalProjek = totalProjek;
    }

    public Employee(String nama, String nip, long upah) {
    }

    public abstract void getGaji();
}
