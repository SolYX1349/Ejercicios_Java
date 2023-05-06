package parte_1_test.n2_estructuras_condicionales_tests.par_inpar_test;
import org.junit.Assert;
import org.junit.Test;
import parte_1.n2_estructuras_condicionales.par_inpar.EvenOrOdd;
public class EvenOrOddTest {

    @Test
    public void should_return_true_when_you_enter_an_even_number(){
        Assert.assertTrue(EvenOrOdd.myNumberIsEvenOrOdd(2));
    }
    @Test
    public void should_return_false_when_you_enter_an_odd_number(){
        Assert.assertFalse(EvenOrOdd.myNumberIsEvenOrOdd(1));
    }
}
