# Más Uno

## Descripción

Se te proporciona un número entero grande representado como un array de dígitos, donde cada `digits[i]` es el i-ésimo dígito del número entero. Los dígitos están ordenados desde el más significativo al menos significativo de izquierda a derecha. El número entero grande no contiene ceros a la izquierda.

Incrementa el número entero grande en uno y devuelve el array de dígitos resultante.

## Ejemplos

### Ejemplo 1:

- **Input**: `digits = [1,2,3]`
- **Output**: `[1,2,4]`
- **Explicación**: El array representa el número `123`.
  Incrementando en uno obtenemos `123 + 1 = 124`.
  Por lo tanto, el resultado debe ser `[1,2,4]`.

### Ejemplo 2:

- **Input**: `digits = [4,3,2,1]`
- **Output**: `[4,3,2,2]`
- **Explicación**: El array representa el número `4321`.
  Incrementando en uno obtenemos `4321 + 1 = 4322`.
  Por lo tanto, el resultado debe ser `[4,3,2,2]`.

### Ejemplo 3:

- **Input**: `digits = [9]`
- **Output**: `[1,0]`
- **Explicación**: El array representa el número `9`.
  Incrementando en uno obtenemos `9 + 1 = 10`.
  Por lo tanto, el resultado debe ser `[1,0]`.

## Restricciones

- `1 <= digits.length <= 100`
- `0 <= digits[i] <= 9`
- `digits` no contiene ceros a la izquierda