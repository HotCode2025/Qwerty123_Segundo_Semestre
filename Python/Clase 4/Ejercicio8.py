#Insertar elementos y ordenarlos
#Pedir numeros y meterlos en una lista
#Hasta que el usuario digite 0
#Mostrar la lista ordenada

lista = []

while True:
    elemento = int(input("Digite un numero :"))
    if elemento == 0:
        break
    lista.append(elemento)

lista.sort()

print(f"La lista que creo, ordenada es : {lista}")
