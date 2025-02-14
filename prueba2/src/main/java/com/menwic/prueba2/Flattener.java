package com.menwic.prueba2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Aplana una lista de elementos arbitrariamente anidados en una sola lista.
 *
 * Complejidad Temporal: O(N) - Se visita cada elemento una sola vez.
 * Complejidad Espacial: O(N) - Se almacena cada elemento en la lista final.
 *
 * @param input Lista con elementos anidados.
 * @return Lista plana con todos los elementos.
 * @throws IllegalArgumentException si la lista es null/vacia.
 */
public class Flattener {

    public static List<Object> flatten(List<Object> input) {
        if (input == null) {
            throw new IllegalArgumentException("Input list cannot be null");
        }
        List<Object> result = new ArrayList<>();
        flattenHelper(input, result);
        return result;
    }

    @SuppressWarnings("unchecked") // Evita advertencias de casting
    private static void flattenHelper(List<Object> input, List<Object> result) {
        for (Object element : input) {
            if (element instanceof List) {
                flattenHelper((List<Object>) element, result);
            } else if (element != null) { // Ignorar elementos nulos
                result.add(element);
            }
        }
    }
}
