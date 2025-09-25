//Importado desde mi git personal(modificar la ruta)
//import Clase4.Ejercicios.Metodos.metodos;

public class PasoPorReferencia {
    public static void main(String[] args) {
        metodos persona1 = new metodos();
        persona1.nombre = "Esther";
        System.out.println("Paso por referencia =" + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: "+ persona1.nombre);
        //metodos persona2 = null;
        metodos persona2 = new metodos();
        persona2 = cambiarElValor(persona2);
        System.out.println("El valor del objeto es: "+persona2.nombre);
    }


    public static void cambiarValor(metodos persona){
        persona.nombre = "Maria";
    }

    public static metodos cambiarElValor(metodos persona){
        if(persona == null){
            System.out.println("Valor de persona invalido : null");
            return null;
        }
        else{
            persona.nombre = "Monica";
            return persona;
        }
    }
}
