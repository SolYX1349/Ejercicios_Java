package parte_2.programas_poo.tiket_banco.dominio;
import java.util.Calendar;
public class Metodos {
    public Metodos(){}
    public int detectarDia(){
        Calendar fechas = Calendar.getInstance();
        int dia = fechas.get(Calendar.DATE);
        return dia;
    }
    public int detectarAnio(){
        Calendar fechas = Calendar.getInstance();
        int anio = fechas.get(Calendar.YEAR);
        return anio;
    }
    public String detectarHoras(){
        Calendar fechas = Calendar.getInstance();
        int horaNumerico = fechas.get(Calendar.HOUR);
        int minutoNumerico = fechas.get(Calendar.MINUTE);
        int segundoNumerico = fechas.get(Calendar.SECOND);
        String horaCadena = String.valueOf(horaNumerico);
        String minutoCadena = String.valueOf(minutoNumerico);
        String segundoCadena = String.valueOf(segundoNumerico);
        String cadena = horaCadena + ":"+ minutoCadena + ":"+ segundoCadena;
        return cadena;
    }
    public String detectarMes(){
        Calendar fechas = Calendar.getInstance();
        String mesSalida = null;
        int arg = fechas.get(Calendar.MONTH);
        switch (arg){
            case 0:
                mesSalida = "Enero";
                break;
            case 1:
                mesSalida = "Febrero";
                break;
            case 2:
                mesSalida = "Marzo";
                break;
            case 3:
                mesSalida = "Abril";
                break;
            case 4:
                mesSalida = "Mayo";
                break;
            case 5:
                mesSalida = "Junio";
                break;
            case 6:
                mesSalida = "Julio";
                break;
            case 7:
                mesSalida = "Agosto";
                break;
            case 8:
                mesSalida = "Septiembre";
                break;
            case 9:
                mesSalida = "Octubre";
                break;
            case 10:
                mesSalida = "Noviembre";
                break;
            case 11:
                mesSalida = "Diciembre";
                break;
            default:
                System.out.println("Error en la mes_salida.");
        }
        return mesSalida;
    }
    public void ingresarMonto(String nombre , double monto){
        System.out.println( "       Abono       ");
        System.out.println("     $ " + monto);
        System.out.println(detectarDia() +" "+ detectarMes() +" "+ detectarAnio() +","+ detectarHoras() + " h");
        System.out.println("Detalles de Movimiento");
        System.out.println("Tipo de Movimiento" + "\nAbono");
        System.out.println("Deposito de " + nombre);
    }
    public void retiroMonto(String nombre , double monto){
        System.out.println( "       Retiro       ");
        System.out.println("     $ " + monto);
        System.out.println(detectarDia() +" "+ detectarMes() +" "+ detectarAnio() +","+ detectarHoras() + " h");
        System.out.println("Detalles de Movimiento");
        System.out.println("Tipo de Movimiento" + "\nRetiro");
        System.out.println("Retiro de " + nombre);
    }
}
