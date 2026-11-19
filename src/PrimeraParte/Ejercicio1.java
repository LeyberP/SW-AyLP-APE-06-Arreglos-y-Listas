package PrimeraParte;

import java.util.Scanner;

/**
 * Guía Práctica SW-AyLP-APE-06: Arreglos y Listas
 * Primera Parte - Ejercicio 1: Control de gastos semanales y ajuste por inflación.
 *
 * Descripción:
 * Registra 7 gastos diarios en un arreglo double[], calcula el gasto total de la semana
 * y el promedio diario, aplica un incremento del 10 % únicamente a los días cuyo gasto
 * supere el promedio semanal, muestra el arreglo actualizado en orden inverso (del día 7 al 1)
 * e indica cuántos días sufrieron el incremento.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Declarar el arreglo de 7 gastos diarios
        double[] gastos = new double[7];
        double sumaTotal = 0.0;

        System.out.println("=== CONTROL DE GASTOS SEMANALES Y AJUSTE POR INFLACIÓN ===");

        // 2. Registro de los 7 gastos diarios y acumulación para el total
        for (int i = 0; i < gastos.length; i++) {
            double valor;
            do {
                System.out.print("Ingrese el gasto del Día " + (i + 1) + " ($): ");
                valor = scanner.nextDouble();
                if (valor < 0) {
                    System.out.println("Error: El gasto no puede ser negativo. Intente nuevamente.");
                }
            } while (valor < 0);

            gastos[i] = valor;
            sumaTotal += gastos[i];
        }

        // 3. Calcular el promedio diario de gasto
        double promedioDiario = sumaTotal / gastos.length;

        System.out.println("\n--- RESUMEN INICIAL ---");
        System.out.printf("Gasto total de la semana : $%.2f%n", sumaTotal);
        System.out.printf("Promedio diario de gasto : $%.2f%n", promedioDiario);

        // 4. Aplicar incremento del 10 % a los días que superen el promedio semanal
        int diasIncrementados = 0;
        for (int i = 0; i < gastos.length; i++) {
            if (gastos[i] > promedioDiario) {
                gastos[i] = gastos[i] * 1.10; // Aumento del 10 %
                diasIncrementados++;
            }
        }

        // 5. Mostrar el arreglo actualizado en orden inverso (del día 7 al día 1)
        System.out.println("\n--- GASTOS ACTUALIZADOS (ORDEN INVERSO: DÍA 7 AL DÍA 1) ---");
        for (int i = gastos.length - 1; i >= 0; i--) {
            System.out.printf("Día %d: $%.2f%n", (i + 1), gastos[i]);
        }

        // 6. Indicar cuántos días sufrieron el incremento
        System.out.println("\nCantidad de días que recibieron el incremento del 10 %: " + diasIncrementados);

        scanner.close();
    }
}
