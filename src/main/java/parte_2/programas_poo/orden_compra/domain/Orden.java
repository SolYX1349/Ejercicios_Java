package parte_2.programas_poo.orden_compra.domain;

import java.util.*;
public class Orden {
    private int ordenCompra;
    private static int contadorClientes;
    private Cliente cliente;
    private List<Producto> productos = new ArrayList<>();
    private String orden;
    private String fecha;
    public Orden() {
    }
    public void nombreOrden(String orden){
        this.orden = orden;
    }
    public void nuevoCliente (String nombreCliente , String apellido){
        cliente = new Cliente(nombreCliente , apellido);
        this.ordenCompra = ++Orden.contadorClientes;
        fecha = detectarHoras() + " " + detectarDia() + " " + detectarMes() + " " + detectarAnio();
    }
    public void agregarProducto (Producto producto){
        productos.add(producto);
    }
    public void showOrden(){
        System.out.println(this.orden + " #" + this.ordenCompra + "\n" + cliente + "\n" + fecha);
        productos.forEach(producto ->System.out.println(producto));
    }
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
        String cadena = horaCadena + "-"+ minutoCadena + "-"+ segundoCadena;
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
}
