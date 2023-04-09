package parte_1_test.n2_estructuras_condicionales_tests.palabra_mas_larga_test;
import parte_1.n2_estructuras_condicionales.palabra_mas_larga.PalabraMasLrga;
import org.junit.Assert;
import org.junit.Test;

public class PalabraMasLargaTest {

    @Test
    public void should_return_the_first_word(){
        Assert.assertEquals("Corazon",PalabraMasLrga.theWordMostLength("Corazon","Uno"));
    }
    @Test
    public void should_return_the_second_word(){
        Assert.assertEquals("Adios",PalabraMasLrga.theWordMostLength("Hola","Adios"));
    }
    @Test
    public void it_should_return_that_the_two_words_have_the_same_size(){
        Assert.assertEquals("Same Size",PalabraMasLrga.theWordMostLength("Diez","Diez"));
    }
    @Test
    public void should_return_an_empty_string_for_null_argument(){
        Assert.assertEquals("",PalabraMasLrga.theWordMostLength("Diez",null));
    }
}
