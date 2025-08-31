#Las tuplas comparte muchas funciones con las listas
#Pero la diferencia es que sus elementos no pueden ser redefinidos


#Las tuplas pueden ser de un solo elemento,solo que tiene que estar definida 
#por la coma despues del primer elemento
ejemplo = ("Esto es una tupla",)
print(ejemplo)

cocina = ("cuchara","tenedor","cuchillo")
print(len(cocina))


#Accediendo a un elemento de la tupla por indice
print(cocina[0])


#Accediendo a un rango dentro de la tupla
print(cocina[0:1])


#Recorriendo una tupla
for cocinar in cocina:
    print(cocinar, end=" ")# Dentro de la funcion "print" podemos agregar (end= " ") 
#Para evitar los saltos de linea en consola,que por defecto trae


#Usamos la funcion "list" para poder convertir la tupla y modificarla
cocinalista = list(cocina)
cocinalista[0] = "Plato"
#Terminado la modificacion podemos volver a convertir a tupla
cocina = tuple(cocinalista)
#Lo que hicimos aqui,fue convertir la tupla "cocina" a lista(cocinalista)
#Luego modificamos la lista y la volvimos a convertir a tupla
print("\n", cocina)