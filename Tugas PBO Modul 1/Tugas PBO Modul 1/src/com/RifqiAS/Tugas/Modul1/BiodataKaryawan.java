package com.RifqiAS.Tugas.Modul1;

public class BiodataKaryawan {
    private static String nama = "Bambank Sayonara";
    private static String ttl = "Antartika, 12 Desember 2000";
    private static String alamat = "Jln. Kolonel Sugiono Kranji Purwokerto";
    private static String kelamin = "Laki-Laki";
    private static String status = "Belum Kawin";
    private static String riwayat= "S1 Software Engineering";
    private static String email = "bambank@gmail.com";
    private static String nomer = "08128594839";

    public static void main(String[] args) {

        // Output Biodata Karyawan PT Tadika Mesra
        System.out.println("*** Biodata Karyawan PT Tadika Mesra ***");
        System.out.println("Nama Lengkap\t\t : " + nama);
        System.out.println("TTL\t\t\t\t\t : " + ttl);
        System.out.println("Alamat\t\t\t\t : " + alamat);
        System.out.println("Jenis Kelamin\t\t : " + kelamin);
        System.out.println("Status Pernikahan\t : " + status);
        System.out.println("Pendidikan Terakhir\t : " + riwayat);
        System.out.println("Email\t\t\t\t : " + email);
        System.out.println("Nomer HP\t\t\t : " + nomer);
    }
}