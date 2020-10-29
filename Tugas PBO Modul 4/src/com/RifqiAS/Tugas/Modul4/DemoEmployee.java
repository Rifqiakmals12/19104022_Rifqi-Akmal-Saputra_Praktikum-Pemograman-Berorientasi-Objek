package com.RifqiAS.Tugas.Modul4;

/** Code By Rifqi Akmal Saputra
 */

// Class DemoEmployee
public class DemoEmployee {
    public static void main(String[] args) {

        // Inisiasi objek SalariedEmployee dan mengisi nilai masing - masing parameter
        SalariedEmployee salaried = new SalariedEmployee("Bambank Sayonara",
                "19104022",
                3000000);

        // Mencetak nama, nip, dan upah (Salaried Employee)
        System.out.println("*** Salaried Employee ***");
        System.out.println("Nama\t: " + salaried.nama);
        System.out.println("NIP\t\t: " + salaried.nip);
        System.out.println("Upah\t: " + "Rp. " + salaried.upah);

        // Method untuk mencetak total gaji/upah yang di dapat
        salaried.getGaji();

        System.out.println();

        // Inisiasi objek CommisionEmployee dan mengisi nilai masing - masing parameter
        CommisionEmployee commision = new CommisionEmployee("Asep Gorbacep",
                "19104096",
                3500000,
                1000000,
                100);

        // Mencetak nama, nip, upah, komisi, dan total penjualan (Commision Employee)
        System.out.println("*** Commision Employee ***");
        System.out.println("Nama\t\t\t: " + commision.nama);
        System.out.println("NIP\t\t\t\t: " + commision.nip);
        System.out.println("Upah\t\t\t: " + "Rp. " + commision.upah);
        System.out.println("Komisi\t\t\t: " + "Rp. " + commision.komisi);
        System.out.println("Total Penjualan\t: " + commision.totalPenjualan );

        // Method untuk mencetak total gaji/upah yang di dapat
        commision.getGaji();

        System.out.println();

        // Inisiasi objek Project Planner dan mengisi nilai masing - masing parameter
        ProjectPlanner planner = new ProjectPlanner("Cecep Setiawan",
                "19104099",
                5000000,
                1000000,
                10);

        // Mencetak nama, nip, upah, komisi, dan total projek (Project Planner)
        System.out.println("*** Project Planner ***");
        System.out.println("Nama\t\t\t: " + planner.nama);
        System.out.println("NIP\t\t\t\t: " + planner.nip);
        System.out.println("Upah\t\t\t: " + "Rp. " + planner.upah);
        System.out.println("Komisi\t\t\t: " + "Rp. " + planner.komisi);
        System.out.println("Total Projek\t: " + planner.totalProjek);

        // Method untuk mencetak total gaji/upah yang di dapat
        planner.getGaji();
    }
}
