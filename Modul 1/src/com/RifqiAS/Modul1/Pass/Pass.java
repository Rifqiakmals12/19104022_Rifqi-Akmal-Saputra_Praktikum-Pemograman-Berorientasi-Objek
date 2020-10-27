package com.RifqiAS.Modul1.Pass;

// Class main
public class Pass {
    public static void main(String [] args) {
        int nomer1, nomer2;

        TestPass passed;
        passed = new TestPass(50,100);
        nomer1 = 10;
        nomer2 = 20;

        // Passed by value
        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("Nomer1\t: " + nomer1);
        System.out.println("Nomer2\t: " + nomer2);

        passed.calculate(nomer1, nomer2);
        System.out.println("Nilai setelah passed by value\t: ");
        System.out.println("Nomer1\t: " + nomer1);
        System.out.println("Nomer2\t: " + nomer2);
        System.out.println();

        // Passed by reference
        System.out.println("Nilai sebelum passed by reference\t: ");
        System.out.println("Pased.Nomer1\t: " + passed.nomer1);
        System.out.println("Pased.Nomer2\t: " + passed.nomer2);

        passed.calculate(passed);
        System.out.println("Nilai setelah passed by reference\t: ");
        System.out.println("Passed.Nomer1\t: " + passed.nomer1);
        System.out.println("Passed.Nomer2\t: " + passed.nomer2);



    }
}
