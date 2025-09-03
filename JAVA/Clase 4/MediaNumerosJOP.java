
package ciclos07;

import javax.swing.JOptionPane;

public class MediaNumerosJOP {

    public static void main(String[] args) {
        int numero;
        int contador = 0; // Para saber cuántos números se ingresaron.
        float suma = 0;   // Usamos float para que la división de la media sea precisa.
        String numerosIngresados = ""; // Para guardar la lista de números.

        // El bucle se ejecutará indefinidamente hasta que se rompa con un 'break'.
        while (true) { 
            String input = JOptionPane.showInputDialog(
                "Digite un número (uno negativo para salir):"
            );
            numero = Integer.parseInt(input);

            // Si el número es negativo, salimos del bucle.
            if (numero < 0) {
                break; 
            }
            
            // Si llegamos aquí, el número es positivo o cero.
            suma += numero;                 // Acumulamos la suma.
            numerosIngresados += numero + " "; // Lo añadimos a la lista.
            contador++;                     // Incrementamos el contador.
        }

        // Preparamos el mensaje final.
        String mensajeFinal;

        if (contador == 0) {
            // Si no se ingresó ningún número válido.
            mensajeFinal = "No se introdujeron números positivos.";
        } else {
            // Si se ingresaron números, calculamos la media.
            float media = suma / contador;
            mensajeFinal = "Los números ingresados fueron: " + numerosIngresados +
                           "\nLa media de los números es: " + media;
        }

        // Mostramos el resultado.
        JOptionPane.showMessageDialog(null, mensajeFinal);
    }
}
