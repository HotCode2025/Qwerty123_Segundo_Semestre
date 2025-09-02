#Modificar los elementos de una lista
#Llenar una lista con los numeros del 1 al 10.
#Modificarlos por un valor asignado por el usuario multiplicandolos
lista = []
for i in range(1,11):
    lista.append(i)

print(f"Lista del 1 al 10 : {lista}")

numero = int(input("Digite un numero para multiplicar la lista : "))

lista2 = []
for i in lista:
    lista2.append(i * numero)
    
print(f"La lista multiplicada por {numero} es: {lista2}")