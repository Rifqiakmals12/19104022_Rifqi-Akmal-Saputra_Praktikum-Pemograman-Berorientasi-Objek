// Constructor Buku yang memiliki atribut judul, pengarang, penerbit, tahun terbit
function Buku(judul, pengarang, penerbit, thnTerbit){
  this.judul = judul
  this.pengarang = pengarang
  this.penerbit = penerbit
  this.thnTerbit = thnTerbit
  
  this.tampil = function(){
    console.log('Judul Buku\t\t: ', this.judul)
    console.log('Pengarang\t\t: ', this.pengarang)
    console.log('Penerbit\t\t: ', this.penerbit)
    console.log('Tahun Terbit\t: ', this.thnTerbit)
  }
}
  
// Deklarasi prompt
const prompt = require('prompt-sync')()

// Menginputkan jumlah buku yang akan di input
let jmlBuku = prompt('Jumlah Buku yang akan diinput\t: ')

var array = [] // Deklarasi array untuk menampung data buku
var buku = {} // Deklarasi object tanpa value
  
console.log()

// Membuat object dengan constructor
for (let i = 0; i < jmlBuku; i++) {
  console.log(`\nInput Buku-${i}`);
  
  buku = new Buku(
    prompt(`Masukkan judul buku ke-${i}\t: `), 
    prompt(`Masukkan nama pengarang\t\t: `), 
    prompt(`Masukkan nama penerbit\t\t: `), 
    prompt(`Masukkan tahun terbit\t\t: `)
  )
  array.push(buku)
}
  
console.log()

// Input untuk mengedit data
var editData = prompt('Ingin mengumbah data? [y/n]\t: ')

console.log()

// Menggunakan percabangan if else jika 'y' maka akan menjalankan program berikut 
if(editData == 'y'){
  var noBuku = prompt('Masukkan urutan buku yang ingin diubah\t: ')
  
  var namaData = prompt('Masukkan data yang ingin diubah [Judul/Pengarang/Penerbit/Tahun Terbit\t: ')
  
  let index = noBuku-1
  
  if(namaData == 'Judul'){
      array[index].judul = prompt('Masukkan judul buku baru\t: ')
    
  }else if(namaData == 'Pengarang'){
    array[index].pengarang = prompt('Masukkan nama pengarang baru\t: ')
    
  }else if(namaData == 'Penerbit'){
    array[index].penerbit = prompt('Masukkan nama penerbit baru\t: ')
    
  }else if(namaData == 'Tahun Terbit'){
    array[index].thnTerbit = prompt('Masukkan tahun terbit\t: ')
  
  }else{
    console.log('Pilihan tidak sesuai')
  }
  
  console.log('\nData buku berhasil disimpan')
  
  index = 1
  
  // Menampilkan object
  for (let x in array){
    console.log(`\nBuku ke-${index}`);
    index++;
    array[x].tampil()
  }

// Jika 'n' maka akan menjalankan proram berikut
}else if(editData == 'n'){  
  index = 1
  
  // Menampilkan object
  for (let x in array){
    console.log(`\nBuku ke-${index}`);
    index++;
    array[x].tampil()
  }

// Jika inputkan bukan keduanya maka akan menjalankan program berikut
}else{
  console.log('Pilihan tidak sesuai')
}