package parte_1.n4_patrones_comunes.ventas_y_facturas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        double kilosTotal = 0,sumaTotal = 0 , precioProducto = 35;
        int idFactura = 0 , numeroCompraSuperada = 0;

        while (idFactura < 2){
            idFactura++;
            System.out.print("Factura N# " + idFactura +"\nCuantos kilos compras: " );
            double kilos = inputScanner.nextDouble();

            double resultado = kilos * precioProducto;
            sumaTotal = resultado + sumaTotal;
            kilosTotal = kilosTotal + kilos;

            System.out.println("Total = " + resultado + "\n");
            if (resultado >= 500){
                numeroCompraSuperada++;
            }

        }
        System.out.println("Se emitieron " + idFactura + " Facturas"
                        + "\nSe compraron "+ kilosTotal +" Kilos de azucar"
                        + "\nSu total de compra es $"+ sumaTotal
                        + "\nHubieron " + numeroCompraSuperada + " facturas que superaron los $ 500 de compra.");

    }
}
