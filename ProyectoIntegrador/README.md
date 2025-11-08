## GUIA SOBRE EL PROYECTO

Creamos el dominio(Jugadores,Tablero,TipoBarco) y 2 clases de utilidad(Ranking,Utilidad)

Estas clases las ensamblamos en un main


# Jugadores

Esta clase es basica, se creo un constructor con sus getter and setter con sus variables encapsuladas.


# Tablero

    ESTA ES LA CLASE MAS IMPORTANTE

Tiene casi todos los metodos que vamos a utilizar para que funcione el juego.

Preparamos el tablero con sus dimensiones, importamos los barcos y utilizamos RANDOM para aleatorizar la ubicacion de estos.

Tambien creamos el sistema de disparos. Y por ultimo creamos un metodo para mostrar el tablero al usuario.

# TipoBarco

¿Por qué usar enum y no class aquí?
Porque estás modelando un conjunto fijo, conocido y finito de constantes con comportamiento asociado — y eso es exactamente para lo que fue creado enum en Java

TipoBarco se implementa como enum porque representa un conjunto cerrado y fijo de tipos de barcos, cada uno con atributos (tamaño, símbolo) y comportamiento asociado (toId(), fromId()). El uso de enum garantiza seguridad de tipo, evita instancias no válidas, permite comparaciones eficientes (==), y facilita el mantenimiento frente a cambios. Es la solución idiomática en Java para este patrón. 

# Ranking

Clase de utilidad, que crea un ranking de las veces jugadas. Utiliza la clase "Jugadores" para agregarlos e identificarlos en un maximo de 100
El metodo solo mostrara solo los 10 primeros,por un tema de logica

# Utilidades

Clase de utilidad con métodos estáticos para operaciones comunes en el juego.
    Esto nos va falicitar hacer el disparo ejemplo:(A1)

## MAIN

En el main usamos todos los metodos importados,para que el juego funcione

    Creamos un Menu interactivo para el usuario
