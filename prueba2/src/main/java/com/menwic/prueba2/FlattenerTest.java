package com.menwic.prueba2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

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

    @Test
    void testFlattenDeeplyNestedArray() {
        List<Object> input = List.of(1, 2, List.of(3, 4, List.of(5, 6, List.of(7, 8, List.of(9, 10)))));
        List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertEquals(expected, Flattener.flatten(input));
    }

    @Test
    void testFlattenEmptyArray() {
        List<Object> input = List.of();
        List<Object> expected = List.of();

        assertEquals(expected, Flattener.flatten(input));
    }

    @Test
    void testFlattenArrayWithDifferentTypes() {
        List<Object> input = List.of(1, 2, List.of("a", "b", List.of(5, 6)));
        List<Object> expected = List.of(1, 2, "a", "b", 5, 6);

        assertEquals(expected, Flattener.flatten(input));
    }

    @Test
    void testFlattenArrayWithNullValues() {
        List<Object> input = List.of(1, null, List.of(2, null, List.of(3, null)));
        List<Object> expected = List.of(1, 2, 3); // Ignora null

        assertEquals(expected, Flattener.flatten(input));
    }

    @Test
    void testFlattenNullList() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Flattener.flatten(null);
        });

        assertEquals("Input list cannot be null", exception.getMessage());
    }
}
