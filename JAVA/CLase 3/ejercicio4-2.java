//Ejercicio 4 con JOptionPane

package Ciclos03;
import javax.swing.JOptionPane;

public class EjercicioJOptionPane {
    public static void main(String[] args) {
        int numero;
        int contador = 0;

        do {
            String input = JOptionPane.showInputDialog("Introduce un número (se detiene con un número negativo):");
            numero = Integer.parseInt(input);

            if (numero >= 0) {
                contador++;
            }
        } while (numero >= 0);
 // Mostramos la cantidad de números introducidos
        JOptionPane.showMessageDialog(null, "Se han introducido " + contador + " números positivos.");
    }
}
