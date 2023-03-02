package parte_2.ejercicios_poo_herencia.herencia_multiple.dominio;

import java.util.Date;

public class Persona {
    protected String fecha;
    protected String nombre;
    protected int edad;
    protected char genero;
    protected String direccion;

    public Persona (){}

    public Persona (String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad, char genero, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.fecha = fecha();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    private static String fecha (){
        Date fechas = new Date();
        return String.valueOf(fechas);
    }
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Persona{");
        sb.append(" fecha = ").append(this.fecha);
        sb.append(", nombre = '").append(nombre).append('\'');
        sb.append(", edad = ").append(edad);
        sb.append(", genero = ").append(genero);
        sb.append(", direccion = '").append(direccion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
