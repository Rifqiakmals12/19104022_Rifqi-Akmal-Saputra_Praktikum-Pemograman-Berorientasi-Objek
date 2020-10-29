package com.RifqiAS.Tugas.Modul3.Asosiasi;

/** Code By Rifqi Akmal Saputra
 */

import java.util.ArrayList;

// Class Komplek
public class Komplek {
    // Deklarasi variabel
    private String idKomplek; // idKomplek bertipe data string
    private String namaKomplek; // namaKomplek bertipe data string
    private int jmlRumah = 0; // jmlRumah bertipe data integer
    private ArrayList<String> idRumah = new ArrayList<String>(); // idRumah bertipe data string

    // Constructor yang memiliki parameter idKomplek dan namaKomplek
    public Komplek(String idKomplek, String namaKomplek) {
        this.idKomplek = idKomplek;
        this.namaKomplek = namaKomplek;
    }
    // Method addRumah dengan parameter idRumah
    public void addRumah(String idRumah) {
        this.idRumah.add(idRumah);
        jmlRumah = this.idRumah.size();
    }

    // Method getter dan setter idKomplek, namaKomplek, jmlRumah, dan idRumah
    public String getIdKomplek() {
        return idKomplek;
    }

    public void setIdKomplek(String idKomplek) {
        
        this.idKomplek = idKomplek;
    }

    public String getNamaKomplek() {
        
        return namaKomplek;
    }

    public void setNamaKomplek(String namaKomplek) {
        
        this.namaKomplek = namaKomplek;
    }

    public int getJmlRumah() {
        
        return jmlRumah;
    }

    public void setJmlRumah(int jmlRumah) {
        
        this.jmlRumah = jmlRumah;
    }

    public ArrayList<String> getIdRumah() {
        
        return idRumah;
    }

    public void setIdRumah (ArrayList<String>idRumah){
        
        this.idRumah = idRumah;
    }

    // Method getDataKomplek untuk mencetak output program
    public void getDataKompek() {
        System.out.println("ID Komplek\t\t: " + getIdKomplek());
        System.out.println("Nama Komplek\t: " + getNamaKomplek());
        System.out.println("Jumlah Rumah\t: " + getJmlRumah());

        for (int i = 0; i < jmlRumah; i++) {
            System.out.println((i+1) + ". " + getIdRumah().get(i));

        }
    }
}

