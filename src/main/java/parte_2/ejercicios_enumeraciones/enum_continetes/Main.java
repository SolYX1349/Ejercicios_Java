package parte_2.ejercicios_enumeraciones.enum_continetes;

import com.mis_ejercicios.parte_2.ejercicios_enumeraciones.enum_continetes.dominio.Continentes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Continente 2# " + Continentes.AMERICA
                + "\nCantidad Paises = " + Continentes.AMERICA.getPAISES()
                + "\nContinente Habitable : " + Continentes.AMERICA.isHABITABLE());
        System.out.println("Continente 6# " + Continentes.ANTARTIDA
                + "\nCantidad Paises = " + Continentes.ANTARTIDA.getPAISES()
                + "\nContinente Habitable : " + Continentes.ANTARTIDA.isHABITABLE());
    }
}
