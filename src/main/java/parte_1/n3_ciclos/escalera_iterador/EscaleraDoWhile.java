package parte_1.n3_ciclos.escalera_iterador;

public class EscaleraDoWhile {
    public static void main(String[] args) {
        int numeroAparente = 1, longitudEscalera = 26, j = 0, x = 1;

        do {
            System.out.print(1);

            do {
                if (j >= 1) {
                    x++;
                    System.out.print(x);
                }
                j++;
            } while (j < numeroAparente);

            System.out.println();
            j = 0;
            x = 1;
            numeroAparente++;
        } while (numeroAparente <= longitudEscalera);
    }

    public static String escaleraDoWhile(int longitud) {
        StringBuilder sb = new StringBuilder();
        int columnas = 1, filas = 0, x = 1;

        do {
            sb.append(x);
            do {
                if (filas >= 1) sb.append(++x);
                filas++;
            } while (filas < columnas);

            sb.append("\n");
            filas = 0;
            x = 1;
            columnas++;
        } while (columnas <= longitud);

        return String.valueOf(sb).trim();
    }
}
