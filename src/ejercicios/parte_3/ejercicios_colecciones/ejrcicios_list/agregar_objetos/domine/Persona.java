package com.mis_ejercicios.parte_3.ejercicios_colecciones.ejrcicios_list.agregar_objetos.domine;

import java.io.Serializable;
import java.util.Objects;

public class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private int edad;
    public Persona(){}
    public Persona(String nombre , String apellido , int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("nombre ='").append(this.nombre).append('\'');
        sb.append(", apellido ='").append(this.apellido).append('\'');
        sb.append(", edad =").append(this.edad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return getEdad() == persona.getEdad() && Objects.equals(getNombre(), persona.getNombre()) && Objects.equals(getApellido(), persona.getApellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApellido(), getEdad());
    }
}
