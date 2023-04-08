package parte_1_test.n2_estructuras_condicionales_tests.numeros_promedio_test;

import org.junit.Assert;
import parte_1.n2_estructuras_condicionales.numeros_promedio.NumerosPromedio;
import org.junit.Test;

public class NumerosPromedioTest {

    @Test
    public void should_return_one_on_all_values() {
        int[] actualArray = {1,0,-2};
        int[] expectedArray = {1, 1, 1};
        Assert.assertEquals(expectedArray[0], NumerosPromedio.numberAverage(actualArray)[0]);
        Assert.assertEquals(expectedArray[1], NumerosPromedio.numberAverage(actualArray)[1]);
        Assert.assertEquals(expectedArray[2], NumerosPromedio.numberAverage(actualArray)[2]);
    }
    @Test
    public void should_return_three_on_the_fist_position_for_positive_values() {
        int[] actualArray = {1,245,6664};
        int[] expectedArray = {3, 0, 0};
        Assert.assertEquals(expectedArray[0], NumerosPromedio.numberAverage(actualArray)[0]);
        Assert.assertEquals(expectedArray[1], NumerosPromedio.numberAverage(actualArray)[1]);
        Assert.assertEquals(expectedArray[2], NumerosPromedio.numberAverage(actualArray)[2]);
    }
    @Test
    public void should_return_three_on_the_second_position_for_negative_values() {
        int[] actualArray = {-1,-45,-64};
        int[] expectedArray = {0, 3, 0};
        Assert.assertEquals(expectedArray[0], NumerosPromedio.numberAverage(actualArray)[0]);
        Assert.assertEquals(expectedArray[1], NumerosPromedio.numberAverage(actualArray)[1]);
        Assert.assertEquals(expectedArray[2], NumerosPromedio.numberAverage(actualArray)[2]);
    }
    @Test
    public void should_return_three_on_the_third_position_for_empty_values() {
        int[] actualArray = new int[3];
        int[] expectedArray = {0, 0, 3};
        Assert.assertEquals(expectedArray[0], NumerosPromedio.numberAverage(actualArray)[0]);
        Assert.assertEquals(expectedArray[1], NumerosPromedio.numberAverage(actualArray)[1]);
        Assert.assertEquals(expectedArray[2], NumerosPromedio.numberAverage(actualArray)[2]);
    }
}
