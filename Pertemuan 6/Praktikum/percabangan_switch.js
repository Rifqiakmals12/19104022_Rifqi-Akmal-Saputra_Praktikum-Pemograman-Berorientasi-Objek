// Deklarasi variabel
var noHari = 'RAB'

// Switch noHari
switch(noHari){
    // Case hari minggu sampai sabtu jika variabel noHari  = 'RAB',
    // maka akan mencetak case 'RAB' dan mengoutputkan hari Rabu
    case 'MIN' :
        console.log('Minggu')
        break
    case 'SEN' :
        console.log('Senin')
        break
    case 'SEL' :
        console.log('Selasa')
        break    
    case 'RAB' :
        console.log('Rabu')
        break
    case 'KAM' :
        console.log('Kamis')
         break
    case 'JUM' :
        console.log('Jumat')
        break    
    case 'SAB' :
        console.log('Sabtu')
        break
    default :
        console.log('Tidak ada hari') 
        break  
}