package Utilidades;


import Proyecto.Jugadores;
import java.util.ArrayList;
import java.util.List;

public class Ranking {
    //ESTABLECEMOS EL MAXIMO DEL RANKING
    private static final int MAX_JUGADORES = 100;
    private final List<Jugadores> jugadores;

    public Ranking() {
        // Inicializamos con capacidad para 100, pero empezamos vacíos
        this.jugadores = new ArrayList<>(MAX_JUGADORES);
    }

    /*
     * Inserta un jugador en la posición correcta según su puntaje (descendente).
     * Si el ranking está lleno y el puntaje es menor que el último, no se inserta.
     */
    public void agregarJugador(Jugadores nuevoJugador) {
        int puntaje = nuevoJugador.getPuntaje();

        // Si ya hay 100 y el nuevo puntaje es peor que el último, no se agrega
        if (jugadores.size() >= MAX_JUGADORES && puntaje <= jugadores.get(MAX_JUGADORES - 1).getPuntaje()) {
            return;
        }

        //ESTE CICLO REPOSICIONA SEGUN EL PUNTAJE 
        int posicion = 0;
        while (posicion < jugadores.size() && jugadores.get(posicion).getPuntaje() > puntaje) {
            posicion++;
        }

        // Insertar en la posición encontrada
        jugadores.add(posicion, nuevoJugador);

        // Si excedemos el límite, eliminamos el último
        if (jugadores.size() > MAX_JUGADORES) {
            jugadores.remove(MAX_JUGADORES);
        }
    }

    /**
     * Muestra el Top 10 del ranking, formateado como en tu pseudocódigo.
     */
    public void mostrarTop10() {
        System.out.println();
        System.out.println("==========================================");
        System.out.println("         TOP 10 MEJORES JUGADORES");
        System.out.println("==========================================");
        System.out.println();
        System.out.println("Pos.  Jugador              Puntaje");
        System.out.println("----  -----------------    -------");

        //CICLO PARA MOSTRAR LAS POSICIONES CON UN "FOR" PARA UN MAXIMO DE 10
        int limite = Math.min(10, jugadores.size());
        for (int i = 0; i < limite; i++) {
            Jugadores j = jugadores.get(i);
            if (j.getPuntaje() <= 0) break;

            // Formato de posición
            String pos = (i < 9) ? " " + (i + 1) + ".   " : (i + 1) + ".   ";

            /*  Formato de nombre,No mostrara mas de 17 caracteres*/
            String nombre = j.getNombre();
            if (nombre.length() > 17) {
                nombre = nombre.substring(0, 17) + "...";
            } else {
                // Rellenar con espacios hasta 20 caracteres para alinear
                while (nombre.length() < 20) {
                    nombre += " ";
                }
            }
            //IMPRESION EN CONSOLA DEL CICLO
            System.out.println(pos + nombre + j.getPuntaje() + " pts");
        }

        System.out.println();
        System.out.println("==========================================");
        System.out.println();
    }
}