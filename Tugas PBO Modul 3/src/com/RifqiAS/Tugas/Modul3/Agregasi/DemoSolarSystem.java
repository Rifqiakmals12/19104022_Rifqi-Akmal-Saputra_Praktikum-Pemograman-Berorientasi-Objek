package com.RifqiAS.Tugas.Modul3.Agregasi;

/** Code By Rifqi Akmal Saputra
 */

import java.util.ArrayList;
import java.util.List;

// Class DemoSolarSystem
public class DemoSolarSystem {
    public static void main(String[] args) {
        // Inisiasi objek solarSystem
        SolarSystem solarSystem = new SolarSystem("222","Bima Sakti");

        // Inisiasi objek Planet
        Planet planet1 = new Planet(1, 1,"Merkurius");
        Planet planet2 = new Planet(2, 2,"Venus");
        Planet planet3 = new Planet(3, 3,"Bumi");
        Planet planet4 = new Planet(4, 4,"Mars");
        Planet planet5 = new Planet(5, 5,"Jupiter");
        Planet planet6 = new Planet(6, 6,"Saturnus");
        Planet planet7 = new Planet(7, 7,"Uranus");
        Planet planet8 = new Planet(8, 8,"Neptunus");

        // Deklarasi List Planet
        List<Planet> planetList = new ArrayList<>();

        // Menanbahkan objek planet 1-8 ke dalam planetList
        planetList.add(planet1);
        planetList.add(planet2);
        planetList.add(planet3);
        planetList.add(planet4);
        planetList.add(planet5);
        planetList.add(planet6);
        planetList.add(planet7);
        planetList.add(planet8);

        // Memanggil method setPlanetList dengan parameter planetList
        solarSystem.setPlanetList(planetList);

        // Memanggil method getData output program
        solarSystem.getData();
    }
}
