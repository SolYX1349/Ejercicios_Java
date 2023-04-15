package parte_1_test.n3_ciclos_test.escalera_iterator_test;

import org.junit.Assert;
import org.junit.Test;
import parte_1.n3_ciclos.escalera_iterador.*;

public class EscaleraIteratorTest {

    private static final String STAIR_TO_FIVE = "1\n" +
            "12\n" +
            "123\n" +
            "1234\n" +
            "12345";

    @Test
    public void should_return_a_straight_with_for() {
        Assert.assertEquals(STAIR_TO_FIVE, EscaleraFor.escaleraFor(5));
    }
    @Test
    public void should_return_a_straight_with_while() {
        Assert.assertEquals(STAIR_TO_FIVE, EscaleraWhile.escaleraWhile(5));
    }
    @Test
    public void should_return_a_straight_with_do_while() {
        Assert.assertEquals(STAIR_TO_FIVE, EscaleraDoWhile.escaleraDoWhile(5));
    }
}
