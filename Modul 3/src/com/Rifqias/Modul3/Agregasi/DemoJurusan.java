package com.Rifqias.Modul3.Agregasi;

import java.util.ArrayList;
import java.util.List;

public class DemoJurusan {
    public static void main(String[] args) {
        // Inisiasi objek jurusan
        Jurusan jurusan = new Jurusan("2110", "Software Engineering");

        // Inisiasi objek mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Bambank", 19104022);
        Mahasiswa mahasiswa2 = new Mahasiswa("Suryono", 19104096);
        Mahasiswa mahasiswa3 = new Mahasiswa("Odading", 19104099);

        // List mahasiswa dari kelas demo
        List<Mahasiswa> mahasiswaList = new ArrayList<>();

        // Menambahkan data kedalam list menggunakan method add
        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(mahasiswa2);
        mahasiswaList.add(new Mahasiswa("Cecep", 19104098));

        // Untuk mengcopy data dari list mahasiswa class "demoJurusan" ke class "Jurusan
        jurusan.setMahasiswaList(mahasiswaList);

        // Untuk memasukan data mahasiswa langsung ke class jurusan
        jurusan.addMahasiswa(mahasiswa3);

        // Memanggil method print data jurusan untuk mencetak output program
        jurusan.printDataJurusan();
    }
}
