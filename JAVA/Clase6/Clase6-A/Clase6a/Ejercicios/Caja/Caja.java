import java.util.Scanner;
import javax.swing.JOptionPane;

public class Caja {
    // Atributos de la clase (usamos int, pero podrías usar double si necesitas decimales)
    int ancho;
    int alto;
    int profundidad;

    // Constructor por defecto
    public Caja() {
        this.ancho = 0;
        this.alto = 0;
        this.profundidad = 0;
    }

    // Constructor con parámetros
    public Caja(int ancho, int alto, int profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    // Método para calcular el volumen
    public int calcularVolumen() {
        return this.ancho * this.alto * this.profundidad;
    }

    // Método para leer datos con Scanner
    public void leerConScanner() {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite el ancho de la caja:");
            this.ancho = Integer.parseInt(entrada.nextLine());

            System.out.println("Digite el alto de la caja:");
            this.alto = Integer.parseInt(entrada.nextLine());

            System.out.println("Digite la profundidad de la caja:");
            this.profundidad = Integer.parseInt(entrada.nextLine());
        }
    }

    // Método para leer datos con JOptionPane
    public void leerConJOptionPane() {
        this.ancho = Integer.parseInt(JOptionPane.showInputDialog("Digite el ancho:"));
        this.alto = Integer.parseInt(JOptionPane.showInputDialog("Digite el alto:"));
        this.profundidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la profundidad:"));
    }
    
}