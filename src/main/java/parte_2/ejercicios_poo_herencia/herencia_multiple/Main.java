package parte_2.ejercicios_poo_herencia.herencia_multiple;
import parte_2.ejercicios_poo_herencia.herencia_multiple.dominio.*;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Sonia" , 1200);
        Cliente cliente = new Cliente("Sonia" , true);
        Persona persona = new Persona("sonia",45,'f',"Linces #4415");
        System.out.println(cliente);
        System.out.println(empleado);
        System.out.println(persona);
    }
}
