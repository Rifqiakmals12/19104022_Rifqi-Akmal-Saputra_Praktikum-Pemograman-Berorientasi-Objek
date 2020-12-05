// Membuat method person
var person = {
    fullName : function(birth, city) {
        return this.firstName + " " + this.lastName + 
        "," + birth + "," + city;
    }
}

var person1 = {
    firstName : "Bambank",
    lastName : "Sayonara"
}

// Menggunakan apply
console.log(person.fullName.apply(person1, ["Desember", "Jayapura"]))