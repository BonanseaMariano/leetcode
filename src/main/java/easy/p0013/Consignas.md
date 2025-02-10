# Números Romanos a Enteros

## Descripción

Los números romanos se representan mediante siete símbolos diferentes:

| Símbolo | Valor |
| ------- | ----- |
| `I`     | 1     |
| `V`     | 5     |
| `X`     | 10    |
| `L`     | 50    |
| `C`     | 100   |
| `D`     | 500   |
| `M`     | 1000  |

Por ejemplo:

- `2` se escribe como `II` en números romanos (dos unos sumados)
- `12` se escribe como `XII` (`X + II`)
- `27` se escribe como `XXVII` (`XX + V + II`)

## Reglas Especiales

Los números romanos generalmente se escriben de mayor a menor de izquierda a derecha. Sin embargo, hay seis casos especiales donde se usa la sustracción:

- `I` antes de `V` (5) y `X` (10) representa 4 y 9
- `X` antes de `L` (50) y `C` (100) representa 40 y 90
- `C` antes de `D` (500) y `M` (1000) representa 400 y 900

## Problema

Dado un número romano, conviértelo a un número entero.

### Ejemplos

#### Ejemplo 1:

- **Input**: `s = "III"`
- **Output**: `3`
- **Explicación**: `III = 3`

#### Ejemplo 2:

- **Input**: `s = "LVIII"`
- **Output**: `58`
- **Explicación**: `L = 50`, `V = 5`, `III = 3`

#### Ejemplo 3:

- **Input**: `s = "MCMXCIV"`
- **Output**: `1994`
- **Explicación**: `M = 1000`, `CM = 900`, `XC = 90`, `IV = 4`

## Restricciones

- `1 <= s.length <= 15`
- `s` solo contiene los caracteres (`'I'`, `'V'`, `'X'`, `'L'`, `'C'`, `'D'`, `'M'`)
- Se garantiza que `s` es un número romano válido en el rango `[1, 3999]`
