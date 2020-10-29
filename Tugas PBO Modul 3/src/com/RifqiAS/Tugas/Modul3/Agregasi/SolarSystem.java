package com.RifqiAS.Tugas.Modul3.Agregasi;

/** Code By Rifqi Akmal Saputra
 */

import java.util.ArrayList;
import java.util.List;

// Class SolarSystem
public class SolarSystem {
    // Deklarasi variabel
    private String id; // id bertipe data string
    private String nama; // nama bertipe data string

    // Deklarasi List Planet dengan tipe kelas Planet
    private List<Planet> planetList = new ArrayList<>();

    // Constructor yang memiliki parameter id dan nama
    public SolarSystem(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }
    // Method getter dan setter
    public int getTotalMember() {
        return getPlanets().size();
    }

    public List<Planet> getPlanets() {
        return planetList;

    }

    public void setPlanetList(List<Planet> planetList) {

        this.planetList = planetList;
    }

    public String getId() {

        return id;
    }

    public String getNama() {

        return nama;
    }

    // Method getData untuk mencetak output program
    public void getData() {
        System.out.println("ID Solar System\t\t: " + getId());
        System.out.println("Nama Solar System\t: " + getNama());
        System.out.println("Total Member\t\t: " + getTotalMember());
        System.out.println();
        for (Planet planet: planetList) {
            System.out.println("- ID Planet\t: " + planet.getIdPlanet() +
                        " \t-> Urutan Planet\t: " + planet.getUrutanPlanet() +
                        " \t-> Nama Planet\t: " + planet.getNamaPlanet());
        }
    }
}
