# Recorrido Inorden de Árbol Binario

## Descripción

Dado el nodo raíz de un árbol binario, devuelve el recorrido inorden de los valores de sus nodos.

## Ejemplos

### Ejemplo 1:

```
Input: root = [1,null,2,3]
Output: [1,3,2]
```

**Explicación**:

![alt text](screenshot-2024-08-29-202743.png)

### Ejemplo 2:

```
Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
Output: [4,2,6,5,7,1,3,9,8]
```

**Explicación**:

![alt text](tree_2.png)

### Ejemplo 3:

```
Input: root = []
Output: []
```

### Ejemplo 4:

```
Input: root = [1]
Output: [1]
```

## Restricciones:

- La cantidad de nodos en el árbol está en el rango [0, 100]
- -100 <= Node.val <= 100

## Seguimiento

La solución recursiva es trivial, ¿podrías hacerlo de forma iterativa?