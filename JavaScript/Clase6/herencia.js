/* Para JS todavia no existe lo que es hoisting...es decir no se puede crear una clase antes del constructor*/ 

//Clases con Herencias
class Persona{//Clase Padre
    constructor(Nombre,Apellido){
        this.nombre = Nombre;
        this.apellido = Apellido
    }
    get Nombre(){
        return this.nombre;
    }
    get Apellido(){
        return this.apellido
    }

    set Nombre(Nombre){
        this.nombre = Nombre;
    }
    set Apellido(Apellido){
        this.apellido = Apellido
    }
}

class Empleado extends Persona{//Clase Hija
    constructor(Nombre,Apellido,Departamento){
        super(Nombre,Apellido)
        this.departamento = Departamento
    }
    set Departamento(Departamento){
        this.departamento = Departamento
    }

}


let persona1 = new Persona("Maria","Juana")
//console.log(persona1)
let persona2 = new Persona("Carlos","Lara")
//console.log(persona2)

//Obteniendo el dato mediante "get"
console.log(persona1.Nombre)
console.log(persona1.Apellido)
//-----------------
console.log(persona2.Nombre)
console.log(persona2.Apellido)


//Obteniendo datos mediante "set"
persona1.nombre = "Juan Carlos"
persona2.nombre = "Maria Laura"
persona1.apellido = "Salvadores"
persona2.apellido = "Santillan"
console.log(persona1.nombre)
console.log(persona1.Apellido)
//------------------
console.log(persona2.nombre)
console.log(persona2.Apellido)


//Clases con cascadas
let empleado1 = new Empleado("Pedro","Gimenez","Sistemas")
console.log(empleado1)
empleado1.Departamento = "Analitico"
console.log(empleado1.departamento)