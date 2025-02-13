/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.menwic.prueba2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

/**
 *
 * @author lamr4
 */
class FlattenerTest {

    @Test
    void testFlattenSimpleArray() {
        List<Object> input = List.of(1, 2, List.of("3", "4"));
        List<Object> expected = List.of(1, 2, "3", "4");

        assertEquals(expected, Flattener.flatten(input));
    }

    @Test
    void testFlattenNestedArray() {
        List<Object> input = List.of(1, 2, List.of(3, 4, List.of(5, 6)));
        List<Object> expected = List.of(1, 2, 3, 4, 5, 6);

        assertEquals(expected, Flattener.flatten(input));
    }
}
