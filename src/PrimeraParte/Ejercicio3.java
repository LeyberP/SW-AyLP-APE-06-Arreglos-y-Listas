package PrimeraParte;

import java.util.Scanner;

/**
 * Guía Práctica SW-AyLP-APE-06: Arreglos y Listas
 * Primera Parte - Ejercicio 3: Análisis de asistencia y rendimiento.
 *
 * Descripción:
 * Solicita por teclado la cantidad n de estudiantes, llena el arreglo int[] notas
 * validando que cada calificación esté entre 0 y 20, calcula el promedio general
 * evitando división entera, cuenta aprobados (>= 14) y reprobados (< 14), y lista
 * los números de estudiante (Estudiante 1, Estudiante 2...) cuya nota esté
 * estrictamente por debajo del promedio general.
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ANÁLISIS DE ASISTENCIA Y RENDIMIENTO ACADÉMICO ===");

        // 1. Solicitar la cantidad n de estudiantes validando que sea mayor a 0
        int n;
        do {
            System.out.print("Ingrese la cantidad de estudiantes (n > 0): ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Error: La cantidad de estudiantes debe ser mayor a 0.");
            }
        } while (n <= 0);

        // 2. Declarar el arreglo de notas
        int[] notas = new int[n];
        int sumaNotas = 0;
        int aprobados = 0;
        int reprobados = 0;

        // 3. Llenar el arreglo validando que cada nota esté en el rango [0, 20]
        for (int i = 0; i < notas.length; i++) {
            int calificacion;
            do {
                System.out.print("Ingrese la nota del Estudiante " + (i + 1) + " (0 a 20): ");
                calificacion = scanner.nextInt();
                if (calificacion < 0 || calificacion > 20) {
                    System.out.println("Error: Calificación fuera de rango. Debe estar entre 0 y 20.");
                }
            } while (calificacion < 0 || calificacion > 20);

            notas[i] = calificacion;
            sumaNotas += notas[i];

            // Contar aprobados (>= 14) y reprobados (< 14)
            if (notas[i] >= 14) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        // 4. Calcular el promedio general evitando división entera (conversión a double)
        double promedioGeneral = (double) sumaNotas / notas.length;

        // 5. Mostrar resultados estadísticos
        System.out.println("\n--- RESUMEN DE RENDIMIENTO DEL CURSO ---");
        System.out.printf("Promedio general del curso     : %.2f%n", promedioGeneral);
        System.out.println("Cantidad de aprobados (>= 14)  : " + aprobados);
        System.out.println("Cantidad de reprobados (< 14)  : " + reprobados);

        // 6. Listar los estudiantes con nota estrictamente por debajo del promedio general
        System.out.println("\n--- ESTUDIANTES CON NOTA MENOR AL PROMEDIO GENERAL ---");
        boolean hayMenores = false;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < promedioGeneral) {
                System.out.println("Estudiante " + (i + 1) + " (Nota: " + notas[i] + ")");
                hayMenores = true;
            }
        }

        if (!hayMenores) {
            System.out.println("Ningún estudiante tiene una nota menor al promedio general.");
        }

        scanner.close();
    }
}
