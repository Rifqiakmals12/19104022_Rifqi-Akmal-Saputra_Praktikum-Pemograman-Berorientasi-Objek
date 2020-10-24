package com.RifqiAS.Modul2.VMI;

// Class DemoVMI
public class DemoVMI {
    public static void main(String[] args) {
        // Inisiasi objek dari class Child dan Parent
        Child child = new Child();
        Parent parentChild = new Parent();

        // Memanggil method getData
        child.getData();
        parentChild.getData();
    }
}
