# Posición de Inserción

## Descripción

Dado un array ordenado de enteros distintos y un valor `target`, devuelve el índice si se encuentra el objetivo. Si no, devuelve el índice donde debería insertarse para mantener el orden.

Debes escribir un algoritmo con complejidad de tiempo `O(log n)`.

## Ejemplos

### Ejemplo 1:

- **Input**: `nums = [1,3,5,6]`, `target = 5`
- **Output**: `2`

### Ejemplo 2:

- **Input**: `nums = [1,3,5,6]`, `target = 2`
- **Output**: `1`

### Ejemplo 3:

- **Input**: `nums = [1,3,5,6]`, `target = 7`
- **Output**: `4`

## Restricciones

- `1 <= nums.length <= 10^4`
- `-10^4 <= nums[i] <= 10^4`
- `nums` contiene valores distintos ordenados de forma ascendente
- `-10^4 <= target <= 10^4`
