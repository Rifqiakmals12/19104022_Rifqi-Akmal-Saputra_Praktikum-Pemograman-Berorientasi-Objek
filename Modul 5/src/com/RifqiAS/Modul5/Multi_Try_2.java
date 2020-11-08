package com.RifqiAS.Modul5;

// Class Multi_Try_2
public class Multi_Try_2 {
    public static void main(String[] args) {
        // Deklarasi array
        int[] array = new int[5];

        // try
        try {
            // Pernyataan disini akan di eksekusi jika tidak terjadi Exception
            array[5] = 30/0;
            System.out.println(array[5]);

        }catch (ArrayIndexOutOfBoundsException e) {
            // Pernyataan disini akan di eksekusi jika terjadi Exception
            System.out.println("Panjang kurang dari 5 !!!");
        }catch (ArithmeticException e) {
            // Pernyataan disini akan di eksekusi jika terjadi Exception
            System.out.println("Jangan dibagi 0 !!!");
        }
    }
}
