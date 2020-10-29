package com.Rifqias.Modul3.Komposisi;

public class DemoComputer {
    public static void main(String[] args) {

        // Inisiasi objek
        Computer computer = new Computer("Gaming");
        Mouse mouse = new Mouse("Logitect", "1000");
        Keyboard keyboard = new Keyboard("Logitect", "1010");
        Monitor monitor = new Monitor("LG", "24", "144");
        Cpu cpu = new Cpu("Intel i9", "Nvidia Geforce 930", "16");

        // Memanggil method addComponent dari class computer
        computer.addComponent(keyboard, mouse, monitor, cpu);

        // Mencetak tipe komputer
        System.out.println("Type Computer\t: " + computer.getType());
        System.out.println();

        // Mencetak spesifikasi keyboard
        System.out.println("Keyboard\t: ");
        computer.getKeyboard().PrintSpec();

        // Mencetak spesifikasi mouse
        System.out.println("Mouse\t: ");
        computer.getMouse().PrintSpec();

        // Mencetak spesifikasi monitor
        System.out.println("Monitor\t: ");
        computer.getMonitor().PrintSpec();

        // Mencetak spesifikasi cpu
        System.out.println("Cpu\t: ");
        computer.getCpu().PrintSpec();
    }
}
