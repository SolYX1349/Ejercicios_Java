package parte_2.ejercicios_poo_herencia.escuela.domain;

public class Profesor extends Persona{
    private char genero;

    public Profesor(String nombre, String apellido, int edad, char genero) {
        super(nombre, apellido, edad);
        this.genero = genero;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(super.toString());
        sb.append("Profesor{");
        sb.append("genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }
}
