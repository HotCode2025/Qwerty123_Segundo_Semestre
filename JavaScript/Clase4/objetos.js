let x = 10; //variable de tipo primitiva
console.log(x.length)
console.log("Tipos primitivos")


//Objeto
let persona = {
    nombre: "Carlos",
    apellido: "Gil",
    email: "cgil@gmail.com",
    edad: 30,
    //Vamos a agregar un metodo
    nombreCompleto: function(){
        return this.nombre + " " + this.apellido
    }
}

console.log(persona.nombre)
console.log(persona.apellido)
console.log(persona.email)
console.log(persona.edad)
console.log(persona)
console.log(persona.nombreCompleto())
console.log("Ejecutando un objeto")

//Otra forma de crear objetos
let persona2 = new Object()
persona2.nombre = "Juan"
persona2.direccion = "Salada 14";
persona2.telefono = "549261828221";
console.log(persona2.telefono)
console.log("Creamos un objeto")

//Mostrando las propiedades
console.log("Usamos el ciclo for in")
for (propiedad in persona){
    console.log(propiedad)
    console.log(persona[propiedad])
}


//Agregando o eliminando una propiedad
console.log("Agregamos o eliminamos una propiedad")
persona.apellida = "Betancud";
delete persona.apellida
console.log(persona)



console.log("Formas de imprimir un objeto")
console.log("1) Concatenando valores de propiedades")
console.log(persona.nombre +" "+ persona.apellido )

console.log("2) A traves de un ciclo (For in)")
for (nombrePropiedad in persona){
    console.log(persona[nombrePropiedad])
}

console.log("3) Con la funcion object.values()")
let personaArray = Object.values(persona)
console.log(personaArray)

console.log(" 4) Utilizando el metodo JSON.stringify")
let personaString = JSON.stringify(persona)
console.log(personaString)