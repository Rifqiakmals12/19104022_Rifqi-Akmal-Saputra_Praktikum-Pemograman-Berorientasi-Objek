// Constructor Mahasiswa yang memiliki atribut nim, nama dan prodi
function Mahasiswa(nim, nama, prodi){
  this.nim = nim
  this.nama = nama
  this.prodi = prodi
  
  // Fungsi untuk menampilkan
  this.tampil = function(){
    console.log('Nim\t\t: ', this.nim)
    console.log('Nama\t: ', this.nama)
    console.log('prodi\t: ', this.prodi)
  } 
}
  
// Deklarasi prompt
const prompt = require('prompt-sync')()
 
// Menginputkan jumlah mahasiswa 
let jmlMhs = prompt('Masukkan jumlah mahasiswa\t: ')
  
var array = [] // Deklarasi array untuk menampung data mahasiswa

var mahasiswa = {} // Deklarasi object tanpa value
  
console.log()
 
// Menambahkan object dengan constructor
for (let i = 0; i < jmlMhs; i++) {
  console.log(`\nMahasiswa ke-${i}`);
  
  mahasiswa = new Mahasiswa(
    prompt(`Masukkan nim\t: `), 
    prompt(`Masukkan nama\t: `), 
    prompt(`Masukkan prodi\t: `)
  )
  array.push(mahasiswa)
}

console.log()

// Input untuk mengedit data
var editData = prompt('Ingin mengumbah data? [y/n]\t: ')
  
console.log()

// Menggunakan percabangan if else jika 'y' maka akan menjalankan program berikut 
if(editData == 'y'){
  var noMhs = prompt('Masukkan nomer urut mahasiswa\t: ')
  
  // Tambah fungsi baru ke constructor
  Mahasiswa.prototype.edit = function(){
    nim = prompt(`Masukkan nim\t: `), 
    nama = prompt(`Masukkan nama\t: `), 
    prodi = prompt(`Masukkan prodi\t: `),
    tampil = this.tampil
    return {nim, nama, prodi, tampil}
  }
  
  let index = noMhs-1
  array[index] = array[index].edit()
  
  console.log('\nData setelah diubah')
  
  index = 1
  
  // Menampilkan object
  for (let x in array){
    console.log(`\nMahasiswa ke-${index}`);
    index++;
    array[x].tampil()
  }

// Jika 'n' maka akan menjalankan proram berikut
}else if(editData == 'n'){
    console.log('\nData mahasiswa berhasil disimpan')
    
    index = 1
  
    // Menampilkan object
    for (let x in array){
      console.log(`\nMahasiswa ke-${index}`);
        index++;
      array[x].tampil()
    }
    
  // Jika inputkan bukan keduanya maka akan menjalankan program berikut
  }else{
    console.log('Pilihan tidak sesuai')
  }
  
  
  