
package Ciclos05;

import java.util.Scanner;

public class AdivinaNumeroScanner {

    public static void main(String[] args) {
        // 1. Inicializamos las herramientas y variables
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, conteo = 0;

        // Generamos un número aleatorio entre 0 y 100
        aleatorio = (int)(Math.random() * 101); // Multiplicamos por 101 para incluir el 100

        // 2. Bucle para pedir números hasta que el usuario adivine
        do {
            System.out.print("Digite un número para adivinar: ");
            numero = entrada.nextInt();

            if (numero < aleatorio) {
                System.out.println("-> Es MAYOR que " + numero);
            } else if (numero > aleatorio) {
                System.out.println("-> Es MENOR que " + numero);
            }
            
            conteo++; // Incrementamos el contador en cada intento

        } while (numero != aleatorio); // 3. El ciclo termina cuando los números son iguales

        // 4. Mostramos el mensaje de felicitación y el número de intentos
        System.out.println("\n¡FELICIDADES! Has adivinado el número.");
        System.out.println("El número era: " + aleatorio);
        System.out.println("Número de intentos: " + conteo);
        
        entrada.close();
    }
}
