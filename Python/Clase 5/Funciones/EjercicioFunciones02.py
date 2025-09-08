# Ejercicio 2: función con *args para multiplicar
# Crear una función para multiplicar los valores recibidos
# de tipo numérico, utilizando argumentos variables *args
# como parámetro de la función y regresar como resultado
# la multiplicación de todos los valores pasados como argumentos.

def multiplicar_valores(*args):
    
    resultado = 1
    for numero in args:
        resultado *= numero
    return resultado

# 1. Definimos una tupla con los números que queremos usar.
mis_numeros = (3, 5, 15, 2) 

# 2. Llamamos a la función "desempaquetando" la tupla con el operador *.
resultado_final = multiplicar_valores(*mis_numeros)

# 3. Imprimimos el resultado.
print(f"La tupla de números es: {mis_numeros}")
print(f"El resultado de la multiplicación es: {resultado_final}")