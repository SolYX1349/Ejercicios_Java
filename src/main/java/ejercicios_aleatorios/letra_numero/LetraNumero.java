package ejercicios_aleatorios.letra_numero;
import java.util.Scanner;
public class LetraNumero {

    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("V: ");
        String valorConsola = inputScanner.nextLine();
        letraOnumero(valorConsola);

    }
    private static void letraOnumero (String arg1){

            String convercionAUnCaracter = arg1.substring(0,1);
            boolean evaluationSimbolica = true;

            for (int i = 0; i < 9; i++) {
                String x = String.valueOf(i);
                if (convercionAUnCaracter.equalsIgnoreCase(x)) {
                    evaluationSimbolica = false;
                    break;}
            }
            if (evaluationSimbolica){
                int longitudCadena = arg1.length();
                if (longitudCadena == 1){
                    System.out.println("Es letra");
                }else {System.out.println("Es palabra");}
            }else{System.out.println("Es numero");}
    }
}
