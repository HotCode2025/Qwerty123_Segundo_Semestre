//Clases con Herencias
class Persona{//Clase Padre
    static contadorPersonas = 0 //ATRIBUTO ESTATICO
    //email = "Valor default email"//Atributo NO ESTATICO

    //Este metodo simula una constante
    static get MAX_OBJ(){
        return 5
    }

    constructor(Nombre,Apellido){
        this.nombre = Nombre;
        this.apellido = Apellido
        if(Persona.contadorPersonas < Persona.MAX_OBJ){
            this.idPersona = ++Persona.contadorPersonas
        }
        else{
            console.log("Se ha superado el maximo de objetos")
        }
        //console.log("Se incrementa el contador: "+Persona.contadorObjetoPersona)
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
        return this.idPersona+ " " +this.nombre + " "+this.apellido
    }
    toString(){
        return this.nombreCompleto()
    }
    static saludar(){
        console.log("Saludos desde este metodo estatico")
    }
    static saludar1(persona1){
        console.log(persona1.nombre)
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

let empleado1 = new Empleado("Pedro","Gimenez","Sistemas")
console.log(empleado1)
empleado1.Departamento = "Analitico"
console.log(empleado1.departamento)


//No se puede utilizar desde un objeto
//persona1.saludar()

//Los metodos static se deben usar desde la clase
Persona.saludar()

Persona.saludar1(persona1)

Empleado.saludar1(empleado1)

//Ejemplo no valido desde el objeto
//console.log(persona1.contadorObjetoPersona)


//Desde la CLASE
console.log(Persona.contadorObjetoPersona)


//Los atributos NO ESTATICOS se asocian a los objetos
console.log(persona1.email)
console.log(empleado1.email)

// Y no se asocian a la CLASE
console.log(Persona.email)

//ID de las clases
console.log(persona1.toString())
console.log(empleado1.toString())
console.log(Persona.contadorPersonas)

let persona2 = new Persona("Carla","Pertosi")
console.log(persona2.toString())
console.log(Persona.contadorPersonas)

let persona3 = new Persona("Jazinto","Pertosi")
console.log(persona3.toString())
console.log(Persona.contadorPersonas)

let persona4 = new Persona("Roberto","Pertosi")
console.log(persona4.toString())
console.log(Persona.contadorPersonas)

let persona5 = new Persona("Alfari","Pertosi")
console.log(persona5.toString())
console.log(Persona.contadorPersonas)//Aca con el if,superamos el metodo static