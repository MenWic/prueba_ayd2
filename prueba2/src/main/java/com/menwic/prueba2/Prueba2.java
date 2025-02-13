/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.menwic.prueba2;

import java.util.List;

/**
 *
 * @author lamr4
 */
public class Prueba2 {
    public static void main(String[] args) {
        List<Object> input = List.of(1, 2, List.of(3, 4, List.of(5, 6)));
        List<Object> result = Flattener.flatten(input);

        System.out.println("Resultado: " + result);
    }
}
