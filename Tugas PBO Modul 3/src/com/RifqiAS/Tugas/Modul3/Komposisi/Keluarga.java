package com.RifqiAS.Tugas.Modul3.Komposisi;

/** Code By Rifqi Akmal Saputra
 */

import java.util.ArrayList;

// Class Keluarga
public class Keluarga {
    // Deklarasi variabel dan objek
    private String namaKeluarga; // namaKeluarga bertipe data string
    private String kotaAsal; // kotaAsal bertipe data string
    private Ayah ayah;
    private Ibu ibu;

    // Deklarasi ArrayList Anak dengan tipe kelas Anak
    private ArrayList<Anak> anakList = new ArrayList<>();

    // Constractor nama keluarga dan kota asal
    public Keluarga(String namaKeluarga, String kotaAsal) {
        this.namaKeluarga = namaKeluarga;
        this.kotaAsal = kotaAsal;
    }

    // Method getter nama keluarga dan kota asal
    public String getNamaKeluarga() {

        return namaKeluarga;
    }

    public String getKotaAsal() {

        return kotaAsal;
    }

    // Method add anggota keluarga
    public void addAnggotaKeluarga(Ayah ayah, Ibu ibu, ArrayList<Anak> anakList) {
        this.ayah = ayah;
        this.ibu = ibu;
        this.anakList = anakList;
    }

    // Method getter ayah, ibu dan anak list
    public Ayah getAyah() {
        return ayah;
    }

    public Ibu getIbu() {
        return ibu;
    }

    public ArrayList<Anak> getAnakList() {

        return anakList;
    }

    // Method getDataKeluarga untuk mencetak output program
    public void getDataKeluarga() {
        // Data Nama dan Kota Asal keluarga
        System.out.println("Nama Keluarga\t: " + getNamaKeluarga());
        System.out.println("Kota Asal\t\t: " + getKotaAsal());
        System.out.println();

        // Data Ayah
        System.out.println("ID Ayah\t\t: " + getAyah().getIdAyah() + "\n" +
                "Nama Ayah\t: " + getAyah().getNamaAyah() + "\n" +
                "Umur Ayah\t: " + getAyah().getUmurAyah() + " Tahun");
        System.out.println();

        // Data Ibu
        System.out.println("ID Ibu\t\t: " + getIbu().getIdIbu() + "\n" +
                "Nama Ibu\t: " + getIbu().getNamaIbu() + "\n" +
                "Umur Ibu\t: " + getIbu().getUmurIbu() + " Tahun");
        System.out.println();

        // Data Jumlah Anak
        System.out.println("Jumlah Anak\t: " + getAnakList().size());
        System.out.println();

        // Data Anak
        for (Anak anak : anakList ) {
            System.out.println("ID Anak\t\t: " + anak.getIdAnak() + "\n" +
                    "Nama Anak\t: " + anak.getNamaAnak() + "\n" +
                    "Umur Anak\t: " + anak.getUmurAnak() + " Tahun" + "\n" +
                    "Status Anak\t: " + anak.getStatusAnak() + "\n");
        }
    }
}
