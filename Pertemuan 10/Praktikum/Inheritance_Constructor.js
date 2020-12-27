const prompt = require('prompt-sync')()

// Constructor PersegiPanjang
function PersegiPanjang(panjang, lebar){
  this.panjang = panjang
  this.lebar = lebar
}

// Fungsi getLuas untuk menghitung luas PersegiPanjang dan mencetak luas PersegiPanjang
PersegiPanjang.prototype.getLuas = function() {
  var luas = this.panjang * this.lebar
  console.log('Luas\t\t\t: ', this.panjang, ' x ', this.lebar, ' : ', luas )
}

// Fungsi print untuk mencetak panjang sisi dan lebar sisi
PersegiPanjang.prototype.print = function() {
  console.log('Panjang Sisi\t: ', this.panjang)
  console.log('Lebar Sisi\t\t: ', this.lebar)
}

// Constructor Persegi yang mewarisi properti Persegi Panjang
function Persegi(sisi){
  this.panjang = sisi
  this.lebar = sisi
}

// Mengheritance fungsi PersegiPanjang
Persegi.prototype = new PersegiPanjang()
Persegi.prototype.constructor = PersegiPanjang

// Redifinisi fungsi print()
Persegi.prototype.print = function(){
  console.log('Panjang Sisi\t: ', this.panjang)
}

// Menginputkan panjang dan lebar Persegi Panjang
console.log('Persegi Panjang')
var obPersegiPanjang = new PersegiPanjang(
  prompt('Masukkan Panjang\t: '),
  prompt('Masukkan Lebar\t\t: ')
)

// Menginputkan panjang sisi Persegi
console.log('\nPersegi')
var obPersegi = new Persegi(
  prompt('Masukkan panjang sisi\t: ')
)

// Memanggil fungsi print dan getLuas untuk mencetak dan menghitung luas Persegi Panjang
console.log('\n\nMenghitung Luas Persegi Panjang')
obPersegiPanjang.print()
obPersegiPanjang.getLuas()

console.log()

// Memanggil fungsi print dan getLuas untuk mencetak dan menghitung luas Persegi
console.log('Menghitung Luas Persegi')
obPersegi.print()
obPersegi.getLuas()