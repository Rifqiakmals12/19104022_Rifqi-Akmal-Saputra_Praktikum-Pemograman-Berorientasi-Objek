package com.RifqiAS.Modul5;

// Class Multi_Try_1
public class Multi_Try_1 {
    public static void main(String[] args) {
        // Deklarasi array
        int[] array = new int[5];

        // try
        try {
            // Deklarasi array dengan parameter 5 yang berisi pengoprasian variabel 30/0
            // Pernyataan disini akan di eksekusi jika tidak terjadi Exception
            array[5] = 30/0;
            System.out.println(array[5]);

        // catch
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            // Kedua pernyataan disini akan di eksekusi jika terjadi Exception
            System.out.println("Panjang kurang dari 5 !!!");
            System.out.println("Jangan dibagi 0 !!!");
        }
    }
}