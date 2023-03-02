package parte_2.programas_poo.orden_compra.domain;

import java.util.Objects;

public class Producto {
    private String fabricante;
    private String nombre;
    private double precio;
    public Producto() {
    }
    public Producto(String fabricante, String nombre, double precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("fabricante='").append(fabricante).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return Double.compare(producto.getPrecio(), getPrecio()) == 0 && Objects.equals(getFabricante(), producto.getFabricante()) && Objects.equals(getNombre(), producto.getNombre());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getFabricante(), getNombre(), getPrecio());
    }
}
