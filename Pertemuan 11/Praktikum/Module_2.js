// Objek person
var person = (function(){
    var age = 25
    
    function setAge(newAge){
      age = newAge
    }
    
    function getAge(){
      return age
    }
  
    function growOlder(){
      age++
    }
    
    return{
      name : 'Bambank',
      setAge : setAge,
      getAge : getAge,
      growOlder : growOlder
  
    }
  }())
  
  console.log('Nama person\t: ', person.name)
  console.log('Umur person\t: ', person.getAge())
  
  person.setAge(100)
  console.log('Umur person yang diganti\t: ', person.getAge())
  
  person.growOlder()
  console.log('Umur person yang ditambah\t: ', person.getAge())