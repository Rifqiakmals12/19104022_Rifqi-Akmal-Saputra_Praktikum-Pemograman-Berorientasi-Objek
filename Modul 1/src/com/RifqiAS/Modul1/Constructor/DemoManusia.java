package com.RifqiAS.Modul1.Constructor;

public class DemoManusia {
    public static void main(String[] args) {

        Manusia arrayManusia[] = new Manusia[3];

        // Constructor Pertama
        Manusia manusia1 = new Manusia();
        manusia1.setNama("Saitama");
        manusia1.setUmur(20);

        Manusia manusia2 = new Manusia("Budi"); // Constructor kedua
        Manusia manusia3 = new Manusia("Cecep", 19); // Constructor ketiga

        arrayManusia[0] = manusia1;
        arrayManusia[1] = manusia2;
        arrayManusia[2] = manusia3;

        for (Manusia x : arrayManusia){
            System.out.println("Character ");
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Umur\t: " + x.getUmur());
        }
    }
}
