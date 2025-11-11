package JAVA.Clase8.Dominio;

public class Persona {
    //ATRIBUTOS
    private int idPersona;
    private static int contadorPersona;
    private String nombre;

    //CONSTRUCTOR
    public Persona(String nombre){
        this.nombre = nombre;
        //INCREMENTAMOS EL CONTADOR
        Persona.contadorPersona++;
        //Vamos a asignar un nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        Persona.contadorPersona = contadorPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
    }
    
}