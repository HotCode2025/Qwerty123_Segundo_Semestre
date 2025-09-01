# Ejercicio 2
# Definimos dos listas de ejemplo (pueden modificarse)
lista1 = ["manzana", "pera", "banana", "uva", "manzana", "naranja"]
lista2 = ["banana", "kiwi", "pera", "melon", "pera", "sandía"]

# Convertimos a conjuntos para eliminar duplicados
set1 = set(lista1)
set2 = set(lista2)

# 1. Palabras que aparecen en las listas (unión)
todas = list(set1 | set2)

# 2. Palabras que aparecen en la primera lista pero no en la segunda (diferencia)
solo_primera = list(set1 - set2)

# 3. Palabras que aparecen en la segunda lista pero no en la primera (diferencia)
solo_segunda = list(set2 - set1)

# 4. Palabras que aparecen en ambas listas (intersección)
en_ambas = list(set1 & set2)

# Mostrar resultados
print("Lista 1:", lista1)
print("Lista 2:", lista2)
print("\n1) Todas las palabras:", todas)
print("2) Solo en la primera:", solo_primera)
print("3) Solo en la segunda:", solo_segunda)
print("4) En ambas:", en_ambas)
