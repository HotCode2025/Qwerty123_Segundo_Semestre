# Ejercicio 7: Juego de adivina el numero
import random   # Importo la libreria random para generar los nums aleatorios

numero_secreto = random.randint(1, 100) # Generor un número aleatorio entre 1 y 100
intentos = 0    # Inicializo el contador de intentos
adivinanza = None   # Variable para almacenar el intento del usuario

# Mensaje de presentacion
print("Juego de adivina el numero!!!")
print("Estoy pensando en un número entre 1 y 100. Cual sera?")

# Ciclo principal: se repite hasta que el usuario adivine el número
while adivinanza != numero_secreto:
    
    adivinanza = int(input("Introduce tu número: "))    # Pido al usuario que ingrese un número
    
    intentos += 1   # Icremento el contador de intentos
    
    # Comparamos la adivinanza con el número secreto
    if adivinanza < numero_secreto:
        print("Es mayor")  # La adivinanza es menor al número secreto
    elif adivinanza > numero_secreto:
        print("Es menor")  # La adivinanza es mayor al número secreto
    else:
        print(f"¡Felicidades! Adivinaste el número en {intentos} intentos.")  # Número correcto

#Record Tomas.Andres: 4 intentos