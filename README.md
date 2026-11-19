# SW-AyLP-APE-06: Arreglos y Listas

![Java](https://img.shields.io/badge/Java-JDK%2017%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![UTA](https://img.shields.io/badge/Universidad_T%C3%A9cnica_de_Ambato-FISEI-8B0000?style=for-the-badge)
![Asignatura](https://img.shields.io/badge/Asignatura-Algoritmos_y_L%C3%B3gica_de_Programaci%C3%B3n-00599C?style=for-the-badge)
![Nivel](https://img.shields.io/badge/Nivel-Primero_%22B%22_%7C_Grupo_6-2EA44F?style=for-the-badge)

---

## 📋 Información Institucional y Académica

| Campo | Detalle |
| :--- | :--- |
| **Institución** | Universidad Técnica de Ambato (UTA) |
| **Facultad** | Facultad de Ingeniería en Sistemas, Electrónica e Industrial (FISEI) |
| **Carrera** | Software |
| **Unidad de Organización Curricular** | Básica |
| **Asignatura** | Algoritmos y Lógica de Programación |
| **Nivel y Paralelo** | Primero - B (Grupo 6) |
| **Práctica** | `SW-AyLP-APE-06`: Arreglos y Listas |
| **Docente** | Ing. Caiza Caizabuano José Ruben, Mg. |
| **Ciclo Académico** | Julio 2026 – Diciembre 2026 |

---

## 👥 Integrantes del Grupo 6 (Orden Alfabético)

| N.º | Apellidos y Nombres | Rol |
| :-: | :--- | :---: |
| **1** | Castro Sánchez Joseph Andrés | Desarrollador / Documentación |
| **2** | Ortiz Sánchez Holger Steeve | Desarrollador / Documentación |
| **3** | Pacha Lucas Marlon Joel | Desarrollador / Documentación |
| **4** | Peñafiel Solórzano Leyber Smith | Desarrollador / Documentación |
| **5** | Pico Cepeda Matias Alejandro | Desarrollador / Documentación |
| **6** | Yaguana Manzano Marlon Joel | Desarrollador / Documentación |

---

## 🎯 Descripción de la Práctica

La guía práctica **SW-AyLP-APE-06: Arreglos y Listas** tiene como propósito fundamental conocer y aplicar el manejo de **arreglos unidimensionales**, **arreglos paralelos** y las utilidades nativas de la clase **`java.util.Arrays`** en el lenguaje de programación Java, permitiendo el almacenamiento, procesamiento, búsqueda, ordenamiento y manipulación eficiente de colecciones de datos estructurados.

### Objetivos Específicos
1. **Estructuras estáticas:** Implementar arreglos unidimensionales y paralelos en Java para organizar, recorrer y actualizar colecciones de datos homogéneos.
2. **Algoritmos de procesamiento:** Aplicar algoritmos de búsqueda lineal y binaria, ordenamiento ascendente, filtrado condicional y cálculos estadísticos (promedios, máximos y mínimos) utilizando estructuras repetitivas y `java.util.Arrays`.
3. **Robustez y validación:** Gestionar el control de límites de índices (`0` a `length - 1`) y validar las entradas de usuario para prevenir excepciones en tiempo de ejecución (`ArrayIndexOutOfBoundsException`) y errores de división entera.

---

## 📂 Estructura del Proyecto

El código fuente está organizado modularmente en dos paquetes principales dentro del directorio `src/`:

```text
SW-AyLP-APE-06-Arreglos-y-Listas/
├── .gitignore
├── README.md
└── src/
    ├── PrimeraParte/
    │   ├── README.md
    │   ├── Ejercicio1.java   # Control de gastos semanales y ajuste por inflación
    │   ├── Ejercicio2.java   # Filtro y suma condicionada de producción
    │   └── Ejercicio3.java   # Análisis de asistencia y rendimiento académico
    └── SegundaParte/
        ├── README.md
        ├── Ejercicio4.java   # Búsqueda lineal y conteo de ocurrencias
        ├── Ejercicio5.java   # Máximo y mínimo con arreglos paralelos
        └── Ejercicio6.java   # Ejercicio integrador con java.util.Arrays
```

### 🔗 Accesos Directos a la Documentación por Módulo
- 📁 **[Documentación de la Primera Parte (`src/PrimeraParte`)](./src/PrimeraParte/README.md):** Recorrido de arreglos, inversión de orden, acumuladores condicionados por índice/valor y validación de rangos.
- 📁 **[Documentación de la Segunda Parte (`src/SegundaParte`)](./src/SegundaParte/README.md):** Búsqueda lineal con bandera de posición, sincronización de arreglos paralelos (`posMax` / `posMin`) y métodos de `java.util.Arrays` (`copyOf`, `sort`, `toString`, `binarySearch`).

---

## ⚙️ Requisitos del Sistema

- **Java Development Kit (JDK):** Versión 8 o superior (recomendado **JDK 17 LTS** o **JDK 21 LTS**).
- **IDE o Editor:** Visual Studio Code (con *Extension Pack for Java*), Apache NetBeans, IntelliJ IDEA o Eclipse.
- **Terminal / Consola:** PowerShell, CMD o Bash con `javac` y `java` configurados en la variable de entorno `PATH`.

---

## 🚀 Instrucciones de Compilación y Ejecución

Ubíquese en la raíz del repositorio (`SW-AyLP-APE-06-Arreglos-y-Listas`) y ejecute los siguientes comandos desde la terminal:

### 1. Compilar todos los ejercicios
```bash
javac -encoding UTF-8 -d bin src/PrimeraParte/*.java src/SegundaParte/*.java
```

### 2. Ejecutar los ejercicios de la Primera Parte
```bash
# Ejercicio 1: Control de gastos semanales y ajuste por inflación
java -cp bin PrimeraParte.Ejercicio1

# Ejercicio 2: Filtro y suma condicionada de producción
java -cp bin PrimeraParte.Ejercicio2

# Ejercicio 3: Análisis de asistencia y rendimiento
java -cp bin PrimeraParte.Ejercicio3
```

### 3. Ejecutar los ejercicios de la Segunda Parte
```bash
# Ejercicio 4: Búsqueda y conteo
java -cp bin SegundaParte.Ejercicio4

# Ejercicio 5: Máximo y mínimo con arreglos paralelos
java -cp bin SegundaParte.Ejercicio5

# Ejercicio 6: Integrador con java.util.Arrays
java -cp bin SegundaParte.Ejercicio6
```

---

## 📚 Referencias Bibliográficas (Normativa IEEE)

- **[1]** M. I. Barquilla Galeano, *Java programación: teoría y ejemplos*, 1.ª ed. Madrid, España: RA-MA Editorial, 2025. [En línea]. Disponible en: https://elibro.net
- **[2]** F. Blasco, *Programación orientada a objetos en Java*, 1.ª ed. Bogotá, Colombia: Ediciones de la U, 2019. [En línea]. Disponible en: https://elibro.net
- **[3]** M. D. Contreras Castro, *Lógica de programación a partir del pensamiento lógico con software DFD, PSeInt y LPP*, 1.ª ed. Valencia, España: Ediciones USTA, 2023. [En línea]. Disponible en: https://elibro.net
