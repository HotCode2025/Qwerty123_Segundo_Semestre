package JAVA.Clase11.Test;

import JAVA.Clase11.domain.Persona;

public class Matrices {
    public static void main(String[] args) {
        //EL Primer indicador de la matriz es la FILA, el segundo la COLUMNA
        int edades [] [] = new int [3] [2];
        System.out.println("Matriz = " + edades);
        //LLENADO DE LA MATRIZ MANUALMENTE
        edades [0][0] = 2;
        edades [0][1] = 3;
        edades [1][0] = 4;
        edades [1][1] = 6;
        edades [2][0] = 7;
        edades [2][1] = 12;
        System.out.println("Matriz [0][0] = " + edades [0][0]);
        System.out.println("Matriz [0][1] = " + edades [0][1]);
        System.out.println("Matriz [1][0] = " + edades [1][0]);
        System.out.println("Matriz [1][1] = " + edades [1][1]);
        System.out.println("Matriz [2][0] = " + edades [2][0]);
        System.out.println("Matriz [2][1] = " + edades [2][1]);

        //LEGIBILIDAD DE CODIGO PARA LA MATRIZ
        for (int fila = 0; fila < edades.length ; fila++) {
            for (int col = 0; col < edades[fila].length ; col++) {
                System.out.println("edades " + fila + " - "+ col + " : " +edades[fila][col]);
            }
        }

        //SINTAXIS SIMPLIFICADA DE UNA MATRIZ
        String frutas [] [] = {{"Limon","Pomelo"},{"Ciruela","Kiwi"},{"Banana","Manzana"} };
        //MOSTRANDO LA MATRIZ
        for (int fila = 0; fila < frutas.length ; fila++) {
            for (int col = 0; col < frutas[fila].length ; col++) {
                System.out.println("Frutas " + fila + " - "+ col + " : " +frutas[fila][col]);
            }
        }


        //CREAMOS UNA MATRIZ A PARTIR DE OBJETOS

        Persona personas [] []= new Persona[2][3];
        personas[0][0] = new Persona("Ariel");
        personas[0][1] = new Persona("Roberto");
        personas[0][2] = new Persona("Pedro");
        personas[1][0] = new Persona("Alberto");
        personas[1][1] = new Persona("Jose");
        personas[1][2] = new Persona("Rigoberto");
        imprimir(personas);
    }
    //METODO PARA LA MATRIZ
    public static void imprimir(Object matriz[][]){
            for (int fila = 0; fila < matriz.length ; fila++) {
                for (int col = 0; col < matriz[fila].length ; col++) {
                System.out.println("Matriz " + fila + " - "+ col + " : " +matriz[fila][col]);
                }
            }
        }
}