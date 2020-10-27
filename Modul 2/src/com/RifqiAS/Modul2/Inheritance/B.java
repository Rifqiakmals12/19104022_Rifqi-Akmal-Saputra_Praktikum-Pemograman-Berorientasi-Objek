package com.RifqiAS.Modul2.Inheritance;

// Class B mewarisi Class A
public class B extends A{
    // Inisiasi variabel
    public int z;

    // Method sumValue
    public void sumValue(){
        System.out.println("Jumlah\t: " + (x + y + z));
    }

}
