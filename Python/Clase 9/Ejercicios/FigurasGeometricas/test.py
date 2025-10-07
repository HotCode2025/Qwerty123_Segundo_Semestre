
from Rectangulo import Rectangulo
from Cuadrado import Cuadrado

print("CUADRADO")
cuadrado = Cuadrado(5,"azul")
#METODO STR
print(cuadrado)
#METODOS GETTER
print(f"los lados del cuadrado son: {cuadrado.alto}")
print(f"El color es : {cuadrado.color}")
#METODOS SETTER
cuadrado.alto = 6
cuadrado.color = "Violeta"
print(cuadrado)


print("RECTANGULO")
rectangulo = Rectangulo(3,5,"Rojo")
#METODO STR
print(rectangulo)

#METODOS GETTER
print(f"El alto del rectangulo es: {rectangulo.alto}")
print(f"El ancho del rectangulo es : {rectangulo.ancho}")
print(f"El color es : {rectangulo.color}")

#METODO SETTER
rectangulo.alto = 5
rectangulo.ancho = 7
rectangulo.color = "Verde"
print(rectangulo)