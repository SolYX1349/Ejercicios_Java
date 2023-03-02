package parte_2.ejercicios_poo_herencia.escuela.domain;

public class Alumno extends Persona{
    private int materias;

    public Alumno(String nombre, String apellido, int edad, int materias) {
        super(nombre, apellido, edad);
        this.materias = materias;
    }

    public int getMaterias() {
        return materias;
    }

    public void setMaterias(int materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(super.toString());
        sb.append(", Alumno{");
        sb.append(" materias=").append(materias);
        sb.append('}');
        return sb.toString();
    }
}
