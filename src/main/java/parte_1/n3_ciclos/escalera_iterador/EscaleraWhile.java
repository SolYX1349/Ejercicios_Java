package parte_1.n3_ciclos.escalera_iterador;

public class EscaleraWhile {
    public static void main(String[] args) {
        int numeroAparente = 1, longitudEscalera = 25, j = 0, x = 1;

        while (numeroAparente <= longitudEscalera) {
            System.out.print(1);

            while (j < numeroAparente) {
                if (j >= 1) {
                    x++;
                    System.out.print(x);
                }
                j++;
            }
            j = 0;
            x = 1;
            numeroAparente++;
            System.out.println();
        }
    }

    public static String escaleraWhile(int longitud) {
        StringBuilder sb = new StringBuilder();
        int columnas = 1, filas = 0, x = 1;

        while (columnas <= longitud) {
            sb.append(x);

            while (filas < columnas) {
                if (filas >= 1) sb.append(++x);
                filas++;
            }
            filas = 0;
            x = 1;
            columnas++;
            sb.append("\n");
        }
        return String.valueOf(sb).trim();
    }
}
