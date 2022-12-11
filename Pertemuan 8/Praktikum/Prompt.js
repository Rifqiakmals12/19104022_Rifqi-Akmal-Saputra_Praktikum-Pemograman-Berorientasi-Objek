// Deklarasi input dengan prompt
const prompt = require(`prompt-sync`)()

let object = {} // Deklarasi object
// Menginputkan property
object.name = prompt(`Input Name\t:`)
object.age = prompt(`Input Age\t: `)
object.nim = prompt(`Input NIM\t: `)
object.prodi = prompt(`Input Prodi\t: `)

console.log()
// Perulangan for each untuk mendapatkan nama property
for(property in object){
  // Mencetak nama property dan valuenya
  console.log(property + `\t: ${object[property]}`)

}