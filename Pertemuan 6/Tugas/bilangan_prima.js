// Deklarasi variabel
var hasil = ""
var i = 0
var j = 0

// Perulangan 1 sampai 50
for(i = 1; i <= 50; i++){
    // Inisiasi nilai counter
    var counter = 0

    // Kondisi jika j lebih atau sama dengan 1
    for(j = i; j >= 1; j = j - 1){
        
        // Jika i habis di bagi j maka nilai counter bertambah 1 
        if(i % j == 0){
            counter = counter + 1
        }
    }
    // Jika nilai counter sama dengan 2 hasil akan di awali 2
    if (counter == 2){
        hasil = hasil + i + ", "
    }
}

// Cetak output bilangan prima
console.log('Bilangan Prima\t: ' + hasil)