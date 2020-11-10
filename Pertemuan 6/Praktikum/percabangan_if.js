// Deklarasi variabel
var bilangan 

// 1 kondisi
bilangan = 10
// Jika bilangan = 10 makan akan mencetak output ini
if(bilangan == 10){
    console.log("Variabel bilanagan memiliki nilai\t= " + bilangan)
}

// 2 kondisi
bilangan = 15
// Jika bilangan habis membagi dua akan mencetak output ini
if(bilangan %2 == 0){
    console.log(bilangan + " adalah bilangan genap")

// Jika tidak habis membagi dua maka akan mencetak output ini
}else{
    console.log(bilangan + " adalah bilangan ganjil")
}

// 3 kondisi
bilangan = 0
// Jika bilangan lebih dari 0 maka akan mencetak output ini
if(bilangan > 0){
    console.log(bilangan + " adalah bilangan positif")

// Jika bilangan kurang dari 0 maka akan mencetak output ini
}else if(bilangan < 0){
    console.log(bilangan + " adalah bilangan negatif") 

// Jika bilangan tidak kurang dari 0 dan lebih besar dari 0 maka akan mencetak output ini
}else{
    console.log(bilangan + " adalah bilangan netral")
}