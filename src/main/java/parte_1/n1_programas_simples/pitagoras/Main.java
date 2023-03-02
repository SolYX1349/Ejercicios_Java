package parte_1.n1_programas_simples.pitagoras;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inputConsola = new Scanner (System.in);

        System.out.print("Ingresa el cateto a: ");
        double catetoA = inputConsola.nextDouble();

        System.out.print("Ingresa el cateto b: ");
        double catetoB = inputConsola.nextDouble();

        double catetoAelevado = Math.pow(catetoA,2);
        double catetoBelevado = Math.pow(catetoB,2);
        double hipotenusa = catetoAelevado + catetoBelevado;
        double hipotenusaSimplificada = Math.sqrt(catetoAelevado + catetoBelevado );

        System.out.print("C^2 = a^2 + b^2" +
                "\nHipotenusa = " +"("+ catetoA +" x "+ catetoB + ") + " +"("+ catetoB +" x "+ catetoB + ")" +
                "\nHipotenusa = " + catetoAelevado + " + " + catetoBelevado +
                "\nHipotenusa = raiz de " + hipotenusa +
                "\nHipotenusa = " + hipotenusaSimplificada);
    }
}
