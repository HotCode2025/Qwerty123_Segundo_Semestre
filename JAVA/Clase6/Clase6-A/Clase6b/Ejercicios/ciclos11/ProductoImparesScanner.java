package Ciclos11;

import java.util.Scanner; // Importamos la clase Scanner

public class ProductoImparesScanner {

    public static void main(String[] args) {
        
        // Usamos 'long' para el producto porque el resultado es muy grande.
        long producto = 1; 
        
        // Usamos un String para mostrar la operación.
        String numerosMultiplicados = "";
        
        // Bucle for que genera los 10 primeros números impares.
        for (int i = 1; i <= 19; i += 2) {
            
            // Multiplicamos el producto actual por el número impar.
            producto *= i;
            
            // Añadimos el número al String.
            numerosMultiplicados += i;
            
            // Añadimos " x " si no es el último número.
            if (i < 19) {
                numerosMultiplicados += " x ";
            }
        }
        
        // Mostramos el resultado en la consola.
        System.out.println("El producto de los 10 primeros números impares es:");
        System.out.println(numerosMultiplicados + " = " + producto);
    }
}
