#Ejercicio 3 Lista de personajes (cada personaje es un diccionario)
personajes = [
    {"Nombre": "Aragorn", "Clase": "Guerrero", "Raza": "Dúnadan del Norte"},
    {"Nombre": "Gandalf", "Clase": "Mago", "Raza": "Istar"},
    {"Nombre": "Legolas", "Clase": "Arquero", "Raza": "Elfo Sindar"}
]

# Mostrar la lista completa de personajes
print("Lista de personajes del Señor de los Anillos:\n")
for personaje in personajes:
    print(f"Nombre: {personaje['Nombre']}, "
          f"Clase: {personaje['Clase']}, "
          f"Raza: {personaje['Raza']}")
