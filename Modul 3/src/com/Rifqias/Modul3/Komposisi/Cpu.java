package com.Rifqias.Modul3.Komposisi;

public class Cpu {
    // Deklarasi variabel
    private String processor;
    private String gpu;
    private String ram;

    // Constructor yang memiliki parameter processor, gpu, dan ram
    public Cpu(String processor, String gpu, String ram) {
        this.processor = processor;
        this.gpu = gpu;
        this.ram = ram;
    }
    // Method PrintSpec untuk mencetak spec laptop
    public void PrintSpec(){
        System.out.println("- Processor\t: " + processor);
        System.out.println("- GPU\t\t: " + gpu);
        System.out.println("- Ram\t\t: " + ram + "Gb");
        System.out.println();
    }
}
