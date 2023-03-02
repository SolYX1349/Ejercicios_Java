package parte_2.programas_poo.almacen_y_verduleria.domain;

public class Limpieza extends Producto{
    private String componetes;
    private double litros;
    public Limpieza(String nombre, double precio, String componetes, double litros) {
        super(nombre, precio);
        this.componetes = componetes;
        this.litros = litros;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(super.toString());
        sb.append(", componetes = ").append(this.componetes);
        sb.append(", litros = ").append(this.litros);
        return sb.toString();
    }
}
