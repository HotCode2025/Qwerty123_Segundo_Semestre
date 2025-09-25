import javax.swing.JOptionPane;

public class pruebaNumeros {
    public static void main(String[] args) {
        Numeros num = new Numeros();
        /*
        int resultado = num.sumarConScanner();
        System.out.println("La suma de los 10 numeros es: "+resultado);
        */
        
        //Forma con Joption        
        int resultado = num.sumarConJOptionPane();

        JOptionPane.showMessageDialog(null,"La suma de los 10 numeros es: "+resultado);
    }
}
