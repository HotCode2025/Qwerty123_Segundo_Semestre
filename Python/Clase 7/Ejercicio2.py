class Cubo:
    """
    Crear la clase Cubo con los atributos, ancho, alto y profundidad, con
    un método calcular_volumen que tendrá la fórmula:
    volumen = ancho * altura * profundidad
    que el usuario ingrese los valores.
    """

    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad


# Calculamos el volumen de un cubo
if __name__ == "__main__":
    try:
        ancho = float(input("Ingrese el ancho del cubo: "))
        alto = float(input("Ingrese el alto del cubo: "))
        profundidad = float(input("Ingrese la profundidad del cubo: "))

        cubo = Cubo(ancho, alto, profundidad)
        volumen = cubo.calcular_volumen()
        print(f"El volumen del cubo es: {volumen}")
    except ValueError:
        print("Por favor, ingrese valores numéricos válidos.")
