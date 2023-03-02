package parte_2.ejercicios_poo_herencia.herencia_multiple.dominio;

import java.util.Date;

public class Empleado extends Persona{
    private double sueldo;
    private int idEmpleado;
    private static int contadorEmpleado;
    public Empleado (){}
    public Empleado (String nombre , double sueldo){
        super(nombre);
        this.sueldo = sueldo;
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.fecha = fecha();
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    private static String fecha (){
        Date fechas = new Date();
        return String.valueOf(fechas);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empleado{");
        sb.append(" fecha = ").append(this.fecha);
        sb.append(", sueldo = ").append(sueldo);
        sb.append(", idEmpleado = ").append(idEmpleado);
        sb.append(", nombre = ").append(this.nombre);
        sb.append('}');
        return sb.toString();
    }
}
