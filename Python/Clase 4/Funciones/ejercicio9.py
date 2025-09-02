# Ejercicio 9: Mostrar una frase sin espacios y contar su longitud


frase = input("Ingrese una frase: ")    # ingreso de la frase

# elemino los espacios
frase_sin_espacios = frase.replace(" ", "")  # replace(" ", "") reemplaza todos los espacios por nada

# cuento los caracteres
cantidad_caracteres = len(frase_sin_espacios)  # len() devuelve la longitud de la cadena

# Muestro la frase final sin espacios
print("Frase final sin espacios:", frase_sin_espacios)

# La cant de caracteres
print("Número de caracteres (sin contar espacios):", cantidad_caracteres)
