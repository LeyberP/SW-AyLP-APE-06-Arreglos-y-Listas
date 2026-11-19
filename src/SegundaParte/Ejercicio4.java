package SegundaParte;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Guía Práctica SW-AyLP-APE-06: Arreglos y Listas
 * Segunda Parte - Ejercicio 4: Búsqueda y conteo.
 *
 * Descripción:
 * Dado el arreglo int[] numeros = {14, 7, 25, 3, 18, 7, 30}; solicita un número
 * por teclado y muestra cuántas veces aparece en el arreglo y la primera posición
 * (índice) donde fue encontrado. Si no existe, utiliza posicion = -1 y muestra "No existe".
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Arreglo inicial predefinido
        int[] numeros = {14, 7, 25, 3, 18, 7, 30};

        System.out.println("=== BÚSQUEDA LINEAL Y CONTEO DE ELEMENTOS ===");
        System.out.println("Arreglo actual: " + Arrays.toString(numeros));

        // 2. Solicitar el número a buscar por teclado
        System.out.print("Ingrese el número que desea buscar: ");
        int buscado = scanner.nextInt();

        // 3. Recorrido lineal para contar apariciones y registrar la primera posición
        int contador = 0;
        int posicion = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                contador++;
                // Guardar únicamente la primera posición en la que aparece
                if (posicion == -1) {
                    posicion = i;
                }
            }
        }

        // 4. Mostrar resultados
        System.out.println("\n--- RESULTADO DE LA BÚSQUEDA ---");
        System.out.println("Número buscado        : " + buscado);
        System.out.println("Cantidad de apariciones: " + contador);

        if (posicion != -1) {
            System.out.println("Primera posición (índice): " + posicion);
        } else {
            System.out.println("Primera posición (índice): No existe (posicion = " + posicion + ")");
        }

        scanner.close();
    }
}
