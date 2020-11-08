package com.RifqiAS.Modul5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// Class Try_Catch
public class Try_Catch {
    public static void main(String[] args) {
        // Inisiasi objek baru file yang berisi file paimon.txt
        File file = new File("/home/paimon.txt");

        // try
        try {
            // Inisiasi objek baru fileReader dengan memanggil objek file
            FileReader fileReader = new FileReader(file);
            // Pernyataan disini akan di eksekusi jika tidak terjadi Exception
            System.out.println("Read file berhasil");

        // catch
        } catch (FileNotFoundException e) {
            // Pernyataan disini akan di eksekusi jika terjadi Exception
            System.out.println("Gak ada filenya!");
        }
    }
}
