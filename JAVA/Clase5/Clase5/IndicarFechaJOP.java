package Clase5;

import javax.swing.JOptionPane;

public class IndicarFechaJOP {

    public static void main(String[] args) {
        
        // 1. Pedimos al usuario cada parte de la fecha por separado.
        String diaStr = JOptionPane.showInputDialog("Digite el día:");
        String mesStr = JOptionPane.showInputDialog("Digite el mes:");
        String anioStr = JOptionPane.showInputDialog("Digite el año:");

        try {
            // 2. Convertimos las entradas de texto a números enteros.
            int dia = Integer.parseInt(diaStr);
            int mes = Integer.parseInt(mesStr);
            int anio = Integer.parseInt(anioStr);

            // 3. Verificamos la fecha con la misma lógica que antes.
            //    (Día entre 1-30, Mes entre 1-12, Año no es 0)
            if ((dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12) && (anio != 0)) {
                // Si es correcta, mostramos un mensaje de éxito.
                JOptionPane.showMessageDialog(null, "La fecha " + dia + "/" + mes + "/" + anio + " es CORRECTA.");
            } else {
                // Si no, mostramos un mensaje de error.
                JOptionPane.showMessageDialog(null, "La fecha " + dia + "/" + mes + "/" + anio + " es INCORRECTA.");
            }
        } catch (NumberFormatException e) {
            // 4. Si el usuario ingresa algo que no es un número, se captura el error.
            JOptionPane.showMessageDialog(null, "Error: Por favor, ingrese solo valores numéricos.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            // 5. Si el usuario cierra una ventana o presiona "Cancelar".
             JOptionPane.showMessageDialog(null, "Operación cancelada por el usuario.", "Cancelado", JOptionPane.WARNING_MESSAGE);
        }
    }
}
