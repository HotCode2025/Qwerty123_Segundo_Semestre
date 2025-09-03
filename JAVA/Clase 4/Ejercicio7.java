// Ejercicio 7: Pedir números hasta que se introduzca uno negativo 
// y calcular la media 
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero; 
        int suma = 0; 
        int contador = 0; 

        System.out.println("Ingresa números positivos o uno negativo para salir" ); 
        while (true){
            numero = sc.nextInt(); 
            if (numero < 0){
                break;
                }
            suma += numero;
            contador ++;      
        }
        if(contador > 0){
            double media = (double) suma / contador; 
            System.out.println("La media es : " + media); 
        } else {
            System.out.println("No se introdujeron números positivos"); 
        }

    }
}
