package parte_1.n3_ciclos.escalera_iterador;

public class EscaleraDoWhile {
    public static void main(String[] args) {
        int numeroAparente = 1 , longitudEscalera = 26 , j = 0 , x = 1;

        do {
            System.out.print(1);

            do {
                if (j >= 1){
                    x++;
                    System.out.print(x);
                }
                j++;
            }while (j < numeroAparente);

            System.out.println();
            j = 0; x = 1; numeroAparente++;
        }while (numeroAparente <= longitudEscalera);
    }
}
