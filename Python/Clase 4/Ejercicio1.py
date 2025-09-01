# Ejercicio 1: Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuación
# elimine los elementos repetidos, por último mostrar la lista

# Creamos lista 
numeros = [1, 2, 3, 2, 4, 5, 1, 6, 3, 7, 6, 8, 6]
print(numeros)

# ELiminamos repetidos
numeros = list(set(numeros))

# Mostramos la lista sin números repetidos
print(numeros)