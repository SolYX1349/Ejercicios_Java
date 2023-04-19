package parte_1.n3_ciclos.lanzar_dados;

public class LanzarDados {

    //Codigo base del ejercicio
    public static void main(String[] args) {
        for (int numeroCol = 1; numeroCol <= 6 ; numeroCol++) {
            System.out.println("Conjunto #" + numeroCol );
            for (int numeroFil = 1; numeroFil <= 6 ; numeroFil++) {
                System.out.println(numeroCol +""+ numeroFil);
            }
        }
    }

    //Codigo dirigido al testing
    public static String getPosiblesDado(){
        StringBuilder sb = new StringBuilder();
        for (int numeroCol = 1; numeroCol <= 6 ; numeroCol++) {
            sb.append("Conjunto #").append(numeroCol).append("\n");
            for (int numeroFil = 1; numeroFil <= 6 ; numeroFil++) {
                sb.append(numeroCol).append("-").append(numeroFil).append("\n");
            }
        }
        return String.valueOf(sb).trim();
    }
}
