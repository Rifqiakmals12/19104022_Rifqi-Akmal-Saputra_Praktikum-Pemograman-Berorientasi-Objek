// Membuat fungsi tanpa parameter atau argumen
function sum() {
    var result = 0,
        i = 0,
        len = arguments.length

    // Melakukan perulangan sebanyak argumen
    // yang diinputkan
    while (i < len) {
        result += arguments[i]
        i++
    }

    return result
}

// Menampilkan fungsi
console.log(sum(1,4))
console.log(sum(3,5,2,7))
console.log(sum())