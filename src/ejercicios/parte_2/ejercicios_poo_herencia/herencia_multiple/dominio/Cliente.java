package com.mis_ejercicios.parte_2.ejercicios_poo_herencia.herencia_multiple.dominio;

import java.util.Date;

public class Cliente extends Persona{
    private static int contadorCliente;
    private int idCliente;
    private boolean vip;

    public Cliente(){}
    public Cliente(String nombre,boolean isVip){
        super(nombre);
        this.vip = isVip;
        this.idCliente = ++Cliente.contadorCliente;
        this.fecha = fecha();
    }
    private static String fecha (){
        Date fechas = new Date();
        return String.valueOf(fechas);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append(" fecha = ").append(this.fecha);
        sb.append(" idCliente = ").append(idCliente);
        sb.append(", vip = ").append(vip);
        sb.append(", nombre = '").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
