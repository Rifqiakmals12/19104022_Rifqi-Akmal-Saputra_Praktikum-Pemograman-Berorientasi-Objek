// Deklarasi input dengan prompt
const prompt = require('prompt.sync')();


let total = prompt("Berapa input Mahasiswa :");

var array = [] // Deklarasi array tanpa value
var mahasiswa = {} // Deklarasi object tanpa value


for (let i = 0; i < total; i++) {
	console.log(`\nInput Mahasiswa#${i}`);

	// Cara pertama
	let firstName = prompt("Input Nama Depan");
	let lastName = prompt("Input Nama Belakang");
	let birth = prompt("Input Tanggal Lahir");
	let nim = prompt("Input NIM");

	mahasiswa = new Mahasiswa(firstName, lastName, birth, nim);

	// Cara kedua
	/*
	mahasiswa = new Mahasiswa(
	prompt("Input Nama Depan"), 
	prompt("Input Nama Belakang"), 
	prompt("Input Tanggal Lahir"), 
	prompt("Input NIM"));
	*/
	aray.push(mahasiswa)
}

let index = 0;

// Mencetak output program
for (let x in aray) {
	console.log(`\nData Mahasiswa\t: ${ index }`);
	index++;
	console.log(`Nama\t\t\t: ${ aray[x].fullName() }`);
	console.log(`Tanggal Lahir\t: ${ aray[x].birth }`);
	console.log(`NIM\t\t\t\t: ${ aray[x].nim }`);
	console.log(`Umur\t\t\t: ${ aray[x].age() }`);
}

function Mahasiswa(firstName, lastName, birth, nim) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.fullName = function() {
		return this.firstName + " " + this.lastName
	};

	this.birth = birth;
	this.nim = nim;
	this.age = function() {
     // Function slice untuk mendapatkan nilai dari ke n sampai akhir
		let year = this.birth.slice(this.birth.length - 4)
		return 2020 - year
	};
}