package com.menwic.prueba2;

import java.util.List;

public class Prueba2 {

    public static void main(String[] args) {
        List<Object> input = List.of(1, 2, List.of(3, 4, List.of(5, 6)));
        List<Object> result = Flattener.flatten(input);

        System.out.println("Entrada: " + input);
        System.out.println("Resultado (Aplanado): " + result);
    }
}
