package parte_2.ejercicios_poo_herencia.persona_de_una_compania.domain;

public class Gerente extends Empleado{
    private double presupuesto;
    public Gerente(double presupuesto, int empleadoId, double remuneracion, String numeroFiscal, String nombre, String apellido, String direccion) {
        super(empleadoId, remuneracion, numeroFiscal, nombre, apellido, direccion);
        this.presupuesto = presupuesto;
    }
    public double getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    @Override
    public String toString() {
        return "presupuesto=" + presupuesto + ", " + super.toString();
    }
}
