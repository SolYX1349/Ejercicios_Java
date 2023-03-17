package parte_1_test.n2_estructuras_condicionales_tests.conversor_notas_musicales_test;

import org.junit.Assert;
import org.junit.Test;
import parte_1.n2_estructuras_condicionales.conversor_notas_musicales.Main;
public class ConversorNotasMusicalesTest {

    @Test
    public void should_return_fail_message_for_null_argument(){
        String expectedMessage = "Fail to convert";
        Assert.assertEquals(expectedMessage,Main.conversor(null));
    }
    @Test
    public void should_return_fail_message_for_empty_argument(){
        String expectedMessage = "Fail to convert";
        Assert.assertEquals(expectedMessage,Main.conversor(""));
    }
    @Test
    public void should_return_fail_message_for_no_correspond(){
        String expectedMessage = "Fail to convert";
        Assert.assertEquals(expectedMessage,Main.conversor("Fo"));
    }
    @Test
    public void should_return_the_musical_note_in_spanish_when_i_enter_a_note_in_english(){
        String expectedMessage = "SI";
        Assert.assertEquals(expectedMessage,Main.conversor("b"));
    }
    @Test
    public void should_return_the_musical_note_in_english_when_i_enter_a_note_in_spanish(){
        String expectedMessage = "B";
        Assert.assertEquals(expectedMessage,Main.conversor("si"));
    }
}
