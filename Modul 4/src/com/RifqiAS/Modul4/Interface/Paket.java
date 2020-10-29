package com.RifqiAS.Modul4.Interface;

public class Paket extends Buku implements InterfaceCD {
    long hargaPaket;
    InterfaceCD interfaceCD;

    // Membuat cosntructor dengan paramater yang cukup lengkap yang didapat dari kelas lain
    public Paket(String judul,
                 String pengarang,
                 long hargaBuku,
                 String ukuranCD,
                 long hargaCD) {
        super(judul, pengarang, hargaBuku);
        interfaceCD = new ChildCD(ukuranCD, hargaCD);
    }

    // Override cetakCD
    @Override
    public void cetakCD() {
        interfaceCD.cetakCD();

    }

    // Override getHargaCD
    @Override
    public long getHargaCD() {
        return interfaceCD.getHargaCD();
    }

    // Method untuk menghitung harga paket
    public void hitungHargaPaket(){
        hargaPaket = super.hargaBuku + getHargaCD();
    }

    // Method untuk cetakPaket yang mengoutputkan total harga paket
    public void cetakPaket(){
        super.cetakBuku();
        cetakCD();
        System.out.println("Harga Paket Buku & CD\t: Rp." + hargaPaket);
        System.out.println();
    }
}
