package JAVA.Clase9.Test;

import JAVA.Clase9.Dominio.*;
import java.time.LocalDate;

public class Herencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ariel",65000);
        System.out.println("Empleado"+empleado1);
        Cliente cliente1 = new Cliente("Alberto",LocalDate.of(1999, 11, 23), false);
        System.out.println("cliente1 : "+cliente1);
    }
}
