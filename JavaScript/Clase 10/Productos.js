class Producto{
    static contadorProductos = 0

    constructor(nombre,precio){
        this._idProducto = ++Producto.contadorProductos
        this._nombre = nombre
        this._precio = precio
        
    }

    //GETTER AND SETTER
    get idProducto(){
        this._idProducto
    }
    get nombre(){
    this._nombre
    }
    set nombre(nombre){
    this._nombre = nombre
    }

    get precio(){
        this._precio
    }
    set precio(precio){
        this._precio = precio
    }

    //Usando template literal
    toString(){
        return ` ${this.idProducto}
                ${this._nombre}
                ${this._precio}`
    }
}