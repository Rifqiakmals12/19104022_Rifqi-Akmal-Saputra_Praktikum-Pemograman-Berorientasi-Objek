package com.RifqiAS.Modul4.Abstrak;

public class Kucing extends Binatang{
    // Deklarasi variabel
    private String nama;

    // Constructor yang memiliki parameter nama
    public Kucing(String nama) {
        super("Kucing");
        this.nama = nama;
    }

    // Override suara
    @Override
    protected void suara() {
        System.out.println("Meong");
    }

    // Override toString
    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }
}
