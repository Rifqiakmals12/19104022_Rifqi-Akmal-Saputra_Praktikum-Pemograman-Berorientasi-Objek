package com.RifqiAS.Modul2.Overriding;

// Class DemoOverriding
public class DemoOverriding {
    public static void main(String[] args) {
        // Inisiasi objek X dan Y
        X supperClass = new X();
        Y subClass = new Y();

        // Memanggil method dari supperClass dan subClass
        supperClass.getValue("Mati Listrik");
        subClass.getValue("Mati Lampu");
    }
}
