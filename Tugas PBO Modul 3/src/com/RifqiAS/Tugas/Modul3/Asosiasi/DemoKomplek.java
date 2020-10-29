package com.RifqiAS.Tugas.Modul3.Asosiasi;

/** Code By Rifqi Akmal Saputra
 */

// Class DemoKomplek
public class DemoKomplek {
    public static void main(String[] args) {
        // Inisiasi objek komplek
        Komplek komplek = new Komplek("Residance 12", "Java");

        // Inisiasi objek rumah
        Rumah rumah1 = new Rumah("R-12", "Bambank Sayonara", 1);
        Rumah rumah2 = new Rumah("R-22", "Cecep Gorbacep", 4);
        Rumah rumah3 = new Rumah("R-34", "Asep Setiawan", 3);
        Rumah rumah4 = new Rumah("R-16", "Sunaryo Hasan", 6);
        Rumah rumah5 = new Rumah("R-25", "Budi Garcia", 2);

        // Memanggil method addRumah dari objek komplek dengan parameter idRumah
        komplek.addRumah(rumah1.getIdRumah());
        komplek.addRumah(rumah2.getIdRumah());
        komplek.addRumah(rumah3.getIdRumah());
        komplek.addRumah(rumah4.getIdRumah());
        komplek.addRumah(rumah5.getIdRumah());

        // Memanggil method getDataKomplek output program
        komplek.getDataKompek();

        }
    }


