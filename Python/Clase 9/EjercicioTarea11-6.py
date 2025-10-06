# Uso de herencia ejercicio 11.6 clase 9 tarea

class Vehiculo:
    """Clase padre para un vehículo en general."""
    def __init__(self, color, ruedas):
        """Inicializo los atributos básicos de color y ruedas."""
        self.color = color
        self.ruedas = ruedas
        print(f"Se ha creado un Vehiculo de color {self.color} con {self.ruedas} ruedas.")

    def __str__(self):
        """Devuelvmos una representación en cadena del objeto."""
        return f"Vehiculo: Color={self.color}, Ruedas={self.ruedas}"



class Auto(Vehiculo):
    """Clase hija que hereda de Vehiculo y añade el atributo velocidad."""
    def __init__(self, color, ruedas, velocidad):
        """Inicializa atributos de Vehiculo y añade velocidad."""
        # Llamamo al constructor de la clase padre
        super().__init__(color, ruedas)
        self.velocidad = velocidad
        print(f"Es un Auto con velocidad máxima de {self.velocidad} km/hr.")

    def __str__(self):
        """Devuelve una representación en cadena del Auto."""
        
        # Uso den uevo la representación del padre y añadola velocidad
        return f"{super().__str__()} | Auto: Velocidad={self.velocidad} km/hr"



class Bicicleta(Vehiculo):
    """Clase hija que hereda de Vehiculo y añade el atributo tipo."""
    def __init__(self, color, ruedas, tipo):
        """Inicializa atributos de Vehiculo y añade tipo (urbana/montaña/etc.)."""
        # Se llama al constructor de la clase padre
        super().__init__(color, ruedas)
        self.tipo = tipo
        print(f"Es una Bicicleta de tipo {self.tipo}.")

    def __str__(self):
        """Devuelve una representación en cadena de la Bicicleta."""
        # Se reutiliza la representación del padre y añadimos el tipo
        return f"{super().__str__()} | Bicicleta: Tipo={self.tipo}"


## Creación de Objetos
print("\n-Xxx Creando Objetos xxX-")

# Creo un objeto de la clase padre: Vehiculo
mi_vehiculo = Vehiculo("Gris", 4)
print(mi_vehiculo)

# Creoo un objeto de la clase hija: Auto
mi_auto = Auto("Rojo", 4, 180)
print(mi_auto)

# Creo un objeto de la clase hija: Bicicleta
mi_bici = Bicicleta("Azul", 2, "Montaña")
print(mi_bici)