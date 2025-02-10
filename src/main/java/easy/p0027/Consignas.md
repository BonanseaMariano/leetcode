# Remove Element

## Problema
Dado un array de enteros `nums` y un entero `val`, eliminar todas las ocurrencias de `val` en `nums` in-place. El orden de los elementos puede ser cambiado. Retornar el número de elementos en `nums` que no son iguales a `val`.

## Requisitos
Siendo `k` el número de elementos en `nums` que no son iguales a `val`, debes:
1. Modificar el array `nums` para que los primeros `k` elementos contengan los elementos diferentes a `val`
2. Retornar `k`

## Evaluación del Juez
El juez probará tu solución con el siguiente código:

```java
int[] nums = [...]; // Array de entrada
int val = ...; // Valor a remover
int[] expectedNums = [...]; // Respuesta esperada con longitud correcta
                           // Está ordenada sin valores iguales a val

int k = removeElement(nums, val); // Llama a tu implementación

assert k == expectedNums.length;
sort(nums, 0, k); // Ordena los primeros k elementos de nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
```

## Ejemplos

### Ejemplo 1:
- **Input:** `nums = [3,2,2,3]`, `val = 3`
- **Output:** `2`, `nums = [2,2,_,_]`
- **Explicación:** Tu función debe retornar `k = 2`, con los primeros dos elementos de `nums` siendo `2`.
  No importa lo que dejes más allá del `k` retornado.

### Ejemplo 2:
- **Input:** `nums = [0,1,2,2,3,0,4,2]`, `val = 2`
- **Output:** `5`, `nums = [0,1,4,0,3,_,_,_]`
- **Explicación:** Tu función debe retornar `k = 5`, con los primeros cinco elementos conteniendo `0`, `0`, `1`, `3`, y `4`.
  Los elementos pueden ser retornados en cualquier orden.

## Restricciones
- `0 <= nums.length <= 100`
- `0 <= nums[i] <= 50`
- `0 <= val <= 100`