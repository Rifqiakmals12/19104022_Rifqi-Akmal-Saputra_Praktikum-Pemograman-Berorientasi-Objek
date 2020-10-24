package com.RifqiAS.Modul2.Polimorfisme;

// Class DemoOverloading
public class DemoOverloading {
    public static void main(String[] args) {
        // Inisiasi objek lagu1 dan lagu2
        Lagu lagu1 = new Lagu("Gajah", "Tulus");
        Lagu lagu2 = new Lagu("Sewindu", "Tulus");

        lagu1.getDataLagu(); // Memanggil method getDatalagu
        System.out.println();
        lagu2.getDataLagu(); // Memanggil method getDatalagu
    }
}
