package com.RifqiAS.Tugas.Modul4;

/** Code By Rifqi Akmal Saputra
 */

// Class CommisionEmployee yang mengextends class Employee
public class CommisionEmployee extends Employee {
    // Constructor yang memiliki parameter nama, nip, upah, komisi, dan totalPenjualan
    public CommisionEmployee (String nama, String nip, long upah, long komisi, int totalPenjualan) {

        super(nama, nip, upah, komisi, totalPenjualan, (int)0);
    }

    // Ovveride method getGaji untuk mencetak total gaji/upah
    @Override
    public void getGaji() {
        long gaji = upah + (komisi * totalPenjualan);
        System.out.println("Total gaji " + nama + " sebagai Commision Employee" + " adalah " + "Rp. " + gaji);
    }
}
