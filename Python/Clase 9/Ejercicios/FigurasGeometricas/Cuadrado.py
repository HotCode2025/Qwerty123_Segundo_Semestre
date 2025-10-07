from Color import Color
from FiguraGeometrica import FiguraGeometrica


class Cuadrado(FiguraGeometrica,Color):
    def __init__(self, lado,color):
        FiguraGeometrica.__init__(self,lado,lado)
        Color.__init__(self,color)
    def __str__(self):
        return f"{super().__str__()} y su area es: {self.calcularArea()}"
        
        
    def calcularArea(self):
        return self.alto * self.ancho