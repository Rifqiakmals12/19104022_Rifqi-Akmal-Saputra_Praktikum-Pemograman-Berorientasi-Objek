/**
 * Code by Rifqi Akmal Saputra
 */
const prompt = require('prompt-sync')()

// Constructor Kendaraan 
function Kendaraan(noPlat, merk, pajakKendaraan){
  this.noPlat = noPlat
  this.merk = merk
  this.pajakKendaraan = pajakKendaraan
}

// Fungsi inputAtribut untuk menginputkan data kendaraan
Kendaraan.prototype.inputAtribut = function(){
  this.noPlat = prompt('Masukkan Nomor Kendaraan\t\t: ')
  this.merk = prompt('Masukkan Merk\t\t\t\t\t: ')
  this.pajakKendaraan = prompt('Masukkan Pajak Kendaraan\t\t: ')
},

// Deklarasi method fasTambahan
Kendaraan.prototype.fasTambahan = function(){

},
// Deklarasi method printFasTambahan
Kendaraan.prototype.printFasTambahan = function(){

},
// Deklarasi method hitungPajak
Kendaraan.prototype.hitungPajak = function(){

},

// Fungsi print untuk mencetak data kendaraan     
Kendaraan.prototype.print = function(){
  console.log('---Info Kendaraan---')
  console.log('Nomor Kendaraan\t\t\t\t: ' , this.noPlat)
  console.log('Merk Kendaraan\t\t\t\t: ' , this.merk)
  this.printFasTambahan()
  console.log('Masukkan Pajak Kendaraan\t: ' , this.pajakKendaraan)
  console.log('Total Pembayaran Pajak\t\t: ' , this.hitungPajak)
}
    
// Constructor Sedan
function Sedan(fasKeamanan, kapasitasCC, fasKenyamanan){
  this.fasKeamanan = fasKeamanan
  this.kapasitasCC = kapasitasCC
  this.fasKenyamanan = fasKenyamanan
}

// Mengheritance fungsi kendaraan
Sedan.prototype = new Kendaraan()
Sedan.prototype.constructor = Kendaraan

// Fungsi fasTambahan untuk menginputkan fasilitas tambahan pada Sedan
Sedan.prototype.fasTambahan = function(){
  this.fasKeamanan = prompt('Masukkan Fasilitas Keamanan\t\t: ')
  this.kapasitasCC = prompt('Masukkan Kapasitas (Dalam CC)\t: ')
  this.fasKenyamanan = prompt('Masukkan Fasilitas Kenyamanan\t: ')
}

// Fungsi printFasTambahan untuk mencetak fasilitas tambahan pada Sedan
Sedan.prototype.printFasTambahan = function(){
  console.log('Fasilitas Keamanan\t\t\t: ', this.fasKeamanan)
  console.log('Kapasitas CC\t\t\t\t: ', this.kapasitasCC)
  console.log('Fasilitas Kenyamanan\t\t: ', this.fasKenyamanan)
}

// Fungsi hitungPajak untuk menghitung pajak pada Sedan
Sedan.prototype.hitungPajak = function(){
  this.hitungPajak = this.pajakKendaraan * 1 + (this.pajakKendaraan * this.kapasitasCC * 0.00005)
}

// Constructor Bus
function Bus(kapPenumpang, kapBagasi){
  this.kapPenumpang = kapPenumpang
  this.kapBagasi    = kapBagasi
}

// Mengheritance fungsi kendaraan
Bus.prototype = new Kendaraan()
Bus.prototype.constructor = Kendaraan

// Fungsi fasTambahan untuk menginputkan fasilitas tambahan pada Bus
Bus.prototype.fasTambahan = function(){
  this.kapPenumpang = prompt('Masukan Kapasitas Penumpang \t: ')
  this.kapBagasi = prompt('Masukkan Kapasitas Bagas (kg)\t: ')
}

// Fungsi printFasTambahan untuk mencetak fasilitas tambahan pada Bus
Bus.prototype.printFasiTambahan = function(){
  console.log('Kapasitas Penumpang\t\t: ', this.kapPenumpang)
  console.log('Kapasitas Bagasi\t\t: ', this.kapBagasi)
}

// Fungsi hitungPajak untuk menghitung pajak pada Bus
Bus.prototype.hitungPajak = function(){
  this.hitungPajak = this.pajakKendaraan * 1 + (this.pajakKendaraan * this.kapPenumpang * this.kapBagasi * 0.00005)
}
    
// Memanggil fungsi inputAtribut dan fasTambahan untuk menginputkan data kendaraan sedan dan bus
console.log('Input Data Sedan')
var obSedan = new Sedan()
obSedan.inputAtribut()
obSedan.fasTambahan()
   
console.log('\nInput Data Bus')
var obBus = new Bus()
obBus.inputAtribut()
obBus.fasTambahan()
    
// Memanggil fungsi hitungPajak dan print untuk mencetak data kendaraan sedan dan bus
console.log('\n---Data Seluruh Kendaraan---')
console.log('\n1. Sedan')
obSedan.hitungPajak()
obSedan.print()
    
console.log('\n2. Bus')
obBus.hitungPajak()
obBus.print()