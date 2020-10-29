package com.RifqiAS.Modul4.Interface;

public class CD {
    // Deklarasi variabel
    String ukuranCD;
    long hargaCD;

    // Constractor yang memiliki parameter ukuranCD dan hargaCD
    public CD(String ukuranCD, long hargaCD) {
        this.ukuranCD = ukuranCD;
        this.hargaCD = hargaCD;
    }

    // Getter HargaCD
    public long getHargaCD(){
        return hargaCD;
    }

    // Method cetakCD untuk mencetak output program
    public void cetakCD(){
        System.out.println("Ukuran CD\t: " + ukuranCD);
        System.out.println("Harga CD\t: " + hargaCD);
        System.out.println();
    }
}
