package parte_2.programas_poo.tiket_banco;
import parte_2.programas_poo.tiket_banco.dominio.Metodos;
public class Main {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        metodos.ingresarMonto("Carl johnson " , 9241.77);
        metodos.retiroMonto("Carl johnson " , 4100);
    }
}
