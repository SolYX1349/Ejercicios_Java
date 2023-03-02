package parte_3.patrones_disenio.singleton.clase_singleton.clase_x;

import java.util.*;

public class Paises {
    private Paises(){}
    private static Paises instancia = null;
    public static Paises getInstance(){
        if (Paises.instancia == null){
            Paises.instancia = new Paises();
        }
        return Paises.instancia;
    }
    private static List<String> paisList = null;
    public static List<String> getPaises(){
        if (Paises.paisList == null) {
            Paises.paisList = new ArrayList<>();
            Paises.paisList.add("Canada");
            Paises.paisList.add("Estados Unidos");
            Paises.paisList.add("Mexico");
            Paises.paisList.add("Guatemala");
            return paisList;
        }
        return paisList;
    }

    private static String [] instanciaArray = null;

    public static String [] getPaisesArray (){
        if (Paises.instanciaArray == null){
            Paises.instanciaArray = new String[4];
            instanciaArray [0] = "Canada";
            instanciaArray [1] = "Estados Unidos";
            instanciaArray [2] = "Mexico";
            instanciaArray [3] = "Guatemala";
        }
        return Paises.instanciaArray;
    }
}
