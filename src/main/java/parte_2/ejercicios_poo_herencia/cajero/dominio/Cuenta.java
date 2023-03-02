package parte_2.ejercicios_poo_herencia.cajero.dominio;

public class Cuenta extends Usuario{
    private short numero_cuenta;
    private static double ingresos;

    public Cuenta(){}

    public Cuenta(String nombre , String apellido , short numeroCuenta ){
        super(nombre, apellido);
        this.numero_cuenta = numeroCuenta;
    }
    public static double getIngresos() {
        return ingresos;
    }
    public static void setIngresos(double ingresos) {
        Cuenta.ingresos = ingresos;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cuenta{");
        sb.append("numeroCuenta=").append(numero_cuenta);
        sb.append('}');
        return sb.toString();
    }
}
