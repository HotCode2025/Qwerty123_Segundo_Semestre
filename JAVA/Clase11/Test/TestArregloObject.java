package JAVA.Clase11.Test;

import JAVA.Clase11.domain.Persona;

public class TestArregloObject {
    public static void main(String[] args) {
        Persona personas [] = new Persona[2];
        personas [0] = new Persona("Ariel");
        personas [1] = new Persona("Osvaldo");
        System.out.println("persona del array [0] =" + personas[0]);
        System.out.println("persona del array [1] =" + personas[1]);

        //Forma mas legible para leer un array
        for(int i  = 0 ; i < personas.length; i ++){
            System.out.println("personas "+ i +" = "+personas[i]);
        }

        //ARREGLOS CON SINTAXIS RESUMIDA
        String frutas [] = {"Banana","Pera","Durazno"};
        for(int i = 0 ; i < frutas.length ; i++){
            System.out.println("Frutas "+ i+" = " + frutas[i]);
        }
            
    }
}