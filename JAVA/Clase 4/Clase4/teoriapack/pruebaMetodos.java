package teoriapack;


public class pruebaMetodos {
    public static void main(String[] args) {
        //Creacion del Objeto
        metodos Persona;
        Persona = new metodos();//Esto es un llamado al metodo(constructor)
        Persona.nombre = "Ariel";
        Persona.apellido = "Betancurd";
        Persona.obtenerInformacion();
        //Cada objeto ocupa un lugar en la memoria, el valor hexadecimal suele comenzar con 0x

        //Creacion de un 2do objeto
        metodos Persona2 = new metodos();
        System.out.println("persona 2 = "+Persona2);//Direccion de memoria
        System.out.println("persona 1 = "+ Persona);
        Persona2.obtenerInformacion();//Valor "null",es decir le falta valor cargado

        //Aca dandole valor,le damos un lugar en la memoria
        Persona2.nombre = "Osvaldo";
        Persona2.apellido = "Giordanini";
    }
}
