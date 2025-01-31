# Suma de Dos Números

## Descripción

Dado un array de números enteros nums y un número entero target, devuelve los índices de los dos números que sumen target.

Puedes asumir que cada entrada tendrá exactamente una solución, y no puedes usar el mismo elemento dos veces.

Puedes devolver la respuesta en cualquier orden.

## Ejemplos

### Ejemplo 1:

- **Input**: nums = [2,7,11,15], target = 9
- **Output**: [0,1]
- **Explicación**: Como nums[0] + nums[1] == 9, devolvemos [0, 1].

### Ejemplo 2:

- **Input**: nums = [3,2,4], target = 6
- **Output**: [1,2]

### Ejemplo 3:

- **Input**: nums = [3,3], target = 6
- **Output**: [0,1]

## Restricciones

- 2 <= nums.length <= 104
- -109 <= nums[i] <= 109
- -109 <= target <= 109
- Solo existe una solución válida.