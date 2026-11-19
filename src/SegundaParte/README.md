# Segunda Parte: Búsqueda Lineal, Arreglos Paralelos y `java.util.Arrays`

[⬅️ Volver al README Principal](../../README.md)

Este paquete (`SegundaParte`) contiene los ejercicios 4, 5 y 6 de la guía práctica **SW-AyLP-APE-06**, orientados a la implementación de búsqueda secuencial con control de primera ocurrencia, relación índice-valor mediante arreglos paralelos y uso de métodos estáticos de la clase utilitaria `java.util.Arrays`.

---

## 📌 Ejercicio 4: Búsqueda y conteo (`Ejercicio4.java`)

### Objetivo Lógico
Dado el arreglo predefinido `int[] numeros = {14, 7, 25, 3, 18, 7, 30};`, solicitar un número entero por teclado y determinar:
1. Cuántas veces aparece dicho valor dentro del arreglo (frecuencia de aparición).
2. La **primera posición (índice)** donde fue localizado, utilizando el valor centinela `posicion = -1` para reportar `"No existe"` en caso de que el elemento no se encuentre.

### Algoritmo de Búsqueda Lineal
- **Arreglo base:** `int[] numeros = {14, 7, 25, 3, 18, 7, 30};`
- **Variables de control:** `contador = 0` y variable centinela `posicion = -1`.
- **Recorrido secuencial:**
  - En cada iteración `i`, si `numeros[i] == buscado`, se incrementa `contador++`.
  - Para garantizar que solo se registre el **primer índice** de aparición (por ejemplo, cuando se busca el `7`, que está en los índices `1` y `5`), se evalúa la condición anidada `if (posicion == -1) { posicion = i; }`.
  - Al finalizar el ciclo, si `posicion == -1`, se informa que el elemento `"No existe"`.

### Ejemplo de Entrada y Salida Esperada
```text
=== BÚSQUEDA LINEAL Y CONTEO DE ELEMENTOS ===
Arreglo actual: [14, 7, 25, 3, 18, 7, 30]
Ingrese el número que desea buscar: 7

--- RESULTADO DE LA BÚSQUEDA ---
Número buscado        : 7
Cantidad de apariciones: 2
Primera posición (índice): 1
```
*(Si se ingresa un número inexistente como `99`, muestra `Cantidad de apariciones: 0` y `Primera posición (índice): No existe (posicion = -1)`).*

---

## 📌 Ejercicio 5: Máximo y mínimo con arreglos paralelos (`Ejercicio5.java`)

### Objetivo Lógico
Dados dos arreglos paralelos de igual longitud que relacionan el nombre de cada estudiante con su calificación:
- `String[] nombres = {"Ana", "Luis", "Marta", "Pedro"};`
- `int[] notas = {15, 8, 18, 11};`

Identificar y mostrar el nombre y calificación del estudiante con la **nota más alta**, el nombre y calificación del estudiante con la **nota más baja** (empleando punteros de índice `posMax` y `posMin`), y el promedio general del grupo con 2 decimales.

### Sincronización de Arreglos Paralelos
- **Principio de paralelismo:** Ambos arreglos comparten la misma dimensión (`nombres.length == notas.length == 4`). El elemento `nombres[i]` corresponde biunívocamente a la calificación `notas[i]`.
- **Punteros de índice (`posMax` y `posMin`):**
  1. Se inicializan ambos índices en el primer elemento: `int posMax = 0;` e `int posMin = 0;`.
  2. Durante el recorrido `for (int i = 0; i < notas.length; i++)`:
     - Si `notas[i] > notas[posMax]`, se actualiza `posMax = i`.
     - Si `notas[i] < notas[posMin]`, se actualiza `posMin = i`.
  3. De esta forma, al terminar el ciclo se accede directamente tanto al nombre como a la nota mediante `nombres[posMax]` / `notas[posMax]` y `nombres[posMin]` / `notas[posMin]`.

### Ejemplo de Salida Esperada
```text
=== MÁXIMO Y MÍNIMO CON ARREGLOS PARALELOS ===
Listado de estudiantes y calificaciones:
 - Ana: 15
 - Luis: 8
 - Marta: 18
 - Pedro: 11

--- RESULTADOS DEL ANÁLISIS ---
Nota más alta : Marta con 18 puntos (posMax = 2)
Nota más baja : Luis con 8 puntos (posMin = 1)
Promedio general del grupo: 13.00 puntos
```

---

## 📌 Ejercicio 6: Integrador con `java.util.Arrays` (`Ejercicio6.java`)

### Objetivo Lógico
Dado el arreglo `int[] datos = {14, 7, 25, 3, 18};`, aplicar de forma integrada las utilidades de la biblioteca estándar `java.util.Arrays` para clonar el arreglo sin alterar la referencia original, ordenar la copia, visualizar ambos estados, extraer el segundo valor más alto y ejecutar una búsqueda binaria para localizar el número `14`.

### Métodos de `java.util.Arrays` Empleados
1. **`Arrays.copyOf(datos, datos.length)`:** Crea una **copia real e independiente** en memoria (`copiaDatos`). Evita que las modificaciones posteriores afecten al arreglo original `datos` (a diferencia de una asignación de referencia `copia = datos`).
2. **`Arrays.sort(copiaDatos)`:** Ordena los elementos de `copiaDatos` en orden ascendente mediante el algoritmo *Dual-Pivot Quicksort* (`[3, 7, 14, 18, 25]`).
3. **`Arrays.toString(...)`:** Convierte tanto el arreglo original como la copia ordenada en representaciones legibles de cadena (`[14, 7, 25, 3, 18]` y `[3, 7, 14, 18, 25]`).
4. **Cálculo del segundo mayor:** Al estar `copiaDatos` ordenado ascendentemente, el segundo número mayor se ubica en el penúltimo índice: `copiaDatos[copiaDatos.length - 2]` (valor `18`).
5. **`Arrays.binarySearch(copiaDatos, 14)`:** Ejecuta el algoritmo de **búsqueda binaria** ($O(\log n)$) sobre el arreglo previamente ordenado, retornando el índice `2` para el valor `14`.

### Ejemplo de Salida Esperada
```text
=== EJERCICIO INTEGRADOR CON java.util.Arrays ===
Arreglo original (sin modificar) : [14, 7, 25, 3, 18]
Copia ordenada (Arrays.sort)     : [3, 7, 14, 18, 25]
Segundo número mayor del arreglo : 18
Posición del número 14 en la copia ordenada (binarySearch): índice 2
```
