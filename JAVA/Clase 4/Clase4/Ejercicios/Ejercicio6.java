package Ejercicios;
// Ejercicio 6: Pedir números hasta que se teclee 
// un 0, mostrar la suma de todos los números

import java.util.Scanner; 

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero; 
        int suma = 0; 
     do{
        System.out.println("Ingresa un número: ");
         numero = sc.nextInt(); 
         suma += numero; 
    } while (numero != 0);
     
    System.out.println("La suma de todos los números es: " + suma);
    }
}