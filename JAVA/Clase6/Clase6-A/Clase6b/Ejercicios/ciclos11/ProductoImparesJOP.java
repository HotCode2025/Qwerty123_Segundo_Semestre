package ciclos11;

import javax.swing.JOptionPane; // Importamos la clase JOptionPane

public class ProductoImparesJOP {

    public static void main(String[] args) {
        
        // 'long' para que quepa el resultado. Se inicializa en 1.
        long producto = 1;
        
        // Un String para construir el texto de la operación.
        String numerosMultiplicados = "";
        
        // El mismo bucle para recorrer los impares del 1 al 19.
        for (int i = 1; i <= 19; i += 2) {
            
            producto *= i;
            
            numerosMultiplicados += i;
            
            if (i < 19) {
                numerosMultiplicados += " x ";
            }
        }
        
        // Creamos el mensaje final para la ventana.
        String mensajeFinal = "El producto de los 10 primeros números impares es:\n\n" +
                              numerosMultiplicados + "\n\n" +
                              "= " + producto;
                              
        // Mostramos el resultado en la ventana de diálogo.
        JOptionPane.showMessageDialog(null, mensajeFinal);
    }
}
