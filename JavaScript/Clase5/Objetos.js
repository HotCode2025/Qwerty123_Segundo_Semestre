//Objeto
let persona = {
    nombre: "Carlos",
    apellido: "Gil",
    email: "cgil@gmail.com",
    edad: 28,
    idioma: "Español",
    //Vamos a agregar un metodo
    nombreCompleto: function(){
        return this.nombre + " " + this.apellido
    },
    //Metodo Get
    get nombreEdad(){
        return "El nombre es: "+this.nombre+",edad: "+this.edad
    },
    get lang(){
        return this.idioma.toUpperCase()
    },
    set lang(lang){
        this.idioma = lang.toUpperCase()
    }
}

console.log(persona.nombreEdad)
console.log(persona.lang)
persona.lang = "ingles"
console.log(persona.lang)

//Constructor de objetos
function constructor(nombre = "Luis",apellido,email){
    this.nombre = nombre;
    this.apellido = apellido,
    this.email = email
    this.nombreCompleto = function(){
        return this.nombre +" "+this.apellido
    }
}
//Objetos creados por la funcion constructor
let padre = new constructor("Leo","Lopez","lopezl@gmail.com")
padre.nombre = "Luis"
console.log(padre)
console.log(padre.nombreCompleto())
let madre = new constructor("Laura","Contrera","contreral@gmail.com")
console.log(madre.nombreCompleto())
console.log(madre)



//Formas de crear objetos
//caso objeto Formal
let miObjeto = new Object()
//caso objeto Breve y recomendada
let miObjeto2 = {}
//caso String Formal
let miCadena = new String("hola")
//caso String usada
let miCadena2 = "hola"

//caso numeros Formal
let miNumero = new Number(1)
//caso numeros Usada
let miNumero2 = 1

//caso boolean Formal
let miBoolean = new Boolean(true)
//caso Boolean Usada
let miBoolean2 = true

//caso Arreglos Formal
let miArreglo = new Array()
//caso Arreglos usada
let miArreglo2 = []

//caso function Formal
let miFunction = new function(){}
//caso function Usada
let miFunction2 = function(){}


//Funcion Prototipo(prototype)
constructor.prototype.telefono = "260434267"
console.log(padre)
padre.telefono = "240340632"
console.log(padre.telefono)


//Uso de la funcion "call"
let persona4 = {
    nombre : "Juan",
    apellido: "Perez",
    nombreCompleto2 : function(titulo,telefono){
        return titulo+ " : "+this.nombre +" "+ this.apellido +" "+telefono
    }
}
let persona5 = {
    nombre: "Carlos",
    apellido: "Lara"
}
console.log(persona4.nombreCompleto2("Lic.","548651894"))
//Aca hacemos uso de la funcion "call"

//
main
console.log(persona4.nombreCompleto2.call(persona5,"Ing.","260342342"))


//Funcion aplicar(apply)
let arreglo = ["Ing.","2602348345"]
console.log(persona4.nombreCompleto2.apply(persona5,arreglo))
//Con esta funcion,podemos aplicar argumentos creados