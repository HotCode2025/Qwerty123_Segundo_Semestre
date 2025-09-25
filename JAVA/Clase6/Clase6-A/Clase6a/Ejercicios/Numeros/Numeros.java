import java.util.Scanner;
import javax.swing.JOptionPane;

public class Numeros {

    // Constructor por defecto
    public Numeros() {
    }

    // Método para leer 10 números con Scanner y sumarlos
    public int sumarConScanner() {
        int suma = 0;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Ingrese 10 números:");
            for (int i = 1; i <= 10; i++) {
                System.out.print("Número " + i + ": ");
                suma += entrada.nextInt();
            }
        }
        return suma;
    }

    // Metodo con JoptionPane
    public int sumarConJOptionPane() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + i + ":"));
            suma += num;
        }
        return suma;
    }
}


