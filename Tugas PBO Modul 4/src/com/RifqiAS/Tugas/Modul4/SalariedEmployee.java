package com.RifqiAS.Tugas.Modul4;

/** Code By Rifqi Akmal Saputra
 */

// Class SalariedEmployee yang mengextends class Employee
public class SalariedEmployee extends Employee{
    // Constructor yang memiliki parameter nama, nip, upah
    public SalariedEmployee(String nama, String nip, long upah) {
        super(nama, nip, upah);

        this.nama = nama;
        this.nip = nip;
        this.upah = upah;
    }

    // Ovveride method getGaji untuk mencetak total gaji/upah
    @Override
    public void getGaji() {
        System.out.println("Total gaji " + nama + " sebagai Salaried Employee" + " adalah " + "Rp. " + upah);
    }
}
