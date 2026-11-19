# Primera Parte: Recorrido, Filtrado Condicional y Estadística en Arreglos

[⬅️ Volver al README Principal](../../README.md)

Este paquete (`PrimeraParte`) contiene los tres primeros ejercicios de la guía práctica **SW-AyLP-APE-06**, enfocados en la declaración, lectura validada por teclado, recorrido directo e inverso, filtrado por índice y por valor, y cálculo de promedios evitando errores de truncamiento en arreglos unidimensionales.

---

## 📌 Ejercicio 1: Control de gastos semanales y ajuste por inflación (`Ejercicio1.java`)

### Objetivo Lógico
Registrar los gastos diarios durante una semana (7 días), determinar el gasto total acumulado y el promedio diario, aplicar un ajuste inflacionario del **10 %** exclusivamente sobre aquellos días cuyo gasto supere estrictamente el promedio semanal, e imprimir el arreglo actualizado en **orden inverso** (desde el Día 7 hasta el Día 1) junto con el conteo de días afectados.

### Estructura de Arreglos y Algoritmo
- **Arreglo empleado:** `double[] gastos = new double[7];` (capacidad fija de 7 elementos de punto flotante de doble precisión).
- **Lógica aplicada:**
  1. **Lectura y validación:** Ciclo `for` de `0` a `gastos.length - 1` con validación `do-while` para impedir valores negativos (`valor < 0`).
  2. **Acumulación y promedio:** Suma en `sumaTotal` y cálculo de `promedioDiario = sumaTotal / gastos.length`.
  3. **Actualización condicional in-place:** Recorrido del arreglo verificando `if (gastos[i] > promedioDiario)` para actualizar `gastos[i] = gastos[i] * 1.10` e incrementar el contador `diasIncrementados`.
  4. **Recorrido inverso:** Ciclo decremental `for (int i = gastos.length - 1; i >= 0; i--)` para mostrar desde el Día 7 hasta el Día 1.

### Ejemplo de Entrada y Salida Esperada
```text
=== CONTROL DE GASTOS SEMANALES Y AJUSTE POR INFLACIÓN ===
Ingrese el gasto del Día 1 ($): 12.50
Ingrese el gasto del Día 2 ($): 20.00
Ingrese el gasto del Día 3 ($): 15.00
Ingrese el gasto del Día 4 ($): 30.00
Ingrese el gasto del Día 5 ($): 10.00
Ingrese el gasto del Día 6 ($): 25.00
Ingrese el gasto del Día 7 ($): 13.50

--- RESUMEN INICIAL ---
Gasto total de la semana : $126.00
Promedio diario de gasto : $18.00

--- GASTOS ACTUALIZADOS (ORDEN INVERSO: DÍA 7 AL DÍA 1) ---
Día 7: $13.50
Día 6: $27.50
Día 5: $10.00
Día 4: $33.00
Día 3: $15.00
Día 2: $22.00
Día 1: $12.50

Cantidad de días que recibieron el incremento del 10 %: 3
```

---

## 📌 Ejercicio 2: Filtro y suma condicionada de producción (`Ejercicio2.java`)

### Objetivo Lógico
Registrar la cantidad de piezas producidas en 10 turnos de trabajo y evaluar tres métricas diferenciadas:
1. La suma de piezas ubicadas en **posiciones pares de índice** (`0, 2, 4, 6, 8`).
2. El conteo de turnos cuya producción sea **impar y estrictamente mayor a 15 unidades**.
3. El promedio general de producción expresado con **2 decimales**.

### Estructura de Arreglos y Algoritmo
- **Arreglo empleado:** `int[] produccion = new int[10];` (10 elementos enteros correspondientes a cada turno).
- **Lógica aplicada:**
  1. **Diferenciación entre índice y valor:**
     - Para sumar posiciones pares de índice se evalúa el módulo sobre la variable de control `i`: `if (i % 2 == 0)`.
     - Para filtrar por valor de producción impar y mayor a 15 se evalúa el contenido del arreglo: `if (produccion[i] % 2 != 0 && produccion[i] > 15)`.
  2. **Prevención de división entera:** Se realiza *casting* explícito `(double) sumaTotal / produccion.length` antes de formatear con `System.out.printf("%.2f")`.

