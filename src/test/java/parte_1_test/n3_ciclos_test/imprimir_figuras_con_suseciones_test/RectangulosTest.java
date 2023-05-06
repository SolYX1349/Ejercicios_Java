package parte_1_test.n3_ciclos_test.imprimir_figuras_con_suseciones_test;

import org.junit.Assert;
import org.junit.Test;
import parte_1.n3_ciclos.imprimir_figuras_con_suseciones.Rectangulos;

public class RectangulosTest {
    public String expectedMessage =
                            "@@@@@@@@@@@@\n" +
                            "@          @\n" +
                            "@          @\n" +
                            "@          @\n" +
                            "@          @\n" +
                            "@          @\n" +
                            "@          @\n" +
                            "@          @\n" +
                            "@          @\n" +
                            "@          @\n" +
                            "@          @\n" +
                            "@@@@@@@@@@@@";

    @Test
    public void should_return_an_rectangle(){
        Assert.assertEquals(expectedMessage , Rectangulos.rectangulo());
    }
}
