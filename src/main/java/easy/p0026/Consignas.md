# Eliminar Duplicados de un Array Ordenado

## Descripción del Problema

Dado un array de enteros `nums` ordenado de forma no decreciente, elimina los duplicados in-place de manera que cada elemento único aparezca solo una vez. El orden relativo de los elementos debe mantenerse igual. Retorna el número de elementos únicos en `nums`.

## Requerimientos

Sea `k` el número de elementos únicos. Tu solución debe:

1. Modificar el array `nums` para que los primeros `k` elementos contengan los elementos únicos en su orden original
2. Retornar `k`
3. Los elementos restantes después de la posición `k` no son importantes

## Implementación del Juez

```java
int[] nums = [...]; // Array de entrada
int[] expectedNums = [...]; // La respuesta esperada con la longitud correcta

int k = removeDuplicates(nums); // Llama a tu implementación

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
```

## Ejemplos

### Ejemplo 1:

```
Entrada: nums = [1,1,2]
Salida: 2, nums = [1,2,_]
Explicación:
- Retorna k = 2
- Los primeros dos elementos de nums deben ser 1 y 2
- Los elementos después de k no importan (marcados como _)
```

### Ejemplo 2:

```
Entrada: nums = [0,0,1,1,1,2,2,3,3,4]
Salida: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explicación:
- Retorna k = 5
- Los primeros cinco elementos deben ser 0, 1, 2, 3 y 4
- Los elementos después de k no importan (marcados como _)
```

## Restricciones

- `1 <= nums.length <= 3 * 10⁴`
- `-100 <= nums[i] <= 100`
- `nums` está ordenado de forma no decreciente
