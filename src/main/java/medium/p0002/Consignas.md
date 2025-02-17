# Suma de Dos Números

## Descripción

Se te dan dos listas enlazadas no vacías que representan dos números enteros no negativos. Los dígitos están almacenados en orden inverso, y cada nodo contiene un solo dígito. Suma los dos números y devuelve la suma como una lista enlazada.

Puedes asumir que los dos números no contienen ceros a la izquierda, excepto el número 0 en sí mismo.

## Ejemplos

### Ejemplo 1:

![alt text](addtwonumber1.jpg)

```
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
```

**Explicación**: 342 + 465 = 807

### Ejemplo 2:

```
Input: l1 = [0], l2 = [0]
Output: [0]
```

### Ejemplo 3:

```
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
```

## Restricciones:

- El número de nodos en cada lista enlazada está en el rango [1, 100]
- 0 <= Node.val <= 9
- Se garantiza que la lista representa un número que no tiene ceros a la izquierda