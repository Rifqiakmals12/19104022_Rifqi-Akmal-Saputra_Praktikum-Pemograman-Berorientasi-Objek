/**
 * Code by Rifqi Akmal Saputra
 */

// Deklarasi input dengan prompt
const prompt = require('prompt-sync')();

var array = [] // Deklarasi array

var cek = false // Deklarasi boolean cek bernilai false 

// Menggunakan perulangan do/while
do{
  // Tampilan menu penilaian
  console.log()  
  console.log('<===== Menu Penilaian =====>')
  console.log('1. Tambah Mahasiswa')
  console.log('2. Penilaian')
  console.log('3. Lihat Seluruh Mahasiswa')
  console.log('4. Keluar')
  console.log()
  
  // Input pilihan menu
  let pil = prompt('Masukkan Pilihan\t: ')
  console.log()
   
  // Menggunakan percabangan if else
  // Jika pil = 1, maka akan menjalankan perintah program (Tambah Mahasiswa)
  if(pil == 1){
    console.log('<===== Tambah Mahasiswa =====>')
    /**
     * Menginputkan nama, tanggal lahir, dan nim
     */
    let nama = prompt('Input Nama\t\t\t: ')
    let birth = prompt('Input Tanggal Lahir\t: ')
    let nim = prompt('Input NIM\t\t\t: ')

    console.log()
    
    console.log('<= Pilih Prodi')
    console.log('1. S1 SE')
    console.log('2. S1 IF')
    console.log('2. S1 SI')
    
    // Menginpurkan pilihan prodi
    let prodi = prompt('Input Angka Prodi\t: ')
    
    // Function pilProdi untuk mencetak prodi yang dipilih
    function pilProdi(prodi){
      if(prodi == 1){
        return 'S1 SE'
      }else if(prodi == 2){
        return 'S1 IF'
      }else if(prodi == 3){
        return 'S1 SI'
      }else{
        prodi = null
      }
    }
    prodi = pilProdi(prodi)
    
    // Inisiasi objek mahasiswa
    let mahasiswa = new Mahasiswa(nama,nim,birth,prodi)
    array.push(mahasiswa)
    
  // Jika pil = 2, maka akan menjalankan perintah program (Penilaian)
  }else if(pil == 2){
    console.log('<===== Penilaian =====>')
    /**
     * Menginputkan nim dan nilai
     */
    let nim = prompt('Input NIM\t: ')
    let nilai = prompt('Input Nilai\t: ')

  // Function grade untuk menentukan grade nilai yang di dapat oleh mahasiswa  
  function grade(nilai){
    if(nilai <= 100 && nilai >= 80) {
      return 'A'
    }else if(nilai <= 80 && nilai >= 60) {
      return 'B'
    }else if(nilai <= 60 && nilai >= 40) {
      return 'C'
    }else if(nilai < 40) {
      return 'D'
    }
  }
  
  for(let i = 0; i < array.length; i++){
    if(array[i].nim == nim) {
      array[i].nilai = grade(nilai)
    }
  }
  
  // Jika pil = 3, maka akan menjalankan perintah program (Data Mahasiswa)
  }else if (pil == 3){
    console.log('<===== Data Mahasiswa =====>')
    let index = 0
    // Untuk mencetak seluruh data mahasiswa
    for (let x in array) {
      console.log(`\nData Mahasiswa\t: ${ index }`);
	    index++;
      console.log(`Nama\t\t\t: ${ array[x].nama }`)
      console.log(`Tanggal Lahir\t: ${ array[x].birth }`)
      console.log(`Umur\t\t\t: ${ array[x].age()}`)
      console.log(`NIM\t\t\t\t: ${ array[x].nim }`)
      console.log(`Prodi\t\t\t: ${ array[x].prodi }`)
      console.log(`Grade\t\t\t: ${ array[x].nilai}`)
      
    }
  
  // Jika pil = 4, maka program akan berhenti
  }else if(pil == 4){
    cek = true
    console.log('BYE !!!')
  
  // Jika user salah menginputkan pilihan makan akan ada pemberitahuan
  // ('Maaf, inputan anda salah')
  }else{
    console.log('Maaf, inputan anda salah')
  }
// Program akan terus berulang jika tidak sama dengan cek  
}while(!cek)

// Function Mahasiswa
function Mahasiswa(nama, nim, birth, prodi, nilai = null){
      this.nama = nama
      this.birth = birth
      this.nim = nim      
      this.prodi = prodi
      this.nilai = nilai
      this.age = function(){
      // Function slice untuk mendapatkan nilai dari ke n sampai akhir
      let year = this.birth.slice(this.birth.length - 4)
        return 2020 - year
      }
    }
  