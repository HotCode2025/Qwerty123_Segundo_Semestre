# Importamos la clase base que creamos antes
from ItemInventario import ItemInventario 

class Pedido:
    # Esta es una variable de clase para llevar la cuenta de cuántos pedidos se han hecho.
    conteo_pedidos = 0

    def __init__(self, elementos):
        Pedido.conteo_pedidos += 1
        self.id_pedido = Pedido.conteo_pedidos # ID único para este pedido
        # Guardamos la lista de ítems. Es mejor asegurarnos de que sea una lista.
        self._elementos_comprados = list(elementos)

    # Función para añadir un ítem más a la compra
    def incluir_elemento(self, elemento_nuevo):
        self._elementos_comprados.append(elemento_nuevo) # Lo agregamos al listado de compras

    #  Métodos para manejar el total y la impresión 

    def calcular_costo_total(self):
        """Calcula la suma de los costos de todos los ítems en el pedido."""
        costo_acumulado = 0 
        # Iteramos sobre cada 'ItemInventario' que tenemos
        for elemento in self._elementos_comprados:
            costo_acumulado += elemento.valor 
        return costo_acumulado

    def __str__(self):
        """Prepara un texto bonito para imprimir la información del pedido."""
        
        detalles_elementos = ""
        for elemento in self._elementos_comprados:
            # Usamos el método __str__ de cada elemento y le ponemos un separador
            detalles_elementos += elemento.__str__() + "\n"
            
        # Devolvemos la info del pedido y luego el listado de ítems
        return f"*** PEDIDO # {self.id_pedido} ***\n" \
               f"Total a pagar: ${self.calcular_costo_total():.2f}\n" \
               f"--- Ítems del Pedido ---\n{detalles_elementos}"
