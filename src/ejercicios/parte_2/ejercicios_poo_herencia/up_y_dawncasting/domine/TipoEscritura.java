package com.mis_ejercicios.parte_2.ejercicios_poo_herencia.up_y_dawncasting.domine;

public enum TipoEscritura {
    CLASICA("Escritura a mano"),
    MODERNA("Escritura en computadora");
    private final String descripcion;
    private TipoEscritura(String tipoEscritura) {
        this.descripcion = tipoEscritura;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
