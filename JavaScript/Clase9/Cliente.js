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
        return `${super.toString()}
                ${this.idCliente}
                ${this._fechaRegistro}`
    }

}