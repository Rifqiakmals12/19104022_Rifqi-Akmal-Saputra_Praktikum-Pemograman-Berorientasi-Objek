package com.RifqiAS.Modul2.Inheritance;

// Class DemoInheritance
public class DemoInheritance {
    public static void main(String[] args) {
        // Inisiasi objek dari class A dan B
        A superclass = new A();
        B subclass = new B();

        // Memberikan nilai pada variabel dan memanggil method printXY
        System.out.println("Masukan data ke SuperClass :");
        superclass.x = 30;
        superclass.y = 50;
        superclass.printXY();

        // Memberikan nilai pada variabel dan memanggil method(printXY dan sumValue)
        subclass.x = 30;
        subclass.y = 40;
        subclass.z = 10;
        subclass.printXY();
        subclass.sumValue();
    }
}
