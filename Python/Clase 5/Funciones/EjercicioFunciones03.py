# Función recursiva
# Imprimir números de 5 a 1 de manera descendente
# usando funciones recursivas.

def imprimir_numeros_recursivo(numero):
    
    if numero < 1:
        return
    
    # Acción: Imprime el número actual.
    print(numero)
    
    # Llamada Recursiva: La función se llama a sí misma
    # con el siguiente valor (número - 1), acercándose al caso base.
    imprimir_numeros_recursivo(numero - 1)

print("--- Imprimiendo desde el 5: ---")
imprimir_numeros_recursivo(5)
