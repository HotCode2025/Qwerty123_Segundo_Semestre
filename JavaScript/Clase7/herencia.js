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
    nombreCompleto(){
        return this.nombre + " "+this.apellido
    }
    toString(){
        return this.nombreCompleto()
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
    //Sobreescritura
    nombreCompleto(){
        return super.nombreCompleto()+", "+this.departamento
    }

}

let persona1 = new Persona("Maria","Juana")

//Clases con cascadas
let empleado1 = new Empleado("Pedro","Gimenez","Sistemas")
console.log(empleado1)
empleado1.Departamento = "Analitico"
console.log(empleado1.departamento)

//Mostramos como funciona la sobreescritura
console.log(empleado1.nombreCompleto())
//Polimorfismo
/*El polimorfismo en JavaScript es la capacidad de objetos de diferentes clases
para responder a la misma llamada de método de distintas maneras, permitiendo 
que un mismo código funcione con diversos tipos de objetos. Esto se logra principalmente
a través de la sobreescritura de métodos en la herencia, donde una
subclase proporciona una implementación propia de un método de la clase padre,
demostrando comportamientos únicos*/

//Mismo metodo pero diferentes objetos con referencia
console.log(empleado1.toString())
console.log(persona1.toString())