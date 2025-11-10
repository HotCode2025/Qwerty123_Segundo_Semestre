package ProyectoMain;

import Proyecto.Jugadores;
import Proyecto.Tablero;
import Utilidades.Ranking;
import Utilidades.Utilidades;
import java.util.Scanner;

public class BatallaNaval {
    
    //Enum para estados de finalización del juego
    private enum EstadoJuego {
        GANADO,
        PERDIDO_SIN_DISPAROS,
        RENDIDO
    }

    private static final Ranking ranking = new Ranking();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try (scanner) {
            int opcion;
            do {
                mostrarMenu();
                opcion = leerEntero();
                switch (opcion) {
                    case 1 -> jugar();
                    case 2 -> ranking.mostrarTop10();
                    case 3 -> System.out.println("Gracias por jugar. ¡Hasta la próxima!");
                    default -> System.out.println("Opción inválida. Intente nuevamente.");
                }
            } while (opcion != 3);
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("        BATALLA NAVAL - MENÚ");
        System.out.println("=".repeat(40));
        System.out.println("1. Jugar");
        System.out.println("2. Ver Ranking");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int leerEntero() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void jugar() {
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine().trim();
        if (nombre.isEmpty()) nombre = "Jugador";

        final int DISPAROS_TOTALES = 25;
        int puntaje = 125;
        int disparosRestantes = DISPAROS_TOTALES;
        int disparosValidos = 0;

        Tablero tablero = new Tablero();
        tablero.colocarBarco();

        // Estado inicial: asumimos que perderá por disparos (se actualiza al final)
        EstadoJuego estado = EstadoJuego.PERDIDO_SIN_DISPAROS;

        // Bucle de juego
        while (!tablero.juegoFinalizado() && disparosRestantes > 0) {
            System.out.println();
            tablero.mostrarVistaJugador();
            System.out.println("\n Disparos restantes: " + disparosRestantes);
            System.out.println(" Puntaje actual: " + puntaje);
            
            //  Mostrar sugerencia de rendición cada 5 disparos válidos
            if (disparosValidos > 0 && disparosValidos % 5 == 0) {
                System.out.print("\nIngrese coordenada (ej: A5) o 'salir' para rendirse: ");
            } else {
                System.out.print("\nIngrese coordenada (ej: A5): ");
            }

            String input = scanner.nextLine().trim();

            //  Opción de rendirse (solo disponible tras múltiplos de 5 disparos válidos)
            if (disparosValidos > 0 && disparosValidos % 5 == 0) {
                if (input.equalsIgnoreCase("salir") || 
                    input.equalsIgnoreCase("rendirse") || 
                    input.equalsIgnoreCase("q")) {
                    System.out.println("\n Te has rendido tras " + disparosValidos + " disparos válidos.");
                    estado = EstadoJuego.RENDIDO;
                    break;
                }
            }

            // Validar formato de coordenada
            int[] coords = Utilidades.parsearCoordenada(input);
            if (coords == null) {
                System.out.println("\n Formato incorrecto. Usa letra y número (ej: A5).");
                if (disparosValidos > 0 && disparosValidos % 5 == 0) {
                    System.out.println(" Tip: puedes escribir 'salir' ahora para rendirte.");
                }
                continue;
            }

            int fila = coords[0];
            int columna = coords[1];

            // Ejecutar disparo
            boolean disparoValido = tablero.disparar(fila, columna);
            if (!disparoValido) {
                System.out.println("\n Ya disparaste ahí o la coordenada es inválida.");
                continue;
            }

            //  Disparo válido: actualizar contadores
            disparosValidos++;
            disparosRestantes--;

            // Actualizar puntaje y mostrar resultado
            char resultado = tablero.getVistaJugador()[fila][columna];
            if (resultado == 'O') {
                puntaje -= 5;
                System.out.println("\n ¡Agua! (-5 puntos)");
            } else if (resultado == 'X' || resultado == '#') {
                System.out.println("\n ¡Impacto!");
            }

            // Feedback cada 5 disparos válidos
            if (disparosValidos % 5 == 0) {
                System.out.println(" Has completado " + disparosValidos + " disparos válidos.");
            }
        }

        // Determinar estado final
        if (tablero.juegoFinalizado()) {
            estado = EstadoJuego.GANADO;
        } else if (estado != EstadoJuego.RENDIDO) {
            // Solo si no se rindió y se quedó sin disparos
            estado = EstadoJuego.PERDIDO_SIN_DISPAROS;
        }

        // Mostrar resultado final
        mostrarResultadoFinal(tablero, puntaje, disparosRestantes, estado);

        // Guardar en ranking (solo si no se rindió; opcional: ¿guardar rendidos con puntaje negativo?)
        ranking.agregarJugador(new Jugadores(nombre, puntaje));
    }

    private static void mostrarResultadoFinal(Tablero tablero, int puntaje, int disparosRestantes, EstadoJuego estado) {
        /*ESTE METODO VA A MOSTRAR DIFERENTES RESULTADOS DEPENDE COMO TERMINE EL JUEGO:
         * Siempre te va a preguntar si quieres ver la ubicacion de los barcos,tus disparos
         */
        System.out.println();
        System.out.println("=".repeat(50));
        System.out.println("JUEGO FINALIZADO");
        System.out.println("=".repeat(50));

        switch (estado) {
            case GANADO -> {
                System.out.println("\n ¡FELICITACIONES, " + (puntaje >= 100 ? "MAESTRO!" : "CAMPEÓN!") + " ");
                System.out.println("¡Hundiste todos los barcos enemigos!");
                System.out.println("\n Tu desempeño:");
                tablero.mostrarVistaJugador();
            }
            case PERDIDO_SIN_DISPAROS -> {
                System.out.println("\n ¡PERDISTE! Te quedaste sin disparos.");
                System.out.println(" No lograste hundir todos los barcos.");
                
                // Mostrar solución automáticamente al perder por agotamiento
                System.out.println("\n Solución:");
                tablero.mostrarTableroOriginal();
                System.out.println("\n Tus disparos:");
                tablero.mostrarVistaJugador();
            }
            case RENDIDO -> {
                System.out.println("\n  JUEGO INTERRUMPIDO");
                System.out.println("Decidiste rendirte antes de terminar.");
                
                //  Preguntar si quiere ver la solución
                System.out.print("\n¿Quieres ver dónde estaban los barcos? (s/n): ");
                String resp = scanner.nextLine().trim();
                if (resp.isEmpty() || resp.equalsIgnoreCase("s") || resp.equalsIgnoreCase("si")) {
                    System.out.println("\n Solución:");
                    tablero.mostrarTableroOriginal();
                }
                System.out.println("\n Tus disparos:");
                tablero.mostrarVistaJugador();
            }
        }

        

        int disparosUsados = 25 - disparosRestantes;
        System.out.printf("\n Puntaje final: %d puntos%n", puntaje);
        System.out.printf(" Disparos utilizados: %d de 25%n", disparosUsados);
        
        // Mensaje motivacional según puntaje
        if (estado == EstadoJuego.GANADO) {
            System.out.println(" ¡Eres un estratega nato!");
        } else if (puntaje > 50) {
            System.out.println(" ¡Buen intento! Con un poco más de suerte, ¡la próxima es tuya!");
        } else {
            System.out.println(" Consejo: ¡los barcos no se mueven! Estudia patrones para ser mas efectivo con los disparos!.");
        }
        
        System.out.println("=".repeat(50) + "\n");
    }
}