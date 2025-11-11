package JAVA.Clase10.Paquetes.ar.com.codesystem.Test;

//import ar.com.codesystem.*;
import JAVA.Clase10.Paquetes.ar.com.codesystem.Utileria;
//import static   ar.com.codesystem.Utileria.imprimir;  DE ESTA FORMA IMPORTAMOS METODOS ESTATICOS


public class TestUtileria {
    public static void main(String[] args) {
        Utileria.imprimir("Saludos a todos los alumnos de la tecnicatura");
        JAVA.Clase10.Paquetes.ar.com.codesystem.Utileria.imprimir("Otra forma de importar");
    }
}