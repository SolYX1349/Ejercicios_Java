package ejercicios_aleatorios_test.separacion_de_cadenas_test;

import ejercicios_aleatorios.separacion_de_cadenas.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    String cadena = "nombre;apellido;ciudad;edad;pais";
    String[] arreglo = {"nombre", "apellido", "ciudad", "edad", "pais"};

    @Test
    public void should_return_string_array() {
        Assertions.assertArrayEquals(arreglo, Main.splitString(cadena, ";"));
    }
}
