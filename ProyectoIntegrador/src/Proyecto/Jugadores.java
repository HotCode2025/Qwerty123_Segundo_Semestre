package Proyecto;

public class Jugadores {
    //ATRIBUTOS ENCAPSULADOS que solo es accesible desde la clase actual.
    private String nombre;
    private int puntaje;
    //CONSTRUCTOR
    public Jugadores(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    //GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    
}
