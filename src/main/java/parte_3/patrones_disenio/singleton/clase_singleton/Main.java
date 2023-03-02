package parte_3.patrones_disenio.singleton.clase_singleton;

import parte_3.patrones_disenio.singleton.clase_singleton.clase_x.Paises;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Paises paises = new Paises(); No se genera una nueva instancia.
        Paises paises = Paises.getInstance();
        List<String> p = Paises.getPaises();
        p.forEach(System.out::println);

        System.out.println("///////////////");

        for (String array:Paises.getPaisesArray()) {
            System.out.println(array);
        }
        for (String array:Paises.getPaisesArray()) {
            System.out.println(array);
        }
    }
}
