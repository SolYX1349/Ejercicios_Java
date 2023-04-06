package ejercicios_aleatorios_test.desplazamiento_y_distancia_test;

import ejercicios_aleatorios.desplazamiento_y_distancia.Displacement;
import org.junit.Assert;
import org.junit.Test;

public class DisplacementTest {

    @Test
    public void should_return_similar_values_in_the_array_values() {
        int[] arrayValues = {2, 7, 11, 15};
        int[] arrayExpected = {0, 1};
        int[] arrayActual = Displacement.twoSum(arrayValues, 9);
        Assert.assertEquals(arrayExpected[0], arrayActual[0]);
        Assert.assertEquals(arrayExpected[1], arrayActual[1]);
    }
    @Test
    public void should_return_an_array_with_values_in_zero_for_small_length() {
        int[] arrayValues = {2};
        int[] arrayExpected = {0, 0};
        int[] arrayActual = Displacement.twoSum(arrayValues, 9);
        Assert.assertEquals(arrayExpected[0], arrayActual[0]);
        Assert.assertEquals(arrayExpected[1], arrayActual[1]);
    }
}
