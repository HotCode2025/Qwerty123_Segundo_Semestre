
from Pedido import Pedido
from ItemInventario import ItemInventario

# creacion de items
item_a = ItemInventario("Gorra Deportiva", 25.00)
item_b = ItemInventario("Sudadera Ligera", 80.00)
item_c = ItemInventario("Calcetines Térmicos", 15.00)
item_d = ItemInventario("Chaqueta Impermeable", 180.00)
item_e = ItemInventario("Mochila Urbana", 60.00)
item_f = ItemInventario("Botella de Agua", 12.50)

#  Preparación y Prueba del Pedido 1 
print("\n=== Procesando Pedido #1 ===")

# Lista inicial de ítems para el primer pedido
lista_inicial_pedido1 = [item_a, item_b] 
pedido1 = Pedido(lista_inicial_pedido1) 

# Añadimos ítems uno por uno usando 'incluir_elemento'
pedido1.incluir_elemento(item_e) # Añadimos Mochila
pedido1.incluir_elemento(item_c) # Añadimos Calcetines

# Mostramos el pedido completo y su costo
print(pedido1) # Esto llama automáticamente a __str__ y calcula el total
print(f'-> Total del Pedido #1 (solo costo): ${pedido1.calcular_costo_total():.2f}')


#  Preparación y Prueba del Pedido 2 
print("\n=== Procesando Pedido #2 ===")

# Lista inicial para el segundo pedido
lista_inicial_pedido2 = [item_c, item_d]
pedido2 = Pedido(lista_inicial_pedido2)

# Añadimos ítems uno por uno (usando de nuevo 'incluir_elemento')
pedido2.incluir_elemento(item_f) # Añadimos Botella de Agua
pedido2.incluir_elemento(item_b) # Añadimos Sudadera Ligera

# Mostramos el segundo pedido completo y su costo
print(pedido2)
print(f'-> Total del Pedido #2 (solo costo): ${pedido2.calcular_costo_total():.2f}')