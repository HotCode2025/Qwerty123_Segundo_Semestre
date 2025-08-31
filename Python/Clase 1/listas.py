#Las listas se definen con "[]" y pueden ser redefinidas

nombres = ["Ariel","Osvaldo","Liliana","Natalia"]
#Las variables de las listas,se separan con una ","
print(nombres)
#print(nombres[0]) #Aca estamos llamando individualmente a las variables por los indices
#print(nombres[1])
#print(nombres[2])
#print(nombres[3])

#Para poder mostrar el ultimo elemento en una lista larga se puede usar el indice [-1]



#De igual forma podemos hacer recorridos de indices
print(nombres[0 : 2])#Aca indicamos que recorremos desde el indice "0" hasta el indice "2"


#Modificando una variable de la lista
nombres[3] = "Lily"
nombres[0] = "Natalia"
print(nombres)


#Iterando una lista
for nombre in nombres:
    print(nombre)
else:
    print("Se acabaron los elementos de la lista")


#Usamos la funcion "len" para saber cuantos elementos tiene la lista
print(len(nombres))


#Haciendo uso de la funcion "append" podemos agregar un elemento al array
nombres.append("Marcelo")


#La funcion "Insert" sirve para agregar un elemento en un indice indicado
nombres.insert(1,"Alberto")# De esta forma le damos el indice (primer valor) seguido del elemento
nombres.insert(3,"Debora")

print(nombres)



#Usamos la funcion "remove" para eliminar un elemento de la lista
nombres.remove("Alberto")

#La funcion "pop" nos elimina el ultimo elemento de la lista
nombres.pop()

#La funcion "del" nos permite eliminar un elemento con un indice
#Tambien podemos con esta funcion podemos eliminar la lista completa
del nombres[2]

#Con la funcion "clear" podemos eliminar todos los elementos del array
#nombres.clear()

print(nombres)