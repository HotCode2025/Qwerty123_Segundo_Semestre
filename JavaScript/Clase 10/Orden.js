class Orden{
    static contadorProductosAgregados = 0
    static contadorOrdenes = 0

    constructor(productos){
        this._idProductos = ++Orden.contadorProductosAgregados
        this._idOrden = ++Orden.contadorOrdenes
        this._productos = productos
    }
}