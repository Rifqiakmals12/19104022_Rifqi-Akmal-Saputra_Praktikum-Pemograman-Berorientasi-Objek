/**
 * Code by Rifqi Akmal Saputra
 */

// Class nilaiRata
class nilaiRata {
    // Constractor nama dan nilaiasArray
    constructor(nama = null, nilaiAsArray = []) {
        this.nama = nama
        this.nilai = nilaiAsArray
    }
    
    getRatarata() {
        // Menambahkan jumlah nilai kedalam array
        var jmlNilai = this.sum(this.nilai)
        // Rumus untuk menghitung nilai rata2
        var hasil = Number(jmlNilai / this.nilai.length)
        console.log("Rata-rata nilai kamu : " + hasil);
    }

    // Untuk menjumlahkan nilai di dalam array
    sum(input){
        if (toString.call(input) !== "[object Array]")
        return false;

        var total =  0;
        for(var i = 0; i < input.length; i++) {                  
            if(isNaN(input[i])) {
            continue;
            }
            
            total += Number(input[i]);
        }
        return total;
    }
}
// Fungsi untuk menginputkan nama 
function askFor(nama) {
    return prompt("Masukan " + nama + " : ")
    
}
// Fungsi untuk menginputkan jumlah nilai
var inputJmlNilai = askFor("jumlah nilai");


var nilai = []
// Menggunakan for untuk menginputkan nilai dengan panjang inputJmlNilai
for (let i = 0; i < inputJmlNilai; i++) {
    nilai[i] = askFor("Nilai ke-" + (i + 1) )
}

// Membuat method hasilAkhir yang memanggil fungsi input nama dan nilai
var hasilAkhir = new nilaiRata(askFor("nama"), nilai)

// Mencetak hasil akhir program dan memanggil method getPredikat
hasilAkhir.getRatarata() 