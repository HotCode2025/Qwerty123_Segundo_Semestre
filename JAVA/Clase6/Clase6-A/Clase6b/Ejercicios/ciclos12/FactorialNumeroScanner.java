package Ciclos12;

import java.util.Scanner;

public class FactorialNumeroScanner {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite un número para calcular su factorial: ");
        int numero = entrada.nextInt();
        
        // El factorial también puede crecer muy rápido, usamos 'long'.
        long factorial = 1;
        
        // Validamos que el número no sea negativo.
        if (numero < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo.");
        } else {
            // Bucle for que va desde el número ingresado hasta 1.
            for (int i = numero; i >= 1; i--) {
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        
        entrada.close();
    }
}
