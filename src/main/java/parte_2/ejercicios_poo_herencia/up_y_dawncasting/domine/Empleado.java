package parte_2.ejercicios_poo_herencia.up_y_dawncasting.domine;

public class Empleado {
    private double sueldo;
    private String nombre;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public String mostrarDetalles (){
        return "Nombre : " + this.nombre + " Sueldo : " + this.sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
