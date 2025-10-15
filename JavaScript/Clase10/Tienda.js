// ===== CLASE PRODUCTO =====
class Producto {
    static contadorProductos = 0;

    constructor(nombre, precio) {
        this._idProducto = ++Producto.contadorProductos;
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
    //Template string
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
        // Validar que sea una instancia de Producto
        if (!(producto instanceof Producto)) {
            console.log("Solo se pueden agregar instancias de Producto.");
            return false;
        }

        if (this._productos.length >= Orden.MAX_PRODUCTOS) {
            console.log(`No se pueden agregar más de ${Orden.MAX_PRODUCTOS} productos. Cree una nueva orden.`);
            return false;
        }
        //Esto con ayuda de IA
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
const producto2 = new Producto("Snack", 1500);

const orden1 = new Orden(); 
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);

console.log(orden1.mostrarOrden());