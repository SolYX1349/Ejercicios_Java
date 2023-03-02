package parte_2.ejercicios_poo_herencia.persona_de_una_compania.domain;

public class Cliente extends Persona{
    private int clienteId;
    public Cliente(int clienteId, String numeroFiscal, String nombre, String apellido, String direccion) {
        super(numeroFiscal, nombre, apellido, direccion);
        this.clienteId = clienteId;
    }
    @Override
    public String toString() {
        return "clienteId=" + clienteId + ", " + super.toString();
    }
}
