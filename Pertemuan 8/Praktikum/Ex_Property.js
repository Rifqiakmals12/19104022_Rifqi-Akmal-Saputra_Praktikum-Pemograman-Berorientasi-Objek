var person0 = {} // tanpa properti
var person1 = { nama : 'Bambank'} // ada properti

// Membuat object baru
var person2 = new Object()
person2.nama = 'Sayonara'

// Menambahkan property baru
person1.age = 19
person2.age = 30

// Cara mengakases property dengan cara pertama
console.log('Objek dari person1 :')
console.log(`Nama\t: ${person1.nama}`)
console.log('Age\t\t: ' + person1.age)

console.log()

// Cara mengakases property dengan cara kedua
console.log('Objek dari person2 :')
console.log(`Nama\t: ${person2['nama']}`)
console.log('Age\t\t: ' + person2.age)