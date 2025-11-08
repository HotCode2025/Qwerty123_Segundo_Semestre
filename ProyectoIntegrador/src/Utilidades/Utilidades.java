package Utilidades;


public class Utilidades {

    // Constructor privado para evitar instanciación
    private Utilidades() {
        throw new UnsupportedOperationException("Clase de utilidad: no se puede instanciar");
    }

    public static int letraAColumna(char letra) { //ESTO ES POR EL TAMAÑO DEL TABLERO
        return switch (letra) {
            case 'A' -> 0;
            case 'B' -> 1;
            case 'C' -> 2;
            case 'D' -> 3;
            case 'E' -> 4;
            case 'F' -> 5;
            case 'G' -> 6;
            case 'H' -> 7;
            default -> -1;
        };
    }

    /**
     * Convierte una cadena de coordenada (ej: "A5", "h3") a un arreglo [fila, columna].
        param coordenada Cadena como "A5", "b2", etc.
     *  return int[]{fila, columna} o null si es inválida
     */
    public static int[] parsearCoordenada(String coordenada) {
        if (coordenada == null || coordenada.length() < 2) {
            return null;
        }

        // Normalizar: todo a mayúsculas y quitar espacios
        coordenada = coordenada.trim().toUpperCase();

        char letra = coordenada.charAt(0);
        String numStr = coordenada.substring(1).trim();

        // Validar que el resto sea numérico
        if (!numStr.matches("\\d+")) {
            return null;
        }

        int columna = letraAColumna(letra);
        int fila;
        try {
            fila = Integer.parseInt(numStr) - 1; // -1 porque el tablero es 0-7 y el jugador ve 1-8
        } catch (NumberFormatException e) {
            return null;
        }

        // Validar rangos, para que no se salga del TABLERO DISEÑADO
        if (columna < 0 || columna > 7 || fila < 0 || fila > 7) {
            return null;
        }

        return new int[]{fila, columna};
    }
}