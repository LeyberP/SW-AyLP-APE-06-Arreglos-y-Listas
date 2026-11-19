package PrimeraParte;

import java.util.Scanner;

/**
 * Guía Práctica SW-AyLP-APE-06: Arreglos y Listas
 * Primera Parte - Ejercicio 2: Filtro y suma condicionada de producción.
 *
 * Descripción:
 * Declara un arreglo de 10 enteros ingresados por teclado (piezas producidas por turno),
 * calcula la suma de las piezas en posiciones pares de índice (0, 2, 4, 6, 8),
 * cuenta cuántos turnos tuvieron una producción impar y mayor a 15 unidades,
 * y muestra el promedio general de producción con 2 decimales.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Declarar el arreglo de 10 turnos de producción
        int[] produccion = new int[10];
        int sumaIndicesPares = 0;
        int contadorImparMayor15 = 0;
        int sumaTotal = 0;

        System.out.println("=== FILTRO Y SUMA CONDICIONADA DE PRODUCCIÓN (10 TURNOS) ===");

        // 2. Ingreso de datos por teclado y procesamiento de condiciones
        for (int i = 0; i < produccion.length; i++) {
            int piezas;
            do {
                System.out.print("Ingrese las piezas producidas en el Turno " + (i + 1) + " (índice " + i + "): ");
                piezas = scanner.nextInt();
                if (piezas < 0) {
                    System.out.println("Error: La cantidad de piezas no puede ser negativa.");
                }
            } while (piezas < 0);

            produccion[i] = piezas;
            sumaTotal += produccion[i];

            // Suma de las piezas ubicadas en posiciones pares de índice (0, 2, 4, 6, 8)
            if (i % 2 == 0) {
                sumaIndicesPares += produccion[i];
            }

            // Contar turnos con producción impar y estrictamente mayor a 15 unidades
            if (produccion[i] % 2 != 0 && produccion[i] > 15) {
                contadorImparMayor15++;
            }
        }

        // 3. Calcular el promedio general de producción (conversión a double para evitar división entera)
        double promedioGeneral = (double) sumaTotal / produccion.length;

        // 4. Mostrar resultados
        System.out.println("\n--- RESULTADOS DEL ANÁLISIS DE PRODUCCIÓN ---");
        System.out.println("Suma de piezas en índices pares (0, 2, 4, 6, 8) : " + sumaIndicesPares);
        System.out.println("Turnos con producción impar y mayor a 15 piezas : " + contadorImparMayor15);
        System.out.printf("Promedio general de producción                  : %.2f piezas%n", promedioGeneral);

        scanner.close();
    }
}
