# Ejercicio 6: Tabla de multiplicar
# pedir un número, crear la lista de la tabla de multiplicar hasta 10, y mostrarla.

# Pido al usuario que ingrese un número
numero = int(input("Ingrese un número para generar su tabla de multiplicar: "))

# Creo la lista vacía para guardar los resultados
tabla = []

# Genera la tabla de multiplicar del 1 al 10
for i in range(1, 11):
    producto = numero * i  
    tabla.append(producto)  # Guardo el resultado en la lista

# Se muestra la lista completa
print("La tabla de multiplicar del", numero, "es:", tabla)
