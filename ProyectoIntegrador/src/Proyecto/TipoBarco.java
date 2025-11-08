package Proyecto;


public enum TipoBarco {
    //ENUMERAMOS LOS TIPOS DE BARCOS Y LE ASIGNAMOS UN SIMBOLO(SE PUEDEN SEGUIR AGREGANDO)
    //ESTO ES CONSTANTES CON 2 VALORES(INT,CHAR)
    SUBMARINO(1, 'S'),
    DESTRUCTOR(2, 'D'),
    CRUCERO(3, 'C');

    //LES ASIGNAMOS VALOR FINAL,PARA QUE NO PUEDAN SER MODIFICADOS
    private final int tamaño;
    private final char simbolo;

    // Constructor privado del enum
    TipoBarco(int tamaño, char simbolo) {
        this.tamaño = tamaño;
        this.simbolo = simbolo;
    }

    //GETTERS
    public int getTamaño() {
        return tamaño;
    }

    public char getSimbolo() {
        return simbolo;
    }

    //METODOS PARA SABER EL TIPO DE BARCO
    //ESTATICO, SE LLAMA SOBRE LA CLASE
    public static TipoBarco fromId(int id) {
        return switch (id) {
            case 1 -> SUBMARINO;
            case 2 -> DESTRUCTOR;
            case 3 -> CRUCERO;
            default -> throw new IllegalArgumentException("ID de barco no válido: " + id);
        };
    }
    //METODO DE INSTANCIA, SE LLAMA SOBRE UN NUMERO ESPECIFICO DEL ENUM
    public int toId() {
        return switch (this) {
            case SUBMARINO -> 1;
            case DESTRUCTOR -> 2;
            case CRUCERO -> 3;
        };
    }
}