// Merupakan fungsi myFunction 
function myFunction(a, b, c) {
    console.log("Hello, my name is", a)
    console.log("I'm ", b, " years old")
    console.log("I like ", c)
}

console.log("\nOutput contoh 1")
// Melakukan invokasi fungsi
myFunction("Rifqi Akmal", 19, "Fishing")

// Merupakan fungsi myFunction2
function myFunction2(arg1, arg2) {
    this.firstName = arg1
    this.lastName = arg2
}

// Membuat objek dari fungsi myFunction
var x = new myFunction2("Bambank", "Sayonara")

console.log("\nOutput contoh 2")

// Memanggil fungsi dari properti yang ada didalam fungsi
console.log(x.firstName)