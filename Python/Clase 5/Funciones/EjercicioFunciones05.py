#Ejercicio 5 Funciones : Convertidor de temperaturas
#Realizar un programa con 2 funciones que transforme la temperatura de grados celcius a farenheit y viceversa

def celsius_a_fahrenheit(celsius):
    return (celsius * 9/5) + 32

def fahrenheit_a_celsius(fahrenheit):
    return (fahrenheit - 32) * 5/9

def obtener_temperatura(mensaje):
    while True:
        temp = float(input(mensaje))
        return temp


num = int(input("Digite 1 para temperatura Celsius o 2 para Farenheit "))
        # Obtener temperatura del usuario
if(num == 1):
    temp = obtener_temperatura("Ingresa la temperatura en grados Celsius: ")
    temp_convertida = celsius_a_fahrenheit(temp)
    print(f"\n{temp:.2f}°C equivalen a {temp_convertida:.2f}°F")
elif(num == 2):
    temp = obtener_temperatura("Ingresa la temperatura en grados Fahrenheit: ")
    temp_convertida = fahrenheit_a_celsius(temp)
    print(f"\n{temp:.2f}°F equivalen a {temp_convertida:.2f}°C")
else:
    print("Las opciones deben ser 1 o2 ")