// ===== CLASE PRODUCTO =====
class Producto {
    static contadorProductos = 0;

    constructor(nombre, precio) {
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

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

    toString() {
        // Se formatea para que cada producto sea una línea clara
        return `{ID: ${this._idProducto}, Nombre: ${this._nombre}, Precio: $${this._precio}}`;
    }
}

// ===== CLASE ORDEN =====
class Orden {
    static MAX_PRODUCTOS = 5;
    static contadorOrdenes = 0;

    constructor() {
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
    }

    agregarProducto(producto) {
        if (!(producto instanceof Producto)) {
            console.log("Solo se pueden agregar instancias de Producto.");
            return false;
        }

        if (this._productos.length >= Orden.MAX_PRODUCTOS) {
            console.log(`No se pueden agregar más de ${Orden.MAX_PRODUCTOS} productos.`);
            return false;
        }
        
        this._productos.push(producto);
        return true;
    }

    calcularTotal() {
        return this._productos.reduce((total, producto) => total + producto.precio, 0);
    }

    // MODIFICADO: Ahora formatea los productos en múltiples líneas
    mostrarOrden() {
        let productosFormateados = '';
        for (let producto of this._productos) {
            productosFormateados += `\n    -> ${producto.toString()}`;
        }
        return `Orden #${this._idOrden} | TOTAL: $${this.calcularTotal()}\nProductos:${productosFormateados}`;
    }
}

// ===== USO =====
console.log("--- Creando Orden 1 ---");
const producto1 = new Producto("Cerveza", 2300);
const producto2 = new Producto("Snack", 1500);
const producto3 = new Producto("Gaseosa", 1800);
const producto4 = new Producto("Agua Mineral", 1200);
const producto5 = new Producto("Jugo", 1600);

const orden1 = new Orden(); 
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden1.agregarProducto(producto4);
orden1.agregarProducto(producto5);

console.log(orden1.mostrarOrden());

// ===== NUEVO: Creación de la Orden 2 =====
console.log("\n--- Creando Orden 2 ---");
const producto7 = new Producto("Vino", 4500);
const producto8 = new Producto("Fernet", 3800);
const producto9 = new Producto("Aceitunas", 1100);

const orden2 = new Orden();
orden2.agregarProducto(producto7);
orden2.agregarProducto(producto8);
orden2.agregarProducto(producto9);

console.log(orden2.mostrarOrden());