#Decidi crear un archivo nuevo para que el codigo sea mas legible al ejecutar
#Y entender sobre el repaso


#Las listas y las tuplas forman de la agrupacion de datos(Colecciones)
#Se las conocen como arrays(arreglos) o vectors(vectores)

nombres = ["Naty","Osvaldo","Lily","Ariel"]

#A las listas se le pueden agregar diferentes tipos de datos
nombres.append("Marcelo")#Dato tipo String
nombres.append(True)#Dato tipo Boolean
nombres.append([1,2,3])#Lista
nombres.append("10,45")#Dato float
nombres.append(8)#Dato Int
print(nombres)


#Concatenando Listas

listas1 = [1,2,3,1]
listas2 = [4,5,6,1]
listas3 = listas1+listas2
print(f"Concatenacion de listas = {listas3}")


#Agregar varios elementos a la lista con la funcion "extend"
listas3.extend([7,8,9,1])
print(listas3)

#Saber en que indice esta el elemento con la funcion "index"
#Recordar que el recorrido comienza desde 0
print(listas3.index(5))


#Saber cuantos elementos hay repetidos en la lista con la funcion "count"
print(listas3.count(1))


#Para revertir la lista usamos la funcion "reverse"
listas3.reverse()
print(listas3)


#Para multiplicar una lista
listas3 = listas3 * 2
print(listas3)


#Metodo de ordenamiento con la funcion "sort"
listas3.sort()#Con esta funcion por default la ordena de forma ascendente
print(listas3)
listas3.sort(reverse=True)#De esta forma la ordenamos de forma descendente
print(listas3)



#Tuplas
#Recordar que las tuplas son inmutables.
#no se pueden usar funciones o métodos que alteren la tupla
#como agregar, eliminar o modificar elementos
#Al igual que las listas,se pueden crear con elementos de diferentes tipos

tupla = (1,2,3,True,"Letras",[1,2,3],10.45)
print(tupla)