### Ejemplo de Entrada y Salida Esperada
```text
=== FILTRO Y SUMA CONDICIONADA DE PRODUCCIÓN (10 TURNOS) ===
Ingrese las piezas producidas en el Turno 1 (índice 0): 12
Ingrese las piezas producidas en el Turno 2 (índice 1): 17
Ingrese las piezas producidas en el Turno 3 (índice 2): 20
Ingrese las piezas producidas en el Turno 4 (índice 3): 15
Ingrese las piezas producidas en el Turno 5 (índice 4): 19
Ingrese las piezas producidas en el Turno 6 (índice 5): 22
Ingrese las piezas producidas en el Turno 7 (índice 6): 14
Ingrese las piezas producidas en el Turno 8 (índice 7): 21
Ingrese las piezas producidas en el Turno 9 (índice 8): 10
Ingrese las piezas producidas en el Turno 10 (índice 9): 25

--- RESULTADOS DEL ANÁLISIS DE PRODUCCIÓN ---
Suma de piezas en índices pares (0, 2, 4, 6, 8) : 75
Turnos con producción impar y mayor a 15 piezas : 4
Promedio general de producción                  : 17.50 piezas
```

---

## 📌 Ejercicio 3: Análisis de asistencia y rendimiento (`Ejercicio3.java`)

### Objetivo Lógico
Dimensionar dinámicamente un arreglo de calificaciones según la cantidad `n` de estudiantes ingresada por el usuario, validar que cada nota pertenezca al rango académico permitido `[0, 20]`, calcular el promedio general sin pérdida de precisión decimal, contabilizar aprobados (`>= 14`) y reprobados (`< 14`), e identificar nominalmente (`Estudiante 1`, `Estudiante 2`, ...) a quienes obtuvieron una calificación estrictamente inferior al promedio del curso.

### Estructura de Arreglos y Algoritmo
- **Arreglo empleado:** `int[] notas = new int[n];` (dimensionado en tiempo de ejecución tras validar `n > 0`).
- **Lógica aplicada:**
  1. **Control de rango de entrada:** Bucle `do-while` por cada índice `i` con la condición `calificacion < 0 || calificacion > 20`.
  2. **Clasificación binaria:** Condicional `if (notas[i] >= 14)` para incrementar `aprobados`, o `reprobados` en el bloque `else`.
  3. **Cálculo de promedio exacto:** Conversión explícita `double promedioGeneral = (double) sumaNotas / notas.length;`.
  4. **Segunda pasada de filtrado:** Recorrido de `notas` comparando `if (notas[i] < promedioGeneral)` e imprimiendo el identificador `Estudiante (i + 1)` junto con su nota.

### Ejemplo de Entrada y Salida Esperada
```text
=== ANÁLISIS DE ASISTENCIA Y RENDIMIENTO ACADÉMICO ===
Ingrese la cantidad de estudiantes (n > 0): 4
Ingrese la nota del Estudiante 1 (0 a 20): 16
Ingrese la nota del Estudiante 2 (0 a 20): 12
Ingrese la nota del Estudiante 3 (0 a 20): 18
Ingrese la nota del Estudiante 4 (0 a 20): 14

--- RESUMEN DE RENDIMIENTO DEL CURSO ---
Promedio general del curso     : 15.00
Cantidad de aprobados (>= 14)  : 3
Cantidad de reprobados (< 14)  : 1

--- ESTUDIANTES CON NOTA MENOR AL PROMEDIO GENERAL ---
Estudiante 2 (Nota: 12)
Estudiante 4 (Nota: 14)
```
