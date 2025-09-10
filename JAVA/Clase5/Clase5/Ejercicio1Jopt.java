package Clase5;

import javax.swing.JOptionPane;

public class Ejercicio1Jopt {
    public static void main(String[] args) {

        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero :"));
        for (int i = 1; i <= numero; i++){
                JOptionPane.showMessageDialog(null,"los numeros desde 1 hasta "+numero+ " es :"+ i);
        }
    }
}    
