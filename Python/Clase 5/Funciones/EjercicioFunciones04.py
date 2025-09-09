#Ejercicio 4 Funcion: Calculadora de impuesto
#Crear un programa para calcular el total de un pago con impuesto
#Formula = pago_total = pago_sin_impuesto +  pago_sin_impuesto * (impuesto/100)
def calcular_pago_con_impuesto(pago_sin_impuesto, impuesto_porcentaje):
    
    # Aplicamos la fórmula: pago_total = pago_sin_impuesto * (1 + impuesto/100)
    pago_total = pago_sin_impuesto * (1 + impuesto_porcentaje / 100)
    return pago_total

def obtener_valor_numerico(mensaje):
    while True:
        try:
            valor = float(input(mensaje))
            if valor < 0:
                print("Error: El valor no puede ser negativo")
            else:
                return valor
        except ValueError:
            print("Error: Debes ingresar un número válido")

# Programa principal
print("=== Calculadora de Impuestos ===")
# Obtener el pago sin impuesto del usuario
pago_sin_impuesto = obtener_valor_numerico("Ingresa el monto sin impuestos: $")
# Obtener el porcentaje de impuesto del usuario
impuesto_porcentaje = obtener_valor_numerico("Ingresa el porcentaje de impuesto: ")
# Calcular el pago total
pago_total = calcular_pago_con_impuesto(pago_sin_impuesto, impuesto_porcentaje)
# Mostrar resultados
print("\n--- Detalle del Pago ---")
print(f"Monto sin impuestos: ${pago_sin_impuesto:.2f}")
print(f"Impuesto ({impuesto_porcentaje}%): ${pago_sin_impuesto * (impuesto_porcentaje / 100):.2f}")
print(f"TOTAL A PAGAR: ${pago_total:.2f}")