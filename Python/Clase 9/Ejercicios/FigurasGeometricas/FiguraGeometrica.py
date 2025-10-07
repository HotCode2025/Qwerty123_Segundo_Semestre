class FiguraGeometrica:
    def __init__(self,alto,ancho):
        self.alto = alto
        self.ancho = ancho
    def __str__(self):
        return f"La figura tiene {self.alto} de alto y {self.ancho} de ancho "
    
#METODOS GETTER AND SETTER
@property
def alto(self):
    return self.alto

@alto.setter
def nombre(self,alto):
    self.alto = alto
        
@property
def ancho(self):
    return self.ancho

@nombre.setter
def nombre(self,ancho):
    self.ancho = ancho