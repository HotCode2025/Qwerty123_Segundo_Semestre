# Ejercicio 01: Crear una función para sumar los valores recibidos de tipo numéricos
# utilizando argumentos variables (*args) y devolver como resultado la suma de todos ellos.

# Definimo la función sumar

def sumar(*args):
    # Inicio variable
    total = 0
    
    # Recorro los valores
    for numero in args:
        total += numero  # sumatoria
    
    # resultado
    return total


# Pruebo la funcion
print(sumar(1, 2, 3))          # rta: 6
print(sumar(10, 20, 30, 40))   # rta: 100
print(sumar(5))                # rta: 5
print(sumar())                 # rta: 0 (ningún número recibido)
