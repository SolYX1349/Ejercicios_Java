package parte_2.ejercicios_poo_herencia.up_y_dawncasting.domine;

public class Escritor extends Empleado {
    final TipoEscritura tipoEscritura;
    public Escritor(String nombre , double sueldo , TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    @Override
    public String mostrarDetalles (){
        return super.mostrarDetalles() + " Tipo escritura : " + this.tipoEscritura;
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
}
