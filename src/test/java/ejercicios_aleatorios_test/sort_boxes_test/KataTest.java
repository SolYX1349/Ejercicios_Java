package ejercicios_aleatorios_test.sort_boxes_test;

import ejercicios_aleatorios.sort_boxes.Kata;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class KataTest {
    @Test
    public void should_return_sorted_array_right() {
        assertArrayEquals(new int[]{1, 2, 2, 3}, Kata.flip('R', new int[]{3, 2, 1, 2}));
    }

    @Test
    public void should_return_sorted_array_inverse() {
        assertArrayEquals(new int[]{5, 5, 4, 3, 1}, Kata.flip('L', new int[]{1, 4, 5, 3, 5}));
    }
}
