/**
 * Code by Rifqi Akmal Saputra
 */

var nilai = {
    nilaiMinMax : function() {
       console.log("Nilai : 5, 6, 2, 3, 7")
         
       var nilai = arguments

       // Untuk mengecek nilai maksimun dan outputnya menggunakan apply
       console.log("Nilai maksimum : " + Math.max.apply(Math, nilai));
       // Untuk mengecek nilai minimum dan outputnya menggunakan apply
       console.log("Nilai minimum : " + Math.min.apply(Math, nilai));
    }
}

// Mencetak output program menggunakan apply
var hasil = nilai.nilaiMinMax.apply("Hasil",[5,6,2,3,7])