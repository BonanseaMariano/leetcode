# Palíndromo Válido

## Descripción

Una frase es un palíndromo si, después de convertir todas las letras mayúsculas a minúsculas y eliminar todos los caracteres no alfanuméricos, se lee igual de izquierda a derecha que de derecha a izquierda. Los caracteres alfanuméricos incluyen letras y números.

Dada una cadena s, devuelve true si es un palíndromo, o false en caso contrario.

## Ejemplos

### Ejemplo 1:

- **Input**: s = "A man, a plan, a canal: Panama"
- **Output**: true
- **Explicación**: "amanaplanacanalpanama" es un palíndromo.

### Ejemplo 2:

- **Input**: s = "race a car"
- **Output**: false
- **Explicación**: "raceacar" no es un palíndromo.

### Ejemplo 3:

- **Input**: s = " "
- **Output**: true
- **Explicación**: s es una cadena vacía "" después de eliminar los caracteres no alfanuméricos.
  Como una cadena vacía se lee igual hacia adelante y hacia atrás, es un palíndromo.

## Restricciones

- 1 <= s.length <= 2 * 10⁵
- s consiste solo en caracteres ASCII imprimibles.