// ===== CLASE PRODUCTO =====
class Producto {
    static contadorProductos = 0;   //contador global de cuantos productos se crearon

    constructor(nombre, precio) {
        this._idProducto = ++Producto.contadorProductos;    //incremento el contador estatico y le asigno ese valor al ID del producto
        this._nombre = nombre;                          
        this._precio = precio;
    }

    // GETTERS Y SETTERS
    get idProducto() {
        return this._idProducto;
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre) {
        this._nombre = nombre;
    }

    get precio() {
        return this._precio;
    }

    set precio(precio) {
        this._precio = precio;
    }
    //Template string  para mostrar informacion ordenada
    toString() {
        return `\nID:${this._idProducto}
        Nombre: ${this._nombre}
        Precio: ${this._precio}\n`;
    }
}

// ===== CLASE ORDEN =====
class Orden {
    static MAX_PRODUCTOS = 5;
    static contadorOrdenes = 0;

    constructor() {
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = []; // Array para guardar instancias de Producto
    }

    agregarProducto(producto) {
        // Validar que sea una instancia de Producto donde el array no exceda el maximo de productos
        if (!(producto instanceof Producto)) {
            console.log("Solo se pueden agregar instancias de Producto.");
            return false;
        }

        if (this._productos.length >= Orden.MAX_PRODUCTOS) {
            console.log(`No se pueden agregar más de ${Orden.MAX_PRODUCTOS} productos. Cree una nueva orden.`);
            return false;
        }
        //
        this._productos.push(producto);
        return true;
    }

    calcularTotal() {
        return this._productos.reduce((total, producto) => total + producto.precio, 0);
    }

    mostrarOrden() {
        return `Orden #${this._idOrden}\nProductos: ${this._productos}\n TOTAL: $${this.calcularTotal()}`;
    }
}

// ===== USO =====
const producto1 = new Producto("Cerveza", 2300);
const producto2 = new Producto("Mani", 1500);
const producto3 = new Producto("Mani2", 1500);
const producto4 = new Producto("Mani3", 1500);
const producto5 = new Producto("Mani4", 1500);
const producto6 = new Producto("Mani5", 1500);

const orden1 = new Orden(); 
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden1.agregarProducto(producto4);
orden1.agregarProducto(producto5);
orden1.agregarProducto(producto6);


console.log(orden1.mostrarOrden());