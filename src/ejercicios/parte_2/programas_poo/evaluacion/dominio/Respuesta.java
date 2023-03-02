package com.mis_ejercicios.parte_2.programas_poo.evaluacion.dominio;

public class Respuesta {
    private boolean respuesta;
    private String respuestaStr;

    public Respuesta(){}

    public Respuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    public Respuesta(String respuestaStr) {
        this.respuestaStr = respuestaStr;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    public String getRespuestaStr() {
        return respuestaStr;
    }

    public void setRespuestaStr(String respuestaStr) {
        this.respuestaStr = respuestaStr;
    }
}
