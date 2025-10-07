from Color import Color
from FiguraGeometrica import FiguraGeometrica


class Rectangulo(FiguraGeometrica,Color):
    def __init__(self,alto,ancho,color):
        FiguraGeometrica.__init__(self,alto,ancho)
        Color.__init__(self,color)
    def __str__(self):
        return f"{super().__str__()} y su area es: {self.calcularArea()}"
        
        
    def calcularArea(self):
        return self.alto * self.ancho