package JAVA.Clase7.Test;

import JAVA.Clase7.Dominio.Persona;

public class test {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57000, false);
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        //MODIFICAMOS A TRAVES DE LOS METODOS

        persona1.setNombre("Roberto");
        System.out.println("Persona1 con su nombre modificado :"+persona1.getNombre());
        System.out.println("Su sueldo es: "+ persona1.getSueldo());
        System.out.println("Es eliminado :"+persona1.isEliminado());
        System.out.println("Persona1 :" +persona1);


        //OBJETO NUEVO
        Persona persona2 = new Persona("Ariel", 120000, false);
        //METODOS GETTER
        System.out.println("Persona2 nombre :"+persona2.getNombre());
        System.out.println("Persona2 sueldo :" +persona2.getSueldo());
        System.out.println("Persona2 eliminado :" +persona2.isEliminado());
        //METODO TO STRING
        System.out.println("Persona 2 : "+persona2);

        //METODO SETTER
        persona2.setNombre("Roberto");
        persona2.setSueldo(1200);
        persona2.setEliminado(true);
        System.out.println("Persona 2 con setter :"+persona2);
    }
}