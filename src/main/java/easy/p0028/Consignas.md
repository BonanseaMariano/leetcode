# Encontrar el Índice de la Primera Ocurrencia en una Cadena

## Descripción

Dadas dos cadenas `needle` y `haystack`, devuelve el índice de la primera ocurrencia de `needle` en `haystack`, o -1 si `needle` no es parte de `haystack`.

## Ejemplos

### Ejemplo 1:

- **Input**: haystack = "sadbutsad", needle = "sad"
- **Output**: 0
- **Explicación**: "sad" aparece en los índices 0 y 6.
  La primera ocurrencia está en el índice 0, por lo que devolvemos 0.

### Ejemplo 2:

- **Input**: haystack = "leetcode", needle = "leeto"
- **Output**: -1
- **Explicación**: "leeto" no aparece en "leetcode", por lo que devolvemos -1.

## Restricciones

- 1 <= haystack.length, needle.length <= 10^4
- haystack y needle consisten solo de caracteres en minúscula del alfabeto inglés.
