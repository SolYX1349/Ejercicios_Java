package parte_1_test.n3_ciclos_test.multiplos_test;

import parte_1.n3_ciclos.multiplos.Multiplos;
import org.junit.Assert;
import org.junit.Test;

public class MultiplosTest {

    @Test
    public void should_return_multiplos() {
        String expected = "3 X 1 = 3\n" +
                "3 X 2 = 6\n" +
                "3 X 3 = 9\n" +
                "3 X 4 = 12\n" +
                "3 X 5 = 15\n" +
                "3 X 6 = 18\n" +
                "3 X 7 = 21\n" +
                "3 X 8 = 24\n" +
                "3 X 9 = 27\n" +
                "3 X 10 = 30";
        Assert.assertEquals(expected, Multiplos.getMultiplos(3));
    }
}
