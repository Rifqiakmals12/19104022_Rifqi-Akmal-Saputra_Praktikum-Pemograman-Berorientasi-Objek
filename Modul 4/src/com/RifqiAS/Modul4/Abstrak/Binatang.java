package com.RifqiAS.Modul4.Abstrak;

public abstract class Binatang {
    // Deklarasi variabel
    private String jenis;

    // Constructor yang memiliki parameter jenis
    public Binatang(String jenis) {
        this.jenis = jenis;
    }

    // Method abstract
    protected abstract void suara();

    // Override toString
    @Override
    public String toString() {
        return "Seekor " + jenis;
    }
}
