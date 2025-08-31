#Uso de la funcion "range"


print("Rango de 0 a 10 con numeros divisibles entre 3")
for i in range(11):
    if i % 3 == 0:
        print(i)
        
print("Rango con valores de inicio  = 2 y fin = 6")
for i in range(2,7):
    print(i)
    
print("Rango con valores de inicio = 3 y fin = 10, con incremento de 2 en 2")
for i in range(3,11, 2):
    print(i)