#Conjuntos o Set
#con los conjuntos, no se pueden duplicar datos

planetas = {"Marte","Jupiter","Venus"}
print(len(planetas))# Usamos la funcion len = length(longitud)
#Para ver cuantos elementos tiene el "Set"


#De esta forma revisamos si hay un elemento en el conjunto
print("Jupiter" in planetas)# Nos va a devolver un valor booleano


#De esta forma agregamos un elemento
planetas.add("Tierra")
print(planetas)

#Eliminar un elemento
planetas.remove("Jupiter")#esta funcion puede largar un error si el elemento no existe
planetas.discard("Tierra")#De esta forma no largara error si no encuentra el elemento
print(planetas)


#Limpiando el set

#planetas.clear()


#Eliminando el set

#del planetas

#La funciones "clear" y "del" las comente para seguir con los ejercicios
#La diferencia de "clear" es que vacia el conjunto,mientras que "del" elimina el conjunto




#Diccionarios
#Se definen por "key" y "value",donde "key" se encuentra a la izquierda de los ":"
#Y "value" a la derecha
diccionario = {
    "IDE":"Integrated Development Environment",
    #Para que el diccionario funcione hay que agregar una coma
    #Si vamos a agregar mas de un elemento
    "POO": "Programacion Orientada a Objetos",
    "SABD": "Sistema de Administracion de Base de Datos"    
}
print(diccionario)


#Mostramos la cantidad de elementos en el diccionario
print(len(diccionario))

#Podemos llamar a un elemento(key) dentro del diccionario
print(diccionario["IDE"])

#La funcion "get"(Obtener) tambien sirve para llamar una key
print(diccionario.get("POO"))
print(diccionario.get("SABD"))


#Modificar un elemento del diccionario
diccionario["IDE"] = "Entorno de Desarollo Integrado"
print(diccionario["IDE"])



#Recorriendo los elementos
#Usamos un ciclo "Para"(for)

for llaves in diccionario:
    print(llaves)
#Aca solo mostramos las llaves(key)
    
for llaves,valor in diccionario.items():
    print(llaves,valor)
#Aca vamos a mostrar las llaves con sus respectivos valores


#Otra forma de recorrer con funciones
for llaves in diccionario.keys():#Aca le damos la funcion ".keys"
    print(llaves)
    
    
for valor in diccionario.values():#Aca le damos funcion ".values"
    print(valor)
    
    
#Comprobando la existencia de algun elemento dentro del diccionario

print("IDE" in diccionario)#Nos devolvera un booleano


#Agregamos un elemento al diccionario
diccionario["PK"] = "Primary Key"
print(diccionario)



#Eliminar un elemento en diccionarios
diccionario.pop("PK")
print(diccionario)



#Vaciando un diccionario

#diccionario.clear()


#Eliminar diccionario
#del diccionario