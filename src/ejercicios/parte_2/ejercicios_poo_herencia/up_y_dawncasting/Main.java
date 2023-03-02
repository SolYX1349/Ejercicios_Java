package com.mis_ejercicios.parte_2.ejercicios_poo_herencia.up_y_dawncasting;
import com.mis_ejercicios.parte_2.ejercicios_poo_herencia.up_y_dawncasting.domine.Empleado;
import com.mis_ejercicios.parte_2.ejercicios_poo_herencia.up_y_dawncasting.domine.Escritor;
import com.mis_ejercicios.parte_2.ejercicios_poo_herencia.up_y_dawncasting.domine.Gerente;
import com.mis_ejercicios.parte_2.ejercicios_poo_herencia.up_y_dawncasting.domine.TipoEscritura;

public class Main {
    public static void main(String[] args) {
        Empleado empleado;

        empleado = new Escritor("Octavio" , 2200 , TipoEscritura.MODERNA);
        imprimirInformacion(empleado);

//      empleado.getTipoEscritura();   El empleado no puede acceder a getTipoEscritura.
//      Dawncasting
//      ((Escritor)empleado).getTipoEscritura();        Casting option 1 y ya se puede acceder a getTipoEscritura
        Escritor escritor2 = (Escritor) empleado;     //Casting option 2
        escritor2.getTipoEscritura();                 //Ya se puede acceder a getTipoEscritura

//      Upcasting
        Empleado empleado2 = escritor2;                // Su conversion es mas facil hacia arriba
        System.out.println(empleado2.mostrarDetalles());

        empleado = new Empleado("Salumon" , 1200);
        imprimirInformacion(empleado);
        empleado = new Gerente("Pascual",1400,"Tecnologias");
        imprimirInformacion(empleado);

    }
    private static void imprimirInformacion(Empleado empleado){
        System.out.println(empleado.mostrarDetalles());
    }
}
