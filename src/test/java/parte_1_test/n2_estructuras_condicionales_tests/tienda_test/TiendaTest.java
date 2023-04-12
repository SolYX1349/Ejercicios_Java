package parte_1_test.n2_estructuras_condicionales_tests.tienda_test;

import org.junit.Assert;
import parte_1.n2_estructuras_condicionales.tienda.Tienda;
import org.junit.Test;

public class TiendaTest {

    @Test
    public void should_return_two_for_entering_two_elements_equal_to_2000() {
        String expectedMessage = "Total Approved Sales = 2";
        double[] arraySales = {300, 2000, 2000, 10};
        Assert.assertEquals(expectedMessage, Tienda.salesLimitCounter(arraySales, 2000));
    }
    @Test
    public void should_return_zero_for_not_introducing_a_budget_limit() {
        String expectedMessage = "Total Approved Sales = 0";
        double[] arraySales = {300, 2000, 2000, 10};
        Assert.assertEquals(expectedMessage, Tienda.salesLimitCounter(arraySales, 0));
    }
    @Test
    public void should_return_an_error_message_for_null_argument() {
        String expectedMessage = "Error";
        Assert.assertEquals(expectedMessage, Tienda.salesLimitCounter(null, 0));
    }
}
