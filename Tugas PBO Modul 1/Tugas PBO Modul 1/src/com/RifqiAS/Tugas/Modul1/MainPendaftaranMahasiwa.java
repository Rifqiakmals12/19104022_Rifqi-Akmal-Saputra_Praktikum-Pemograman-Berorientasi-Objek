package com.RifqiAS.Tugas.Modul1;

import java.util.Scanner;

public class MainPendaftaranMahasiwa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("*** Pendaftaran Mahasiswa Baru IT Telkom Purwokerto ***");

        // Input nama lengkap
        System.out.print("Masukan Nama Lengkap\t: ");
        String nama = scan.nextLine();

        // Input tempat tanggal lahir
        System.out.print("Masukan TTL\t\t\t\t: ");
        String ttl = scan.nextLine();

        // Input alamat rumah
        System.out.print("Masukan Alamat\t\t\t: ");
        String alamat = scan.nextLine();

        // Input agama yang dianut
        System.out.print("Masukan Agama\t\t\t: ");
        String agama = scan.nextLine();

        // Input jenis kelamin
        System.out.print("Masukan Jenis Kelamin\t: ");
        String kelamin = scan.nextLine();
        System.out.println();
        // Input pilihan jurusan
        System.out.println("*** Fakultas Informatika ***");
        System.out.println("S1 Software Engineering");
        System.out.println("S1 Teknik Informatika");
        System.out.println("S1 Sistem Informasi");
        System.out.println("S1 Sains Data");
        System.out.println();

        System.out.println("*** Fakultas Teknik Telekomunikasi Dan Elektro  ***");
        System.out.println("S1 Teknik Telekomunikasi");
        System.out.println("S1 Teknik Elektro");
        System.out.println("S1 Biomedis");
        System.out.println("D3 Teknik Komunikasi");
        System.out.println();

        System.out.println("*** Fakultas Rekayasa Industri Dan Design ***");
        System.out.println("S1 Design Komunikasi Visual");
        System.out.println("S1 Teknik Industri");
        System.out.println("S1 Sistem Informasi");
        System.out.println();
        System.out.print("Masukan Pilihan Jurusan\t: ");
        String jurusan = scan.nextLine();

        // Input Email
        System.out.print("Masukan Email\t\t\t: ");
        String email = scan.nextLine();

        // Input Nomer HP
        System.out.print("Masukan Nomer HP\t\t: ");
        int hp = scan.nextInt();

        // Input nilai UTBK
        System.out.print("Masukan Nilai UTBK\t\t: ");
        int nilai = scan.nextInt();


        Mahasiswa mahasiswa = new Mahasiswa(nama, ttl, alamat, agama, kelamin, jurusan, email, hp, nilai); // Deklarasi Objek

        // Output Data Mahasiswa Baru IT Telkom Purwokerto
        System.out.println();
        System.out.println("*** Data Calon Mahasiswa IT Telkom Purwokerto ***");
        System.out.println("Nama\t\t\t : " + mahasiswa.nama);
        System.out.println("TTL\t\t\t\t : " + mahasiswa.ttl);
        System.out.println("Alamat\t\t\t : " + mahasiswa.alamat);
        System.out.println("Agama\t\t\t : " + mahasiswa.agama);
        System.out.println("Jenis Kelamin\t : " + mahasiswa.kelamin);
        System.out.println("Pilihan Jurusan\t : " + mahasiswa.pilJurusan);
        System.out.println("Nomer HP\t\t : " + mahasiswa.hp);
        System.out.println("Email\t\t\t : " + mahasiswa.email);
        System.out.println("Nilai UTBK\t\t : " + mahasiswa.nilaiUTBK);
        System.out.println("Terima Kasih Telah Melakukan Registrasi");
    }
}
