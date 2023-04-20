package parte_1_test.n3_ciclos_test.multiplicar_sumando_test;

import org.junit.Assert;
import org.junit.Test;
import parte_1.n3_ciclos.multiplicar_sumando.MultiplicarSumando;

public class MultiplicarSumandoTest {

    @Test
    public void should_return_the_correct_multiplication_in_positive() {
        int expectedNumber = 70;
        Assert.assertEquals(expectedNumber, MultiplicarSumando.multiplicaSumando(7, 10));
    }

    @Test
    public void should_return_the_correct_multiplication_in_negative() {
        int expectedNumber = -25;
        Assert.assertEquals(expectedNumber, MultiplicarSumando.multiplicaSumando(-5, 5));
    }
}
