/**
 * Code by Rifqi Akmal Saputra
 */
const prompt = require('prompt-sync')()

// Objek kendaraan
var kendaraan = {
  // Method inputAtribut untuk menginputkan dan menyimpan data atribut
  inputAtribut : function(noPlat, merk, pajakKendaraan){
    this.noPlat = prompt('Masukkan Nomer Kendaraan\t\t: '),
    this.merk = prompt('Masukkan Merk Kendaraan\t\t\t: '),
    this.pajakKendaraan = prompt('Masukkan Pajak Kendaraan\t\t: ')
  },
  
  // Deklarasi method fasTambahan
  fasTambahan : function(){
    
  },

  // Deklarasi method printFasTambahan
  printFasTambahan : function(){

  },

  // Deklarasi method hitungPajak
  hitungPajak : function(){

  },
  
  // Method print untuk mencetak info kendaraan
  print : function(){
    console.log('---Info Kendaraan---')
    console.log('Nomer Kendaraan\t\t\t: ', this.noPlat)
    console.log('Merk\t\t\t\t\t: ', this.merk) 
    this.printFasTambahan()
    console.log('Pajak Kendaraan\t\t\t: ', this.pajakKendaraan)
    console.log('Total Pembayaran Pajak\t: ',this.hitungPajak)
  }
}

// Objek sedan yang mewarisi Objek kendaraan
var sedan = Object.create(kendaraan)

// Fungsi fasTambahan untuk menginputkan fasilitas tambahan pada objek sedan
sedan.fasTambahan = function(){
  this.fasKeamanan = prompt('Masukkan Fasilitas Keamanan\t\t: ')
  this.kapasitasCC = prompt('Masukkan Kapasitas (Dalam CC)\t: ')
  this.fasKenyamanan = prompt('Masukkan Fasilitas Kenyamanan\t: ')
}

// Fungsi printFasTambahan untuk mencetak fasilitas tambahan pada objek sedan
sedan.printFasTambahan = function(){
  console.log('Fasilitas Keamanan\t\t: ', this.fasKeamanan)
  console.log('Kapasitas (Dalam CC)\t: ',this.kapasitasCC)
  console.log('Fasilitas Kenyamanan\t: ', this.fasKenyamanan)
}

// Fungsi hitungPajak untuk mengkalkulasi total pajak pada objek sedan
sedan.hitungPajak = function(){
  this.hitungPajak = this.pajakKendaraan * 1 + (this.pajakKendaraan * this.kapasitasCC * 0.00005)
}

// Objek bus yang mewarisi objek kendaraan
var bus = Object.create(kendaraan)

// Fungsi fasTambahan untuk menginputkan fasilitas tambahan pada objek bus
bus.fasTambahan = function(){
  this.kapPenumpang = prompt('Masukkan Kapasitas Penumpang\t: ')
  this.kapBagasi = prompt('Masukkan Kapasitas Bagasi (kg)\t: ')
}

// Fungsi printFasTambahan untuk mencetak fasilitas tambahan pada objek bus
bus.printFasTambahan = function(){
  console.log('Kapasitas Penumpang\t\t: ', this.kapPenumpang)
  console.log('Kapasitas Bagasi\t\t: ', this.kapBagasi)
}

// Fungsi hitungPajak untuk mengkalkulasi total pajak pada objek bus
bus.hitungPajak = function(){
  this.hitungPajak = this.pajakKendaraan * 1 + (this.pajakKendaraan * this.kapBagasi * this.kapPenumpang * 0.00005)
}

// Memanggil method inputAtribut, fasTambahan, dan hitungPajak untuk menginputkan atribut,
// fasTambahan, dan hitungPajak
console.log('Input data Sedan')
sedan.inputAtribut()
sedan.fasTambahan()
sedan.hitungPajak()

console.log('\nInput Data Bus')
bus.inputAtribut()
bus.fasTambahan()
bus.hitungPajak()

console.log()

// Memanggil method print untuk mencetak data seluruh kendaraan
console.log('---Data Seluruh Kendaraan---')
console.log('\n1. Sedan')
sedan.print()

console.log('\n2. Bus')
bus.print()
