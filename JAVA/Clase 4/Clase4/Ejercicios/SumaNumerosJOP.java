
package Ejercicios;

import javax.swing.JOptionPane;

public class SumaNumerosJOP {

    public static void main(String[] args) {
        int numero;
        int suma = 0;
        // String para guardar los números que el usuario ingrese.
        String numerosIngresados = "";

        do {
            String input = JOptionPane.showInputDialog("Digite un número (0 para salir):");
            numero = Integer.parseInt(input);
            
            // Verificamos que el número no sea cero antes de procesarlo.
            if (numero != 0) {
                suma += numero;
                // Agregamos el número al string.
                numerosIngresados += numero + " ";
            }

        } while (numero != 0);

        // Creamos el mensaje final combinando la lista de números y la suma.
        String mensajeFinal = "Los números ingresados fueron: " + numerosIngresados +
                              "\nLa suma de todos los números es: " + suma;

        // Mostramos todo en un único cuadro de diálogo.
        JOptionPane.showMessageDialog(null, mensajeFinal);
    }
}