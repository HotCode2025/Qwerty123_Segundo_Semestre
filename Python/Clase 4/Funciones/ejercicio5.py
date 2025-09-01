# Programa para calcular el factorial de un número positivo

num = int(input("Ingrese un número positivo: "))

if num < 0:
    print("INngresaste un num negativo, este factorial requiere uno positivo")
else:
    factorial = 1
    for i in range(1, num + 1):
        factorial *= i
    
    print(f"El factorial de {num} es: {factorial}")
