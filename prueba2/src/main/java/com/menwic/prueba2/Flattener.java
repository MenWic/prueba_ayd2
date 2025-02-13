/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.menwic.prueba2;

/**
 *
 * @author lamr4
 */

import java.util.ArrayList;
import java.util.List;

public class Flattener {

    public static List<Object> flatten(List<Object> input) {
        List<Object> result = new ArrayList<>();
        flattenHelper(input, result);
        return result;
    }

    private static void flattenHelper(List<Object> input, List<Object> result) {
        for (Object element : input) {
            if (element instanceof List) {
                flattenHelper((List<Object>) element, result);
            } else {
                result.add(element);
            }
        }
    }
}

