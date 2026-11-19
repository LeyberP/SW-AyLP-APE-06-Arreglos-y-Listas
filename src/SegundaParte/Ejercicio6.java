package SegundaParte;

import java.util.Arrays;

/**
 * Guía Práctica SW-AyLP-APE-06: Arreglos y Listas
 * Segunda Parte - Ejercicio 6: Integrador con java.util.Arrays.
 *
 * Descripción:
 * Dado el arreglo int[] datos = {14, 7, 25, 3, 18}; crea una copia real con Arrays.copyOf,
 * ordena únicamente la copia con Arrays.sort, muestra ambos arreglos con Arrays.toString,
 * indica el segundo número mayor y busca la posición del número 14 dentro de la copia
 * ordenada utilizando Arrays.binarySearch.
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        System.out.println("=== EJERCICIO INTEGRADOR CON java.util.Arrays ===");

        // 1. Arreglo original de datos
        int[] datos = {14, 7, 25, 3, 18};

        // 2. Crear una copia real del arreglo utilizando Arrays.copyOf
        int[] copiaDatos = Arrays.copyOf(datos, datos.length);

        // 3. Ordenar únicamente la copia en orden ascendente usando Arrays.sort
        Arrays.sort(copiaDatos);

        // 4. Mostrar el arreglo original y la copia ordenada utilizando Arrays.toString
        System.out.println("Arreglo original (sin modificar) : " + Arrays.toString(datos));
        System.out.println("Copia ordenada (Arrays.sort)     : " + Arrays.toString(copiaDatos));

        // 5. Indicar cuál es el segundo número mayor (penúltimo elemento de la copia ordenada)
        int segundoMayor = copiaDatos[copiaDatos.length - 2];
        System.out.println("Segundo número mayor del arreglo : " + segundoMayor);

        // 6. Buscar la posición del número 14 en la copia ordenada usando Arrays.binarySearch
        int valorBuscado = 14;
        int posicion14 = Arrays.binarySearch(copiaDatos, valorBuscado);
        System.out.println("Posición del número " + valorBuscado + " en la copia ordenada (binarySearch): índice " + posicion14);
    }
}
