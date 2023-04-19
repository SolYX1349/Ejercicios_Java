package parte_1_test.n3_ciclos_test.lanzar_dados_test;

import org.junit.Assert;
import org.junit.Test;
import parte_1.n3_ciclos.lanzar_dados.LanzarDados;


public class LanzarDadosTest {
    public static final String EXPECTED_MESSAGE =
            "Conjunto #1\n" +
                    "1-1\n" +
                    "1-2\n" +
                    "1-3\n" +
                    "1-4\n" +
                    "1-5\n" +
                    "1-6\n" +
                    "Conjunto #2\n" +
                    "2-1\n" +
                    "2-2\n" +
                    "2-3\n" +
                    "2-4\n" +
                    "2-5\n" +
                    "2-6\n" +
                    "Conjunto #3\n" +
                    "3-1\n" +
                    "3-2\n" +
                    "3-3\n" +
                    "3-4\n" +
                    "3-5\n" +
                    "3-6\n" +
                    "Conjunto #4\n" +
                    "4-1\n" +
                    "4-2\n" +
                    "4-3\n" +
                    "4-4\n" +
                    "4-5\n" +
                    "4-6\n" +
                    "Conjunto #5\n" +
                    "5-1\n" +
                    "5-2\n" +
                    "5-3\n" +
                    "5-4\n" +
                    "5-5\n" +
                    "5-6\n" +
                    "Conjunto #6\n" +
                    "6-1\n" +
                    "6-2\n" +
                    "6-3\n" +
                    "6-4\n" +
                    "6-5\n" +
                    "6-6";

    @Test
    public void should_return_all_the_posibles_when_call_the_function() {
        Assert.assertEquals(EXPECTED_MESSAGE, LanzarDados.getPosiblesDado());
    }
}
