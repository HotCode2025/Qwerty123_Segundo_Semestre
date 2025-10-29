package JAVA.Clase12.src.ar.com.codesystem.ventas;

public class test {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 9500);
        Producto producto2 = new Producto("Campera", 29900);
        //TAREA
        Producto producto3 = new Producto("Remera", 15000);
        Producto producto4 = new Producto("Medias", 1500);
        Producto producto5 = new Producto("Zapatillas", 35000);
        Producto producto6 = new Producto("Soquetes", 1500);
        Producto producto7 = new Producto("Polera", 16000);
        Producto producto8 = new Producto("Bufanda", 5000);
        Producto producto9 = new Producto("Gorro", 5600);
        Producto producto10 = new Producto("Vicera", 5100);
        
        //CLASE
        Orden orden1 = new Orden();
        //AGREGAMOS PRODUCTOS A LA ORDEN
        orden1.agregarProductos(producto2);
        orden1.agregarProductos(producto1);
        orden1.mostrarOrden();


        //TAREA
        Orden orden2 = new Orden();
        orden2.agregarProductos(producto4);
        orden2.agregarProductos(producto5);
        orden2.agregarProductos(producto9);
        orden2.agregarProductos(producto7);
        orden2.agregarProductos(producto1);

        Orden orden3 = new Orden();
        orden3.agregarProductos(producto8);
        orden3.agregarProductos(producto6);
        orden3.agregarProductos(producto3);
        orden3.agregarProductos(producto10);


        //MOSTRAMOS LAS ORDENES
        orden2.mostrarOrden();
        orden3.mostrarOrden();
    }
}
