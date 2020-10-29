package com.RifqiAS.Tugas.Modul3.Komposisi;

/** Code By Rifqi Akmal Saputra
 */

import java.util.ArrayList;

// Class DemoKeluarga
public class DemoKeluarga {
    public static void main(String[] args) {
        // Insiasi objek keluarga
        Keluarga keluarga = new Keluarga("Keluarga Cemara", "Purwokerto");

        // Deklarasi ArrayList Anak
        ArrayList<Anak> anakList = new ArrayList<>();

        // Memanggil method addAnggotaKeluarga dan menginisiasi data ayah, ibu, dan anak
        keluarga.addAnggotaKeluarga(new Ayah(1, "Bambank", 50),
                new Ibu(2, "Sayonara", 40),
                anakList);
        // Menambahkan objek anak kedalam anakList
        anakList.add(new Anak(3, "Cecep", 20,"Anak Kandung"));
        anakList.add(new Anak(4, "Gorbacep", 15,"Anak Kandung"));

        // Memanggil method getDataKeluarga output program
        keluarga.getDataKeluarga();
    }
}
