// Deklarasi variabel 
var a = 0
var b = 1
var hasil = 0

for(var i = 0; i <= 10; i++){
    // Rumus fibonacci
    a = a + b
    b = a - b
    hasil = hasil + b + ", "
}
// Cetak output bilangan fibonacci
console.log("Bilangan Fibonacci\t: " + hasil) 