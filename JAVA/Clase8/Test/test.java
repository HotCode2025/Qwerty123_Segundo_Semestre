package JAVA.Clase8.Test;

import JAVA.Clase8.Dominio.Persona;

public class test {

    private int contador;


    public static void main(String[] args) {


        //CREACION DE OBJETOS
        Persona persona = new Persona("Ariel");
        System.out.println("Persona 1 : "+ persona);

        Persona persona2 = new Persona("Alberto");
        System.out.println("Persona 2: "+ persona2);

        imprimir(persona);
        imprimir(persona2);
        test personaP1 = new test();
        System.out.println(personaP1.getContador());

    }

    public static void imprimir(Persona persona){
        System.out.println("PERSONA :" + persona);
    }

    public int getContador(){
        imprimir(new Persona("Liliana"));
        return this.contador;
    }
}