/**
 * Code by Rifqi Akmal Saputra
 */

// Class Nilai
class Nilai {
    // Membuat constructor nama dan nilai
    constructor(nama, nilai) {
        this.nama = nama
        this.nilai = nilai
    }
    
    getPredikat() {
        var predikat = null
       
        // Menggunakan percabnagan if else
        if(this.nilai <= 100 && this.nilai >= 85) {
            predikat = "'A'"
        } else if(this.nilai <= 84 && this.nilai >= 75) {
            predikat = "'B'"
        } else if(this.nilai <= 75 && this.nilai >= 65) {
            predikat = "'BC'"
        } else if(this.nilai <= 64 && this.nilai >= 55) {
            predikat = "'C'"
        } else if(this.nilai <= 54 && this.nilai >= 45) {
            predikat = "'D'"
        } else if(this.nilai <= 44 && this.nilai >= 0) {
            predikat = "'E'"
        } else {
            predikat = null
        }
        
        // Format output program nantinya 
        console.log(this.nama + " , kamu mendapat predikat " + predikat);
    }
}

// Fungsi untuk menginputkan nama 
function askFor(nama) {
    return prompt("Masukan " + nama + " : ")
 }

// Membuat method hasilAkhir yang memanggil fungsi input nama dan nilai
var hasilAkhir = new predikatNilai(askFor("nama"), askFor("nilai"))

// Mencetak hasil akhir program dan memanggil method getPredikat
hasilAkhir.getPredikat()