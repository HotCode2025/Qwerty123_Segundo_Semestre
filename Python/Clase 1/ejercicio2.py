#Dada la sgte tupla
tupla = (13,1,8,3,2,5,8)
#Creamos una lista que solo incluya los numeros menores a 5 e imprimimos

lista = []

for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
#Aca hacemos un recorrido de la tupla y todo elemento de la tupla que cumpla
#con la condicion sera agregada a la lista
print(lista)