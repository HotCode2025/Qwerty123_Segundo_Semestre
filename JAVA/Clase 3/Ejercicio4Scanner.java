// Ejercicio 4 con Scanner
// package JAVA.Clase3;
import java.util.Scanner;

public class Ejercicio4Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;

        System.out.println("Introduce números (se detiene con un número negativo):");

        do {
            numero = sc.nextInt();
            if (numero >= 0) {
                contador++;
            }
        } while (numero >= 0);
 // Mostramos la cantidad de números introducidos
        System.out.println("Se han introducido " + contador + " números positivos.");
        sc.close();
    }
}
