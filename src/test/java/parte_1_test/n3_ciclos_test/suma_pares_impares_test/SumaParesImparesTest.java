package parte_1_test.n3_ciclos_test.suma_pares_impares_test;

import org.junit.Assert;
import org.junit.Test;
import parte_1.n3_ciclos.suma_pares_impares.SumaParesImpares;
public class SumaParesImparesTest {

    @Test
    public void should_return_a_sum_of_even_numbers(){
        Assert.assertEquals(20, SumaParesImpares.sumPair(new int[]{1,2,3,4,5,6,7,8,9}));
    }
    @Test
    public void should_return_a_sum_of_odd_numbers(){
        Assert.assertEquals(25, SumaParesImpares.sumOdd(new int[]{1,2,3,4,5,6,7,8,9}));
    }
}
