/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.menwic.prueba;

import java.util.Arrays;  // Importación para leer entrada del usuario
import java.util.Scanner;   // Importación para ordenar los arreglos de caracteres

/**
 *
 * @author lamr4
 */
public class Prueba_ayd2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de palabras a evaluar
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = scanner.nextLine();

        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        // Verificar si son anagramas (falta)
        if (esAnagrama(palabra1, palabra2)) {
            System.out.println("Las palabras \"" + palabra1 + "\" y \"" + palabra2 + "\" son anagramas.");
        } else {
            System.out.println("Las palabras \"" + palabra1 + "\" y \"" + palabra2 + "\" NO son anagramas.");
        }

        scanner.close();  // Cerrar el Scanner para liberar recursos
    }

    // Método para verificar si dos palabras son anagramas ntt
    public static boolean esAnagrama(String palabra1, String palabra2) {
        if (palabra1 == null || palabra2 == null) return false;
        if (palabra1.length() != palabra2.length()) return false;
        
        // Convertir a minúsculas para ignorar mayúsculas y evitar problemas de casesensitive
        char[] array1 = palabra1.toLowerCase().toCharArray();
        char[] array2 = palabra2.toLowerCase().toCharArray();
        
        // Ordenar los caracteres dentro de los arreglos
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        // Comparar si son iguales 2 palabras
        return Arrays.equals(array1, array2);
    }
}

/* 
 * Aun pendiente de tetsear y de desarrollar TDD
 */