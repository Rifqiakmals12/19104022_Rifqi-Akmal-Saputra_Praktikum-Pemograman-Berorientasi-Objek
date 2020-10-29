package com.RifqiAS.Tugas.Modul4;

/** Code By Rifqi Akmal Saputra
 */

// Class ProjectPlanner yang mengextends class Employee
public class ProjectPlanner extends Employee {
    // Constructor yang memiliki parameter nama, nip, upah, komisi, dan totalProjek
    public ProjectPlanner(String nama, String nip, long upah, long komisi, int totalProjek) {

        super(nama, nip, upah, komisi, (int)0, totalProjek);
    }

    // Ovveride method getGaji untuk mencetak total gaji/upah
    @Override
    public void getGaji() {
        long pajak = (upah * 5) / 100;
        long gaji = upah + (komisi * totalProjek) - pajak;
        System.out.println("Total gaji " + nama + " sebagai Project Planner" + " adalah " + "Rp. " + gaji);
    }
}
