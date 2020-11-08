package com.RifqiAS.Modul5;

// Class Finally
public class Finally {
    public static void main(String[] args) {
        // Deklarasi array
        // Pernyataan yang berpotensi mengakibatkan Exception
        int[] array = new int[5];

        // try
        try {
            // Pernyataan disini akan di eksekusi jika tidak terjadi Exception
            System.out.println("Akses Elemen ke-5\t:" + array[5]);

        // catch
        }catch (ArrayIndexOutOfBoundsException e) {
            // Pernyataan disini akan di eksekusi jika terjadi Exception
            System.out.println("Ada Exception Array");

        // finally untuk mengakhiri program dan menampilkan program nilai elemen terakhir
        }finally {
           /*
            Pernyataan disini akan di eksekusi jika terjadi Exception
            Ataupun tidak terjadi Exception
            */
            array[array.length - 1] = 10;
            System.out.println("Nilai elemen terakhir\t: " + array[array.length - 1]);
        }
    }
}
