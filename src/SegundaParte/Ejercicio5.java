package SegundaParte;

/**
 * Guía Práctica SW-AyLP-APE-06: Arreglos y Listas
 * Segunda Parte - Ejercicio 5: Máximo y mínimo con arreglos paralelos.
 *
 * Descripción:
 * Dados los arreglos paralelos String[] nombres = {"Ana", "Luis", "Marta", "Pedro"};
 * e int[] notas = {15, 8, 18, 11}; muestra el nombre del estudiante con la nota más alta
 * y su calificación, el nombre del estudiante con la nota más baja y su calificación
 * (utilizando posMax y posMin), y el promedio general del grupo con 2 decimales.
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        // 1. Declaración de arreglos paralelos predefinidos
        String[] nombres = {"Ana", "Luis", "Marta", "Pedro"};
        int[] notas = {15, 8, 18, 11};

        System.out.println("=== MÁXIMO Y MÍNIMO CON ARREGLOS PARALELOS ===");
        System.out.println("Listado de estudiantes y calificaciones:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(" - " + nombres[i] + ": " + notas[i]);
        }

        // 2. Inicializar índices posMax y posMin en 0 y acumulador de suma
        int posMax = 0;
        int posMin = 0;
        int sumaNotas = 0;

        // 3. Recorrer los arreglos paralelos para hallar posMax, posMin y la suma total
        for (int i = 0; i < notas.length; i++) {
            sumaNotas += notas[i];

            if (notas[i] > notas[posMax]) {
                posMax = i;
            }
            if (notas[i] < notas[posMin]) {
                posMin = i;
            }
        }

        // 4. Calcular el promedio general con conversión a double
        double promedioGrupo = (double) sumaNotas / notas.length;

        // 5. Mostrar resultados
        System.out.println("\n--- RESULTADOS DEL ANÁLISIS ---");
        System.out.println("Nota más alta : " + nombres[posMax] + " con " + notas[posMax] + " puntos (posMax = " + posMax + ")");
        System.out.println("Nota más baja : " + nombres[posMin] + " con " + notas[posMin] + " puntos (posMin = " + posMin + ")");
        System.out.printf("Promedio general del grupo: %.2f puntos%n", promedioGrupo);
    }
}
