package ejercicios_aleatorios_test.separacion_de_cadenas_test;

import ejercicios_aleatorios.separacion_de_cadenas.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SeparadorCadenasTest {
    Main main;

    @Before
    public void initialize() {
        main = new Main();
    }

    @Test
    public void should_return_empty_array_for_null_regEx() {
        String[] arrayExpected = new String[1];
        Assert.assertArrayEquals(arrayExpected, main.splitString("nombre;apellido;ciudad", null));
    }

    @Test
    public void should_return_empty_array_for_null_text() {
        String[] arrayExpected = new String[1];
        Assert.assertArrayEquals(arrayExpected, main.splitString(null, ";"));
    }

    @Test
    public void should_return_empty_array_for_no_fined_regEx_in_the_text() {
        String[] arrayExpected = new String[1];
        Assert.assertArrayEquals(arrayExpected, main.splitString("nombre;apellido;ciudad", "."));
    }

    @Test
    public void should_return_empty_array_for_text_empty() {
        String[] arrayExpected = new String[1];
        Assert.assertArrayEquals(arrayExpected, main.splitString("", "."));
    }

    @Test
    public void should_return_empty_array_for_regEx_empty() {
        String[] arrayExpected = new String[1];
        Assert.assertArrayEquals(arrayExpected, main.splitString("nombre;apellido;ciudad", ""));
    }

    @Test
    public void should_return_empty_array_for_small_text() {
        String[] arrayExpected = new String[1];
        Assert.assertArrayEquals(arrayExpected, main.splitString(";", ";"));
    }

    @Test
    public void should_trim_the_string() {
        String[] arrayExpected = {"nombre", "apellido", "ciudad"};
        Assert.assertArrayEquals(arrayExpected, main.splitString("nombre;apellido;ciudad", ";"));
    }
}
