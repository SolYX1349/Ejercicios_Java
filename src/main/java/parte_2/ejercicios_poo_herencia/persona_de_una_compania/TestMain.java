package parte_2.ejercicios_poo_herencia.persona_de_una_compania;

import com.mis_ejercicios.parte_2.ejercicios_poo_herencia.persona_de_una_compania.domain.Gerente;

public class TestMain {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(67000.00, 1, 200.00, "177.737.677.4", "Carlos", "Ignacio", "Insurgentes sur #456");
        gerente.aumentarRemuneracion(15);
        gerente.setPresupuesto(77000.00);
        System.out.println(gerente);
    }
}
