package JAVA.Clase11.Test;

import java.util.Arrays;

public class TestArreglos {
    public static void main(String[] args) {
        int edades [] = new int[4];

        System.out.println("edades = "+ Arrays.toString(edades) );
        //Aca le asignamos al indice del array
        edades[0] =17;
        System.out.println("edades 0 = "+ edades[0]);
        //agregamos mas indices al array
        edades[1] = 15;
        edades[2] = 19;
        edades[3] = 18;
        System.out.println("Array = "+ edades[1]);
        System.out.println("Array = "+ edades[2]);
        System.out.println("Array = "+ edades[3]);

        //OTRA FORMA DE RECORRER UN ARRAY
        for ( int i = 0; i < edades.length; i ++){
            System.out.println("array y sus elementos " + i +" : "+ edades[i]);
        }
    }   
}