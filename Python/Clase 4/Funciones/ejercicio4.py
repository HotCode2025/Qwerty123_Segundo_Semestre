# Ejercicio 4: Sumar números pares dentro de un rango por ejemplo del 2 al 30

# Pido al usuario el rango 
inicio = int(input("Ingrese el inicio del rango: "))
fin = int(input("Ingrese el fin del rango: "))

suma = 0

for numero in range(inicio, fin + 1):
    if numero % 2 == 0:  # Verificar si es par
        suma += numero



# Muestro la suma
print(f"La suma de los números pares del {inicio} al {fin} es: {suma}")
