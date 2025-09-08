# Ejercicio 11: Agenda telefonica
# Hacer un programa que simule una agenda de contactos.
# Crear un diccionario donde la clave sea el nombre de usuario
# y el valor sea el telefono, el programa tendrá el siguiente menú de opciones: 
#    1. Nuevo contacto 
#    2. Borrar contacto
#    3. Ver contacto existentes 
#    4. Salir

agenda = {}

while True: 
    print("--- Agenda telefónica ---")
    print("1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")

    opcion = input("Elige una opción: ")

    if opcion == "1": 
        nombre = input("Nombre: ")
        telefono = input("Telefóno: ")
        if nombre in agenda: 
            print("El contacto ya existe.")
        else:
            agenda[nombre] = telefono
            print("Contacto agregado.")

    elif opcion == "2": 
        nombre = input("Digite el contacto que quiera borrar: ")
        if nombre in agenda: 
            del agenda[nombre]
            print("Contacto borrado.")
        else: 
            print("El contacto no existe.")

    elif opcion == "3": 
        if len(agenda) == 0: 
            print("La agenda está vacía.")
        else:
            print("--- Contactos ---")
            for nombre, telefoono in agenda.items(): 
                print(f"{nombre}: {telefono}")
    elif opcion == "4": 
        print("Saliendo de la agenda...")
        break
    else: print("Opción no valida intente de nuevo.")