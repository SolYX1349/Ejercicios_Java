package parte_1.n3_ciclos.tabla_de_multiplicar;

public class TablaDeMultiplicar {

    //Codigo base del ejercicio
    public static void main(String[] args) {
        int numerador = 0, multiplo = 1 , salidaResultado = 0 , entero = 10;

        for (int i = 1; i <= 100 ; i++ ) {
            numerador++;
            salidaResultado = numerador * multiplo;
            System.out.print(salidaResultado + "  ");

            if (numerador == entero){
                System.out.println();
                numerador = 0;
                multiplo++;
            }
        }
    }

    //Codigo dirigido al test
    public static String getMultiplicationTable(){
        StringBuilder sb = new StringBuilder();
        int numerador = 0, multiplo = 1;

        for (int i = 1; i <= 100 ; i++ ) {
            int salidaResultado = ++numerador * multiplo;
            sb.append(salidaResultado).append("  ");

            if (numerador == 10){
                sb.append("\n");
                numerador = 0;
                multiplo++;
            }
        }
        return String.valueOf(sb).trim();
    }
}
