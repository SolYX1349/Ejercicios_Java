package parte_1_test.n3_ciclos_test.imprimir_figuras_con_suseciones_test;

import parte_1.n3_ciclos.imprimir_figuras_con_suseciones.Pyramid;
import org.junit.Assert;
import org.junit.Test;

public class PyramidTest {
    public String expectedMessage =
                    "         0 \n" +
                    "        1 1 \n" +
                    "       2 2 2 \n" +
                    "      3 3 3 3 \n" +
                    "     4 4 4 4 4 \n" +
                    "    5 5 5 5 5 5 \n" +
                    "   6 6 6 6 6 6 6 \n" +
                    "  7 7 7 7 7 7 7 7 \n" +
                    " 8 8 8 8 8 8 8 8 8 \n" +
                    "9 9 9 9 9 9 9 9 9 9 ";

    @Test
    public void should_return_an_pyramid() {
        Assert.assertEquals(expectedMessage, Pyramid.pyramid());
    }
}
