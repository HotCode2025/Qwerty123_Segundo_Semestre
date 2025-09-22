# Crear una clase llamada Rectangulo, debe tener 2 atributos: altura 
# base el nombre del método sera calcular_area utulizando la formula:
# area = base * altura. Pero las la base  y la altura deben ser ingresadas
# por el usuario y los objetos deben ser tres.
class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calcular_area(self):
        return self.base * self.altura


# Crear 3 rectángulos y mostrar área en el momento
for i in range(1, 4):
    print(f"\nRectángulo {i}:")
    base = float(input("Ingresa la base: "))
    altura = float(input("Ingresa la altura: "))
    rect = Rectangulo(base, altura)
    print(f"El área del rectángulo {i} es: {rect.calcular_area()}")
