package Clase5;

import java.util.Scanner;

public class IndicarFechaScanner {

    public static void main(String[] args) {
        // 2. Pedimos al usuario cada parte de la fecha por separado.
        try ( // 1. Inicializamos el objeto Scanner.
                Scanner entrada = new Scanner(System.in)) {
            // 2. Pedimos al usuario cada parte de la fecha por separado.
            System.out.print("Digite el día: ");
            int dia = entrada.nextInt();
            System.out.print("Digite el mes: ");
            int mes = entrada.nextInt();
            System.out.print("Digite el año: ");
            int anio = entrada.nextInt();
            // 3. Verificamos si la fecha es correcta con una sola condición.
            //    - El día debe estar entre 1 y 30.
            //    - El mes debe estar entre 1 y 12.
            //    - El año no puede ser 0.
            if ((dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12) && (anio != 0)) {
                System.out.println("\nLa fecha " + dia + "/" + mes + "/" + anio + " es CORRECTA.");
            } else {
                System.out.println("\nLa fecha " + dia + "/" + mes + "/" + anio + " es INCORRECTA.");
            }
            // Buena práctica: cerrar el scanner al finalizar.
        }
    }
}
