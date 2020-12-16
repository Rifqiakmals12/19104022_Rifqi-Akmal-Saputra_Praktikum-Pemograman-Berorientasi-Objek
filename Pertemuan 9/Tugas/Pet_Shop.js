
/**
 * Code by Rifqi Akmal Saputra
 */

// Constructor Hewan yang memiliki atribut nama, jenis, umur, makanan, dan riwayat penyakit
function Hewan(nama, jenis, umur, makanan, riwayat_penyakit){
  this.nama = nama
  this.jenis = jenis
  this.umur = umur
  this.makanan = makanan
  this.riwayat_penyakit = riwayat_penyakit
  
  // Fungsi untuk menampilkan
  this.tampil = function(){
    console.log('Nama\t\t\t\t: ', this.nama)
    console.log('Jenis\t\t\t\t: ', this.jenis)
    console.log('Umur\t\t\t\t: ', this.umur)
    console.log('Makanan\t\t\t\t: ', this.makanan)
    console.log('Riwayat Penyakit\t: ', this.riwayat_penyakit)
  } 
}

// Deklarasi prompt
const prompt = require('prompt-sync')()

var array = [] // Deklarasi array untuk menampung data hewan
var hewan = {} // Deklarasi object tanpa value

var cek = false // Deklarasi boolean cek bernilai false 

// Menggunakan perulangan do/while
do{
  // Tampilan menu petshop
  console.log('Selamat Datang di Pet Shop Snow Ball')
  console.log()
  
  console.log('Menu :')
  console.log('1. Tambah Hewan')
  console.log('2. Edit Hewan')
  console.log('3. Tampilkan Hewan')
  console.log('4. Exit')
  console.log()
  let pil = prompt('Masukkan Pilihan Menu\t: ')

  console.log()
  
  // Menggunakan percabangan if else
  // Jika pil = 1, maka akan menjalankan perintah program (Tambah Hewan)
  if(pil == 1){
    let jmlHewan = prompt('Masukkan Jumlah Hewan\t: ')
    
    // Menambahkan object dengan constructor
    for (let i = 0; i < jmlHewan; i++) {
      console.log(`\nHewan ke-${i}`);  
      hewan = new Hewan(
        prompt(`Masukkan Nama\t\t\t\t: `), 
        prompt(`Masukkan Jenis\t\t\t\t: `), 
        prompt(`Masukkan Umur\t\t\t\t: `),
        prompt(`Masukkan Makanan\t\t\t: `),
        prompt(`Masukkan Riwayat Penyakit\t: `)
      )
      array.push(hewan)
    }
    console.log()
  
  // Jika pil = 2, maka akan menjalankan perintah program (Edit Data Hewan)
  }else if(pil == 2){
    var noHewan = prompt('Masukkan Nomer Urut Hewan\t: ')
     
    // Tambah fungsi baru ke constructor
    Hewan.prototype.edit = function(){
      nama = prompt(`Masukkan Nama\t\t\t\t: `), 
      jenis = prompt(`Masukkan Jenis\t\t\t\t: `), 
      umur = prompt(`Masukkan Umur\t\t\t\t: `),
      makanan = prompt(`Masukkan Makanan\t\t\t: `),
      riwayat_penyakit = prompt(`Masukkan Riwayat Penyakit\t: `),
      tampil = this.tampil
      return {nama, jenis, umur, makanan, riwayat_penyakit, tampil}
    } 
    
    let index = noHewan-1
    array[index] = array[index].edit()
    
    console.log('\nData Berhasil Dirubah')
    console.log()

  // Jika pil = 3, maka akan menjalankan perintah program (Tampilkan Data Hewan) 
  }else if(pil == 3){
    index = 1
  
    // Menampilkan object
    for (let x in array){
        console.log(`\nHewan ke-${index}`);
        index++;
        array[x].tampil()
    }
  console.log()
  
  // Jika pil = 4, maka program akan berhenti meminta inputan
  }else if(pil == 4){
    cek = true
    console.log('Bye!!!')

  // Jika user salah menginputkan pilihan makan akan ada pemberitahuan
  // ('Maaf, inputan anda salah')
  }else{
    console.log('Maaf inputan anda salah')
    console.log()
  }
// Program akan terus berulang jika tidak sama dengan cek    
}while(!cek)