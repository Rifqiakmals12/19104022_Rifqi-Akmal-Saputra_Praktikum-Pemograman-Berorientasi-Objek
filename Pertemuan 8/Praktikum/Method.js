// Deklarasi input dengan prompt
const prompt = require('prompt-sync')()

let total = prompt (`Berapa input mahasiswa\t: `)

var array = [] // Deklarasi array tanpa value
var mahasiswa = {} // Deklarasi object tanpa value

for(let i=0; i < total; i++){
  console.log(`\nMahasiswa ${i}`)
  mahasiswa = {
    firstname : prompt(`Input Nama Depan\t\t: `),
    lastname : prompt(`Input Nama BeMasukkan Pilihan    : 
  lakang\t\t: `),
    fullname : function(){
    return this.firstname + " " + this.lastname
  },

  birth : prompt(`Input Tanggal Lahir\t\t: `),
  nim : prompt(`Input NIM\t\t\t\t: `),
  age : function(){
     // Function slice untuk mendapatkan nilai dari ke n sampai akhir
    let year = this.birth.slice(this.birth.length - 4)
    return 2020 - year
   }
  }

  array.push(mahasiswa)
}

let index = 0 

// Mencetak output program
for(let x in array){
  console.log(`\nMahasiswa\t: ${ index }`)
  index++
  console.log(`Nama\t\t\t: ${array[x].fullname() }`)
  console.log(`Tanggal lahir\t: ${array[x].birth }`)
  console.log(`NIM\t\t\t\t: ${array[x].nim}`)
  console.log(`Umur\t\t\t: ${array[x].age()}`)
}