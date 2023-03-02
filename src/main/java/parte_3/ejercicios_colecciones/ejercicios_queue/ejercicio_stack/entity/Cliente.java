package parte_3.ejercicios_colecciones.ejercicios_queue.ejercicio_stack.entity;

import java.util.Objects;

public class Cliente {
    private int id;
    private String nombre;
    private String status;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String status) {
        this.id = id;
        this.nombre = nombre;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return getId() == cliente.getId() && Objects.equals(getNombre(), cliente.getNombre()) && Objects.equals(getStatus(), cliente.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getStatus());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
