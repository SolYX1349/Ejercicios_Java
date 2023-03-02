package parte_1.n3_ciclos.escalera_iterador;

public class EscaleraWhile {
    public static void main(String[] args) {
        int numeroAparente = 1 , longitudEscalera = 25 , j = 0 , x = 1;

        while (numeroAparente <= longitudEscalera){
            System.out.print(1);

            while (j < numeroAparente){
                if (j >= 1){
                    x ++;
                    System.out.print(x);
                }
                j++;
            }
            j = 0; x = 1; numeroAparente++;
            System.out.println();
        }
    }
}
