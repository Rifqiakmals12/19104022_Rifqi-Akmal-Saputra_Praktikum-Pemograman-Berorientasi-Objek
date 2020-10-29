package com.Rifqias.Modul3.Komposisi;

public class Monitor {
    // Deklarasi variabel
    private String merk;
    private String size;
    private String refreshRate;

    // Constructor yang memiliki parameter merk, size, dan refresh rate
    public Monitor(String merk, String size, String refreshRate) {
        this.merk = merk;
        this.size = size;
        this.refreshRate = refreshRate;
    }

    // Method printSpec untuk mencetak merk, size dan refresh rate monitor
    public void PrintSpec(){
        System.out.println("- Merk\t\t\t: " + merk);
        System.out.println("- Size\t\t\t: " + size);
        System.out.println("- Refresh Rate\t: " + refreshRate + "Hz");
        System.out.println();
    }
}
