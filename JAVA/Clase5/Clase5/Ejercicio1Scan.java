package Clase5;

import java.util.Scanner;

public class Ejercicio1Scan {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)){

            System.out.println("Digite un numero por favor: ");
            var num = Integer.parseInt(entrada.nextLine());

            System.out.println("Numeros desde 1 hasta "+ num + " :");

            for (int i = 1; i <= num; i++){
                System.out.println(i);
            }
        }
    }
}