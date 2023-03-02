package parte_1.n3_ciclos.tabla_de_multiplicar;

public class Main {
    public static void main(String[] args) {
        tablasDeMultiplicar();
    }
    public static void tablasDeMultiplicar(){
        int numerador = 0, multiplo = 1 , salidaResultado , entero = 10;

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
}
