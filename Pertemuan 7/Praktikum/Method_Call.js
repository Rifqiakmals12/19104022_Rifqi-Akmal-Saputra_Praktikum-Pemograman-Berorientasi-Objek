// Membuat method person
var person = {
    fullName : function() {
        return this.firstName + " " + this.lastName;


    }
}

var person1 = {
    firstName : "Bambank",
    lastName : "Suryono"
}

var person2 = {
    firstName : "Cecep",
    lastName : "Gorbacep"
}

console.log("Menggunakan method call untuk menampilkan objek person 2 : ")

// Memanggil method menggunakan method call
console.log(person.fullName.call(person2))

