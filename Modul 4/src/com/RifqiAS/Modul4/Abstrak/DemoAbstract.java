package com.RifqiAS.Modul4.Abstrak;

import java.util.Random;

public class DemoAbstract {
    public static void main(String[] args) {
        // Array objek membuat objek peliharan dari kelas Binatang dengan isi value untuk kelas yang diwariskan
        Binatang [] binatangs = {
                new Burung("Kaka Tua"),
                new Kucing("Kampung"),
                new Anjing("Cihuahua")
        };

        // Membuat objek kesayangan dari kelas Binatang
        Binatang kesayangan;
        Random random = new Random();

        kesayangan = binatangs[random.nextInt(binatangs.length)];

        // Output program
        System.out.println("Binatang Kesayangan\t: " + kesayangan);
        System.out.print("Suaranya\t\t\t: ");
        kesayangan.suara();
    }
}
