package parte_1_test.n2_estructuras_condicionales_tests.anios_bisiestos_test;

import org.junit.Assert;
import org.junit.Test;
import parte_1.n2_estructuras_condicionales.anios_bisiestos.Main;

public class AniosBiciestosTest {

    @Test
    public void should_return_an_invalid_message_for_negative_year(){
        String expectedMessage = "Invalid Year";
        Assert.assertEquals(expectedMessage,Main.isItLeapYear(-1));
    }
    @Test
    public void should_return_an_invalid_message_for_null_argument(){
        String expectedMessage = "Invalid Year";
        Assert.assertEquals(expectedMessage,Main.isItLeapYear(null));
    }
    @Test
    public void should_return_a_message_for_leap_year(){
        String expectedMessage = "2024 It's Leap Year";
        Assert.assertEquals(expectedMessage,Main.isItLeapYear(2024));
    }
    @Test
    public void should_return_a_message_for_not_a_leap_year(){
        String expectedMessage = "2023 Not a Leap Year";
        Assert.assertEquals(expectedMessage,Main.isItLeapYear(2023));
    }
}
