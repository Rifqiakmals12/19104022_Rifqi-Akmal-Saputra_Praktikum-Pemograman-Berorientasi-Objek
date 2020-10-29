package com.Rifqias.Modul3.Asosiasi;

public class DemoKuliah {
    public static void main(String[] args) {
        // Inisiasi objek mahasiswa 1
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Bambank");
        mahasiswa1.setNim(19104090);

        // Inisiasi objek mahasiswa 2
        Mahasiswa mahasiswa2 = new Mahasiswa(19104022, "Sayonara");

        // Inisiasi objek dosen
        Dosen dosen = new Dosen();
        dosen.setKodeDosen("ACW");
        dosen.setNimMhs(mahasiswa1.getNim());
        dosen.setNimMhs(mahasiswa2.getNim());

        // Mencetak output program
        System.out.println("Kode Dosen\t: " + dosen.getKodeDosen());
        System.out.println("Mengajar Mahasiswa\t: ");

        for (int i = 0; i < dosen.getJmlMahasiswa(); i++) {
            System.out.println("- " + dosen.getNimMhs(i));
        }
    }
}
