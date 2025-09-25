package Ciclos12;

import javax.swing.JOptionPane;

public class FactorialNumeroJOP {

    public static void main(String[] args) {
        
        // Pedimos el número al usuario.
        String input = JOptionPane.showInputDialog("Digite un número para calcular su factorial:");
        int numero = Integer.parseInt(input);
        
        long factorial = 1;
        
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "No se puede calcular el factorial de un número negativo.");
        } else {
            // El bucle para calcular el factorial es idéntico.
            for (int i = numero; i >= 1; i--) {
                factorial *= i;
            }
            
            String mensajeFinal = "El factorial de " + numero + " es: " + factorial;
            JOptionPane.showMessageDialog(null, mensajeFinal);
        }
    }
}
