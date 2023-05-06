package parte_1_test.n3_ciclos_test.conjetura_collatz_test;

import org.junit.Assert;
import org.junit.Test;
import parte_1.n3_ciclos.conjetura_collatz.ConjeturaCollatz;

public class ConjeturaCollatzTest {
    @Test
    public void should_return_a_string_with_numbers_until_the_number_is_found() {
        Assert.assertEquals("10 5 16 8 4 2 1", ConjeturaCollatz.formula3n(10, 1));
    }
    @Test
    public void should_return_a_very_long_string_for_not_finding_the_number() {
        String expected = "10 5 16 8 4 2 1 \n" +
                "4 2 1 \n" +
                "4 2 1 \n" +
                "4 2 1 \n" +
                "4 2 1 \n" +
                "4 2 1 \n" +
                "4 2 1 \n" +
                "4 2 1 \n" +
                "4 2 1";
        Assert.assertEquals(expected, ConjeturaCollatz.formula3n(10, 6));
    }
}
