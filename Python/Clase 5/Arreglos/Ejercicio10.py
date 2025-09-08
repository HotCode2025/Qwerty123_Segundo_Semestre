# Ejercicio 10: No repetir caracteres
# Hacer un programa que pida una cadena porteclado, luego 
# meter los caracteres en una lista sin repetir caracteres

# Pedir al usuario una cadena
cadena = input("Escribe una cadena: ")

# Creamos una lista vacía 
lista = []

# Recorrer la cadena en caracter por caracter
for caracter in cadena:
    if caracter not in lista: # Si no está en la lista la letra, la añadimos
        lista.append(caracter) 

print(f"Lista sin caracteres repetidos: {lista}")