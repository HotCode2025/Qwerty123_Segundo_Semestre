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




#Creacion de los 3 objetos de tarea
persona2 = Persona2("Pedro","Gimenez",33)
persona3 = Persona2("Abel","Jaz",31)
persona4 = Persona2("Fifo","Pelotin",63)

#USO DE GETTER
print("OBJETO 1")
print(f"Getter para persona2 ={persona2.nombre}")
print(f"Getter para persona2 ={persona2.apellido}")
print(f"Getter para persona2 ={persona2.edad}")
print("OBJETO 2")
print(f"Getter para persona3 ={persona3.nombre}")
print(f"Getter para persona3 ={persona3.apellido}")
print(f"Getter para persona3 ={persona3.edad}")
print("OBJETO 3")
print(f"Getter para persona4 ={persona4.nombre}")
print(f"Getter para persona4 ={persona4.apellido}")
print(f"Getter para persona4 ={persona4.edad}")


#USO DE SETTER
#OBJETO 1
persona2.nombre = "Jazinto"
persona2.apellido = "Lugones"
persona2.edad = 26
#OBJETO2
persona3.nombre = "Leopoldo"
persona3.apellido = "Rian"
persona3.edad = 23
#OBJETO3
persona4.nombre = "Felicita"
persona4.apellido = "Tutesa"
persona4.edad = 21
print("Setter OBJETO 1")
print(f"Metodo Setter persona2 : {persona2.nombre}")
print(f"Uso de Setter persona2 : {persona2.apellido}")
print(f"Uso de Setter persona2 : {persona2.edad}")
print("Setter OBJETO2")
print(f"Metodo Setter persona3 : {persona3.nombre}")
print(f"Uso de Setter persona3 : {persona3.apellido}")
print(f"Uso de Setter persona3 : {persona3.edad}")
print("Setter OBJETO3")
print(f"Metodo Setter persona4 : {persona4.nombre}")
print(f"Uso de Setter persona4 : {persona4.apellido}")
print(f"Uso de Setter persona4 : {persona4.edad}")



print("USO DEL METODO OBTENER DETALLES")
print(persona2.mostrar_detalles())
print(persona3.mostrar_detalles())
print(persona4.mostrar_detalles())