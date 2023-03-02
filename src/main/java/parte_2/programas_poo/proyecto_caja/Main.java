package parte_2.programas_poo.proyecto_caja;
import parte_2.programas_poo.proyecto_caja.domain.Caja;

public class Main {
    public static void main(String[] args) {
        Caja caja1 = new Caja(3,6,2);
        int resultado = caja1.calcular_volumen();
        System.out.println("Volumen de la caja = " + resultado);
    }
}
