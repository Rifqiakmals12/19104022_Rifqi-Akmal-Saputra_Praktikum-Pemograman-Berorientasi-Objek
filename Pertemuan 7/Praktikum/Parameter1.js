// Membuat fungsi dengan 1 parameter
function reflect(value) {
    return value
}

// Menampilkan fungsi
console.log(reflect("Hallo"))
console.log("Hari ini hari ke ",2)
console.log("Panjang argument : ", reflect.length)

// Meredefinisi fungsi reflect
reflect = function() {
    return arguments[1]
}

// Menampilkan fungsi
console.log(reflect("Hallo"))
console.log("Hari ini hari ke ",2)
console.log("Panjang argument : ", reflect.length)