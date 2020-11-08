package com.RifqiAS.Tugas.Modul5;
/**
 * Code By Rifqi Akmal Saputra
 */

import java.util.InputMismatchException;
import java.util.Scanner;

// Class Pengunjung
public class Pengunjung {
    public static void main(String[] args) {
        // Insisiasi objek scanner
        Scanner scan = new Scanner(System.in);
        // Deklarasi array dan inisiasi panjang array 10
        int[] array = new int[10];

        System.out.println("**** Pelanggan Toko Berkah Jaya ****");
        // Input jumlah pengunjung toko Berkah Jaya
        System.out.print("Jumlah Pengunjung Toko\t: ");
        int jmlPengunjung = scan.nextInt();


        /**
         * Menginputkan Maks 10 pengunjung toko
         * Jika menginputkan jumlah pengunjung toko > 10 maka akan error,
         * maka perintah catch "Maksimal Jumlah Pengunjung 10" akan di jalankan
         */
        System.out.println("Masukkan Data Pengunjung\t: ");
        for (int i = 0; i < jmlPengunjung + 1; i++) {
            try {
                System.out.print("UID\t: ");
                array[i] = intInputMethod();
                System.out.println("Data ke-" + i + " : " + array[i] + " terdaftar");

                // Pernyataan disini akan di eksekusi jika terjadi Exception saat pengisian UID
            } catch (InputMismatchException e) {
                System.out.println("Inputkan Angka !!!");
                i--;

                // Pernyataan disini akan di eksekusi jika terjadi Exception saat jumlah pengunjung lebih dari 10
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Maksimal Jumlah Pengunjung 10");
            }
        }


        System.out.println();
        // Lihat data pengunjung toko Berkah Jaya
        System.out.println("Lihat Data Pengunjung\t: ");
        // Input indeks untuk mencari UID pengunjung
        System.out.print("Indeks\t: ");
        int lihatData = scan.nextInt();
        System.out.println("Data ke-" + lihatData + " : " + array[lihatData]);

        // Perulangan untuk melihat data indeks lagi
        boolean cek = false;
        do {
            // input jika ingin melihat lagi atau tidak
            System.out.print("Lihat Lagi? (y/n)\t: ");
            String lihat = scan.next();
            // Jika YA maka akan mengeksekusi program ini
            if (lihat.equals("y") || lihat.equals("Y")) {
                System.out.println("Lihat Data Pengunjung\t: ");
                System.out.print("Indeks\t: ");
                lihatData = scan.nextInt();
                System.out.println("Data ke-" + lihatData + " : " + array[lihatData]);

            // Jika tidak
            }else {
                cek = true;
            }
        }while (!cek);

    }

    // Method intInputMethod
    public static int intInputMethod () {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

}
