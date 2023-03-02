package parte_2.ejercicios_poo_herencia.polimorfismo.clases;

public class Empleado {
    private String nombre;
    private double sueldo;
    public Empleado (){}
    public Empleado (String nombre , double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public String obtenerDetalles (){
        return ("Nombre : " + this.nombre + " , sueldo : " + this.sueldo);
    }
}
