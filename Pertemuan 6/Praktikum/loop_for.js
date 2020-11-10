// For loop
for(var i = 0; i < 5; i++){
    console.log(i + ', Berfikir')
}
console.log('\n')

// For/in/menggunakan objek
var nama = [{fName : 'Bagus', lName : 'Bayu', age : 20}, {fName : 'Ajeng', lName : 'Fitria', age : 19}]

for(var x in nama){
    console.log('Asprak\t: ')
    console.log(nama[x].fName)
    console.log(nama[x].lName)
    console.log(nama[x].age)
    console.log('\n')
}

// For/of/menggunakan array
var buah = ['apel', 'anggur', 'jeruk']
for(var v of buah){
    console.log('ini buah ' + v)
}