package parte_1_test.n4_arreglos_test.arreglos_bidimencionales_test.inicializar_imprimir_test;

import org.junit.Assert;
import org.junit.Test;
import parte_1.n4_arreglos.arreglos_bidimencionales.inicializar_imprimir.InicializaImprime;

public class InicializaImprimeTest {

    @Test
    public void should_return_an_array_two_dimensional() {
        String expectedMessage =
                "numeros [0][0] = 0\n" +
                "numeros [0][1] = 0\n" +
                "numeros [1][0] = 1\n" +
                "numeros [1][1] = 1";
        Assert.assertEquals(expectedMessage, InicializaImprime.getAnArrayOfTypeString());
    }
}
