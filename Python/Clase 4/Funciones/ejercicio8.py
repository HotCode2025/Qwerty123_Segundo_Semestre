# Ejercicio 8: Menú interactivo - Cajero automático con funciones

#Funcion para el menu
def mostrar_menu():
    print("\n--- Cajero Automático ---")
    print("1. Ingresar dinero en la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. Salir")

#Funcion para ingresar el dinero al saldo
def ingresar_dinero(saldo):
    ingreso = float(input("Ingrese la cantidad de dinero a depositar: "))
    saldo += ingreso
    print(f"Has ingresado ${ingreso}. Tu saldo actual es: ${saldo}")
    return saldo

#Funcion para retirar el dinero del saldo
def retirar_dinero(saldo):
    retiro = float(input("Ingrese la cantidad de dinero a retirar: "))
    if retiro > saldo:
        print("Fondos insuficientes ")
    else:
        saldo -= retiro
        print(f"Has retirado ${retiro}. Tu saldo actual es: ${saldo}")
    return saldo

#funcion para mostrar el saldo
def mostrar_saldo(saldo):
    print(f"Tu saldo disponible es: ${saldo}")

#funcion para ejecutar nuestro programa con sus funciones
def cajero():
    saldo = 1000  # saldo inicial
    while True:
        mostrar_menu()
        opcion = input("Seleccione una opción: ")

        if opcion == "1":
            saldo = ingresar_dinero(saldo)
        elif opcion == "2":
            saldo = retirar_dinero(saldo)
        elif opcion == "3":
            mostrar_saldo(saldo)
        elif opcion == "4":
            print("Gracias por usar el cajero automático. ¡Hasta luego!")
            break
        else:
            print("Opción inválida. Intente de nuevo.")

# Ejecuto el programa
cajero()
