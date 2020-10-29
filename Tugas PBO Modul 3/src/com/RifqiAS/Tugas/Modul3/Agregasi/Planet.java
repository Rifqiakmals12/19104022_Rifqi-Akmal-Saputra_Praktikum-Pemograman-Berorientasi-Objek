package com.RifqiAS.Tugas.Modul3.Agregasi;

/** Code By Rifqi Akmal Saputra
 */

// Class Planet
public class Planet {
    // Deklarasi variabel
    private int idPlanet; // idPlanet bertipe data integer
    private int urutanPlanet; // urutanPlanet bertipe data integer
    private String namaPlanet; // namaPlanet bertipe data string

    // Constructor yang memiliki parameten idPlanet, urutanPlanet, dan namaPlanet
    public Planet(int idPlanet, int urutanPlanet, String namaPlanet) {
        this.idPlanet = idPlanet;
        this.urutanPlanet = urutanPlanet;
        this.namaPlanet = namaPlanet;
    }

    // Method setter id planet, urutan planet dan nama planet
    public void setIdPlanet(int idPlanet) {
        this.idPlanet = idPlanet;
    }

    public void setUrutanPlanet(int urutanPlanet) {
        this.urutanPlanet = urutanPlanet;
    }

    public void setNamaPlanet(String namaPlanet) {
        this.namaPlanet = namaPlanet;
    }

    // Method getter id planet, urutan planet, dan nama planet
    public int getIdPlanet() {
        return idPlanet;
    }

    public int getUrutanPlanet() {
        return urutanPlanet;
    }

    public String getNamaPlanet() {
        return namaPlanet;
    }
}
