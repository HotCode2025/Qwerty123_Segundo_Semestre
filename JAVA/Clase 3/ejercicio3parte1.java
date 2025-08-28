package Ciclos03;
import java.util.Scanner;

public class Ciclos03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite un número (0 para salir): ");
            numero = entrada.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    System.out.println(numero + " es PAR");
                } else {
                    System.out.println(numero + " es IMPAR");
                }
            }
        } while (numero != 0);

        System.out.println("Programa finalizado.");
    }
}
