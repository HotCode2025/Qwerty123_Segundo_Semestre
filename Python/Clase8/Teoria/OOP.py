class Persona2:
    def __init__(self,nombre,apellido,edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        
    def mostrar_detalles(self):
        print(f"Los datos a mostrar son los siguientes: {self.nombre} {self.apellido} y de edad {self.edad}")
        
        
        
@property #decorador
def nombre(self): #Metodo Getter
    return self.nombre

@nombre.setter
def nombre(self,nombre):
    print("Estamos utilizando el metodo setter")
    self.nombre = nombre
    
def __del__(self):
    print(f" Persona 2 : {self.nombre} {self.apellido} {self.edad}")
    

#Cambio de estructuras
if __name__ == "__main__":
#OBJETO    
    persona1 = Persona2("Ariel","Betancud",41)
    #METODO GETTER
    print(f"Metodo Getter: {persona1.nombre}")
    print(f"Uso de Getter: {persona1.apellido}")
    print(f"Uso de Getter : {persona1.edad}")



    #METODO SETTER
    persona1.nombre = "Jose"
    persona1.apellido = "Bodoque"
    persona1.edad = 23

    print(f"Metodo Setter: {persona1.nombre}")
    print(f"Uso de Setter: {persona1.apellido}")
    print(f"Uso de Setter : {persona1.edad}")


    print(persona1.mostrar_detalles())#Uso del metodo creado anterior
    
    print(__name__)