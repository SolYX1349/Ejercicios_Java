package com.mis_ejercicios.parte_2.programas_poo.evaluacion.dominio;
import javax.swing.*;

public class MetodosImp {
    private static int respuestaCorrecta = 0;
    private static int respuestaIncorrecta = 0;
    private static int contador = 0;
    private int limite = 10;
    Pregunta preguntas;
    Respuesta respuesta;
    Pregunta [] arregloPreguntas = new Pregunta[limite];
    Respuesta [] arregloRespuestas = new Respuesta[limite];
    public void declararCantidadPreguntas (int limitePreguntas){
        this.limite = limitePreguntas;
    }
    public MetodosImp(){}
    public void crearPreguntasYRespuestas(String pregunta , boolean respuesta){
        ++MetodosImp.contador;
        int x = MetodosImp.contador - 1;
        this.arregloPreguntas[x] = this.preguntas = new Pregunta (pregunta);
        this.arregloRespuestas [x] = this.respuesta = new Respuesta(respuesta);
    }
    public void hacerPregunta (){
        short contador = 1;
        for (int i = 0; i < MetodosImp.contador ; i++) {
            int respuestaNumerica = JOptionPane.showConfirmDialog(null, "Pregunta #" + contador + " : \n" + arregloPreguntas [i].getPregunta());
            boolean respuestaExamen = arregloRespuestas [i].isRespuesta();
            ++contador;
            comprobarRespuestas(respuestaNumerica,respuestaExamen);
        }
    }
    public void comprobarRespuestas (int respuestaConsola , boolean respuestaOriginal){
        boolean respuestaUsuaio;
        if (respuestaConsola == 0){
            respuestaUsuaio = true;
            if (respuestaOriginal == respuestaUsuaio){
                ++respuestaCorrecta;
            }else { ++respuestaIncorrecta; }
        } else if (respuestaConsola == 1) {
            respuestaUsuaio = false;
            if (respuestaOriginal == respuestaUsuaio){
                ++respuestaCorrecta;
            }else { ++respuestaIncorrecta; }
        } else if (respuestaConsola == 2){
           ++respuestaIncorrecta;
        }
    }
    public void imprimirResultado (){
        int mediaPreguntas = limite / 2;
        if ( respuestaCorrecta <= mediaPreguntas ){
            System.out.println("Examen no aprobado.");
            System.out.println("Respuestas buenas = " + respuestaCorrecta +
                    "\nRespuestas incorrectas = " + respuestaIncorrecta);
        }else {
            System.out.println("Examen aprobado");
            System.out.println("Respuestas buenas = " + respuestaCorrecta +
                    "\nRespuestas incorrectas = " + respuestaIncorrecta);
        }

    }
}
