package com.Rifqias.Modul3.Komposisi;

public class Keyboard {
    // Deklarasi variabel
    private String merk;
    private String type;

    // Constructor yang memiliki parameter merk dan type
    public Keyboard(String merk, String type) {
        this.merk = merk;
        this.type = type;
    }

    // Method printSpec untuk mencetak merk dan type keyboard
    public void PrintSpec(){
        System.out.println("- Merk\t: " + merk);
        System.out.println("- Type\t: " + type);
        System.out.println();
    }

}
