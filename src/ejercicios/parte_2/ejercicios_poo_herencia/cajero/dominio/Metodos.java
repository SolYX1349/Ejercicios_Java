package com.mis_ejercicios.parte_2.ejercicios_poo_herencia.cajero.dominio;
public class Metodos {
    public Metodos(){}
    public static void depositoCuenta(Cuenta cuenta , double cantidadDeposito){
        double ingresos = Cuenta.getIngresos();
        double cantidadDepositada = ingresos + cantidadDeposito ;
        Cuenta.setIngresos(cantidadDepositada);
        ingresos = Cuenta.getIngresos();
        System.out.println("Ingresos depocitados \n saldo = $"+ ingresos);
    }
    public static void retiroCuenta(Cuenta cuenta , double cantidadRetiro){
        double ingresos = Cuenta.getIngresos();
        if (cantidadRetiro <= ingresos && cantidadRetiro > 0 ){
            double cantidadRetirada = ingresos - cantidadRetiro ;
            Cuenta.setIngresos(cantidadRetirada);
            ingresos = Cuenta.getIngresos();
            System.out.println("Ingreso retirado \n saldo = $"+ ingresos);
        }else {
            System.out.println("Tu retiro supera la cantidad que tienes \n saldo actual = $" + ingresos);
        }
    }
}
