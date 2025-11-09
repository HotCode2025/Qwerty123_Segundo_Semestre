

class ItemInventario:
    # Un contador general para saber cuántos ítems hemos creado.
    items_creados = 0

    def __init__(self, descripcion, valor):
        ItemInventario.items_creados += 1  # Sumamos uno cada vez que hacemos un ítem nuevo
        self._codigo_interno = ItemInventario.items_creados  # Le damos un ID único
        self._descripcion_item = descripcion
        self._valor_unitario = valor

    # --- Los métodos para leer y cambiar la info (getters/setters) ---

    @property
    def descripcion(self):
        # Para obtener la descripción del ítem
        return self._descripcion_item

    @descripcion.setter
    def descripcion(self, nueva_descripcion):
        # Para cambiar la descripción
        self._descripcion_item = nueva_descripcion

    @property
    def valor(self):
        # Para obtener el precio del ítem
        return self._valor_unitario

    @valor.setter
    def valor(self, nuevo_valor):
        # Para cambiar el precio
        self._valor_unitario = nuevo_valor

    # El método especial para que se vea bien cuando lo imprimimos
    def __str__(self):
        return f'Código: {self._codigo_interno} | Descripción: {self._descripcion_item} | Valor: ${self._valor_unitario}'

# Bloque de prueba: si corres este archivo, se ejecuta esto:
if __name__ == "__main__":
    # Creamos un par de ítems de ejemplo
    item1 = ItemInventario("Teclado Mecánico", 85.50)
    item2 = ItemInventario("Mouse Inalámbrico", 30.00)

    print(item1)
    print(item2)

    # Mostrando cuántos objetos se han creado hasta ahora:
    print(f"\nTotal de ítems registrados: {ItemInventario.items_creados}")