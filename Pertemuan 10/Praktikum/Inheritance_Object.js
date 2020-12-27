const prompt = require('prompt-sync')()

// Objek pegawai
var pegawai = {
  // Method inputData untuk menginputkan indentitas pegawai
  inputData : function(nip, nama, alamat, gajiPokok){
    this.nip = prompt('Masukkan NIP\t\t: '),
    this.nama = prompt('Masukkan Nama\t\t: '),
    this.alamat = prompt('Masukkan Alamat\t\t: '),
    this.gajiPokok = prompt('Masukkan Gaji Pokok\t: ')
  },

  // Method inputTunjangan untuk menginputkan tunjangan pegawai
  inputTunjangan : function(tunjangan){
    this.tunjangan = prompt('Masukkan Tunjangan\t: ')
  },

  // Method print untuk mencetak data pegawai
  print : function(){
    console.log('NIP\t\t\t: ', this.nip)
    console.log('Nama\t\t: ', this.nama)
    console.log('Alamat\t\t: ', this.alamat)
    console.log('Gaji Pokok\t: ', this.gajiPokok)
    console.log('Tunjangan\t: ', this.tunjangan)
    console.log('Total Gaji\t: ', ((this.gajiPokok * 1) + (this.tunjangan)))
    
  }
}

// Objek sales yang mewarisi objek pegawai 
var sales = Object.create(pegawai)
// Fungsi inputTunjangan untuk menginputkan tunjangan sales
sales.inputTunjangan = function(tunjangan) {
  jmlPelanggan = prompt('Masukkan jumlah pelanggan yang direkrut\t: ')
  this.tunjangan = jmlPelanggan * 50000
}

// Objek satpam yang mewarisi objek pegawai 
var satpam = Object.create(pegawai)
// Fungsi inputTunjangan untuk menginputkan tunjangan satpam
satpam.inputTunjangan = function(tunjangan){
  jam = prompt('Masukkan jumlah lembur (dalam jam)\t: ')
  this.tunjangan = jam*10000
}

//Objek manajer yang mewarisi objek pegawai 
var manajer = Object.create(pegawai)
// Fungsi inputTunjangan untuk menginputkan tunjangan manajer
manajer.inputTunjangan = function(tunjangan){
  thnMasuk = prompt('Masukkan tahun masuk\t: ')
  lamaKerja = 2020 - thnMasuk
  if(lamaKerja  <= 3){
    this.tunjangan = 5 / 100 * this.gajiPokok
  }else{
    this.tunjangan = 10 / 100 * this.gajiPokok
  }
}

// Memanggil method inputData dan inputTunjangan untuk mengginputkan data sales, satpam, dan manajer
console.log('Data Pegawai PT ABC \n1. Satpam')
satpam.inputData()
satpam.inputTunjangan()

console.log('\n2. Sales')
sales.inputData()
sales.inputTunjangan()

console.log('\n3. Manajer')
manajer.inputData()
manajer.inputTunjangan()

// Memanggil method print untuk mencetak data sales, satpam, dan manajer
console.log('\n-----------Hasil Input Data Pegawai----------')
console.log('\n1. Data Satpam')
satpam.print()

console.log('\n2. Data Sales')
sales.print()

console.log('\n3. Data Manajer')
manajer.print()