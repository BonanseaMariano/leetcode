# Fusionar Dos Listas Ordenadas

## Descripción

Se te dan las cabeceras de dos listas enlazadas ordenadas `list1` y `list2`.

Fusiona las dos listas en una lista ordenada. La lista resultante debe crearse uniendo los nodos de las dos primeras listas.

Devuelve la cabecera de la lista enlazada fusionada.

## Ejemplos

### Ejemplo 1:

![alt text](image.png)

- **Input**: `list1 = [1,2,4]`, `list2 = [1,3,4]`
- **Output**: `[1,1,2,3,4,4]`

### Ejemplo 2:

- **Input**: `list1 = []`, `list2 = []`
- **Output**: `[]`

### Ejemplo 3:

- **Input**: `list1 = []`, `list2 = [0]`
- **Output**: `[0]`

## Restricciones

- El número de nodos en ambas listas está en el rango `[0, 50]`
- `-100 <= Node.val <= 100`
- Tanto `list1` como `list2` están ordenadas en orden no decreciente
