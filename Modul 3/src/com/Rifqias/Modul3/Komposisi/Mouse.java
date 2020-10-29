package com.Rifqias.Modul3.Komposisi;

public class Mouse {
    // Deklarasi variabel
    private String merk;
    private String dpi;

    // Constractor yang memiliki parameter merk dan dpi
    public Mouse(String merk, String dpi) {
        this.merk = merk;
        this.dpi = dpi;
    }

    // Method printSpec untuk mencetak merk dan dpi mouse
    public void PrintSpec(){
        System.out.println("- Merk\t: " + merk);
        System.out.println("- DPI\t: " + dpi);
        System.out.println();
    }
}
