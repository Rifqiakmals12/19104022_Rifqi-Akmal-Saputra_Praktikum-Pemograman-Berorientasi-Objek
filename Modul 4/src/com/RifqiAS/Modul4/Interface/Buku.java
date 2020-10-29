package com.RifqiAS.Modul4.Interface;

public class Buku {
    // Deklarasi variabel
    String judul, pengarang;
    long hargaBuku;

    // Constructor yang memiliki parameter judul, pengarang dan hargaBuku
    public Buku(String judul, String pengarang, long hargaBuku) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.hargaBuku = hargaBuku;
    }

    // Method cetakBuku untuk mencetak output program
    public void cetakBuku(){
        System.out.println("\nJudul\t\t: " + judul);
        System.out.println("Pengarang\t: " + pengarang);
        System.out.println("Harga Buku\t: " + hargaBuku);
        System.out.println();
    }
}
