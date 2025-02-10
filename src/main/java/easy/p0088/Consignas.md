# Fusionar Arrays Ordenados

## Descripción

Se te dan dos arrays de enteros `nums1` y `nums2`, ordenados de forma no decreciente, y dos enteros `m` y `n`, que representan la cantidad de elementos en `nums1` y `nums2` respectivamente.

Fusiona `nums1` y `nums2` en un único array ordenado de forma no decreciente.

El array final ordenado no debe ser retornado por la función, sino que debe almacenarse dentro del array `nums1`. Para acomodar esto, `nums1` tiene una longitud de `m + n`, donde los primeros `m` elementos denotan los elementos que deben fusionarse, y los últimos `n` elementos están establecidos en `0` y deben ignorarse. `nums2` tiene una longitud de `n`.

## Ejemplos

### Ejemplo 1:

```
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
```

**Explicación**: Los arrays que estamos fusionando son `[1,2,3]` y `[2,5,6]`.
El resultado de la fusión es `[1,2,2,3,5,6]` con los elementos subrayados provenientes de `nums1`.

### Ejemplo 2:

```
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
```

**Explicación**: Los arrays que estamos fusionando son `[1]` y `[]`.
El resultado de la fusión es `[1]`.

### Ejemplo 3:

```
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
```

**Explicación**: Los arrays que estamos fusionando son `[]` y `[1]`.
El resultado de la fusión es `[1]`.
Ten en cuenta que como `m = 0`, no hay elementos en `nums1`. El `0` solo está ahí para asegurar que el resultado de la fusión quepa en `nums1`.

## Restricciones:

- `nums1.length == m + n`
- `nums2.length == n`
- `0 <= m, n <= 200`
- `1 <= m + n <= 200`
- `-109 <= nums1[i], nums2[j] <= 109`

## Seguimiento

¿Puedes proponer un algoritmo que se ejecute en tiempo `O(m + n)`?