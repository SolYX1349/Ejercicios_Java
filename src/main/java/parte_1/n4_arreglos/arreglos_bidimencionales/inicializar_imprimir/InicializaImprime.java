package parte_1.n4_arreglos.arreglos_bidimencionales.inicializar_imprimir;

public class InicializaImprime {

    //Codigo base del ejercicio
    public static void main(String[] args) {
        int[][] numeros = new int[2][2];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                System.out.println("numeros [" + i + "][" + j + "]" + " = " + numeros[i][j]);
            }
        }
    }

    //Codigo dirigido al testing
    public static String getAnArrayOfTypeString() {
        StringBuilder sb = new StringBuilder();

        int[][] numeros = new int[2][2];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = i;
                sb.append("\n").append("numeros [").append(i).append("][").append(j).append("]").append(" = ").append(numeros[i][j]);
            }
        }
        return String.valueOf(sb).trim();
    }
}
