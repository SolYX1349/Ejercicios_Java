package parte_2.programas_poo.almacen_y_verduleria.domain;

public class Lacteo extends Producto{
    private int cantidad;
    private int proteinas;
    public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(super.toString());
        sb.append(", cantidad = ").append(this.cantidad);
        sb.append(", proteinas = ").append(this.proteinas);
        return sb.toString();
    }
}
