package com.RifqiAS.Tugas.Modul2.Nomer1;

/** Code By Rifqi Akmal Saputra
 */

public class DemoClub {
    public static void main(String[] args) {

        // Inisiasi Objek
        Club club1 = new Club();
        Club club2 = new Club("Manchester United");
        Club club3 = new Club("Manchester United", "Manchester United Football Club adalah sebuah klub sepak bola Liga Inggris");
        Club club4 = new Club("Manchester United", 1878, "Old Traffod");
        Club club5 = new Club("Manchester United", 1878, "Old Traffod", 3, "Manchester United Football Club adalah sebuah klub sepak bola Liga Inggris");

        // Memanggil Method getTeam dari class Club
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}