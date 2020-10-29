package com.RifqiAS.Modul4.Abstrak;

public class Anjing extends Binatang {
    // Deklarasi variabel
    private String nama;

    // Constructor yang memiliki parameter nama
    public Anjing(String nama) {
        super("Anjing");
        this.nama = nama;
    }

    // Override suara
    @Override
    protected void suara() {
        System.out.println("Gug Gug");
    }

    // Override toString
    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }

}
