
package ciclos05;

import javax.swing.JOptionPane;

public class AdivinaNumeroJOP {

    public static void main(String[] args) {
        // 1. Inicializamos las variables
        int numero, aleatorio, conteo = 0;

        // Generamos un número aleatorio entre 0 y 100
        aleatorio = (int)(Math.random() * 101);

        // 2. Bucle para pedir números hasta que el usuario adivine
        do {
            try {
                // Pedimos el número usando una ventana de diálogo
                String input = JOptionPane.showInputDialog("Digite un número para adivinar (0-100):");
                
                // Si el usuario presiona "Cancelar", terminamos el programa
                if (input == null) {
                    return; 
                }
                
                numero = Integer.parseInt(input);

                // Damos pistas al usuario
                if (numero < aleatorio) {
                    JOptionPane.showMessageDialog(null, "-> El número a adivinar es MAYOR");
                } else if (numero > aleatorio) {
                    JOptionPane.showMessageDialog(null, "-> El número a adivinar es MENOR");
                }
                
                conteo++; // Incrementamos el contador de intentos

            } catch (NumberFormatException e) {
                // Manejo de error si no se introduce un número
                JOptionPane.showMessageDialog(null, "Error: Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                numero = -1; // Asignamos un valor que no interrumpa el bucle
            }

        } while (numero != aleatorio); // 3. El ciclo se detiene cuando se adivina el número

        // 4. Mostramos el resultado final en otra ventana
        String mensajeFinal = String.format("¡FELICIDADES! Has adivinado el número %d en %d intentos.", aleatorio, conteo);
        JOptionPane.showMessageDialog(null, mensajeFinal);
    }
}
