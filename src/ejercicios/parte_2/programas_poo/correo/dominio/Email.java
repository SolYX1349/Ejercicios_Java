package com.mis_ejercicios.parte_2.programas_poo.correo.dominio;

public class Email {

    private String correo;

    public Email(){}

    public Email(String email){
        this.correo = email;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

}
