class Persona{

    static contadorPersonas = 0

    constructor(nombre,apellido,edad){
        this._idPersona = ++Persona.contadorPersonas
        this._nombre = nombre
        this._apellido = apellido
        this._edad = edad
    }
    //GETTER AND SETTER
    get idPersona(){
        this._idPersona
    }
    get nombre(){
        this._nombre
    }
    set nombre(nombre){
        this._nombre = nombre
    }
    get apellido(){
        this._apellido
    }
    set apellido(apellido){
        this._apellido = apellido
    }

    get edad(){
        this._edad
    }
    set edad(edad){
        this._edad = edad
    }

    toString(){
        return `${this._idPersona} ${this._nombre} ${this._apellido} ${this._edad}`
    }
}

class Empleado extends Persona{

    static contadorEmpleados = 0


    constructor(nombre,apellido,edad,sueldo){
        super(nombre,apellido,edad)
        this._idEmpleado = ++Empleado.contadorEmpleados
        this._sueldo = sueldo
    }


    //GETTER AND SETTER
    get idEmpleado(){
        return this._idEmpleado
    }
    get sueldo(){
        this._sueldo
    }
    set sueldo(sueldo){
        this._sueldo = sueldo
    }


    toString(){
        return `${super.toString()} ${this._idEmpleado} ${this._sueldo}`  
    }
}


class Cliente extends Persona{
    static contadorCliente = 0


    constructor(nombre,apellido,edad,fechaRegistro){
        super(nombre,apellido,edad)
        this._idCliente = ++Cliente.contadorCliente
        this._fechaRegistro = fechaRegistro
    }
    //GETTER AND SETTER
    get idCliente(){
        return this._idCliente
    }
    get fechaRegistro(){
        return this._fechaRegistro
    }

    set fechaRegistro(fechaRegistro){
        this._fechaRegistro = fechaRegistro
    }

    toString(){
        return `${super.toString()} ${this.idCliente} ${this._fechaRegistro}`
    }

}

//CREACION DE OBJETOS

//CLASE PADRE "PERSONA"
let persona1 = new Persona("Juan","Perez",32)
console.log(persona1.toString())
let persona2 = new Persona("Carla","Ortega",22)
console.log(persona2.toString())

//CLASE HIJA "EMPLEADO"
let empleado1 = new Empleado("Pedro","Roman",22,3500)
console.log(empleado1.toString())

let empleado2 = new Empleado("Alberto","Lopez",33,123213)
console.log(empleado2.toString())

//CLASE HIJA "CLIENTE"

let cliente1 = new Cliente("Miguel","Zala",22,3500,new Date())
console.log(cliente1.toString())

let cliente2 = new Cliente("Roberto","Zapata",55,1232132,new Date())
console.log(cliente2.toString())