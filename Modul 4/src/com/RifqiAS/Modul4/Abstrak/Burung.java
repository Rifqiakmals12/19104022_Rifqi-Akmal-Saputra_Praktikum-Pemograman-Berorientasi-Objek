package com.RifqiAS.Modul4.Abstrak;

public class Burung extends Binatang {
    // Deklarasi variabel
    private String nama;

    // Constructor yang memiliki parameter nama
    public Burung(String nama) {
        super("Burung");
        this.nama = nama;
    }

    // Override suara
    @Override
    protected void suara() {
        System.out.println("citcitcit");
    }

    // Override toString
    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }
 }

