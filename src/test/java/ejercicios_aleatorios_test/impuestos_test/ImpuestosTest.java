package ejercicios_aleatorios_test.impuestos_test;

import ejercicios_aleatorios.impuestos.Impuestos;
import org.junit.Assert;
import org.junit.Test;

public class ImpuestosTest {
    @Test
    public void should_return_an_string() {
        String expectedMessage = "Nombre factura: Algorithmic\n" +
                "Total = 1542.0\n" +
                "Impuesto: 246.72\n" +
                "Total mas impuesto: 1788.72";
        Assert.assertEquals(expectedMessage, Impuestos.createFacture("Algorithmic", new Double[]{1200.0, 342.0}));
    }

    @Test
    public void should_return_error_message_for_void_name() {
        String expectedMessage = "Error";
        Assert.assertEquals(expectedMessage, Impuestos.createFacture("", new Double[]{1200.0, 342.0}));
    }
}
