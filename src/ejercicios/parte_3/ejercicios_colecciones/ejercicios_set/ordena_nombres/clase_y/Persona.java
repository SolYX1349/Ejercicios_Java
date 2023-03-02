package com.mis_ejercicios.parte_3.ejercicios_colecciones.ejercicios_set.ordena_nombres.clase_y;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
    private int id;
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return getId() == persona.getId() && getEdad() == persona.getEdad() && getNombre().equals(persona.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getEdad());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }

    //@Override
    //public int compareTo(Persona persona) {return this.edad - persona.getEdad();}
    @Override
    public int compareTo(Persona persona) {
        return this.nombre.compareTo(persona.getNombre());
    }
    //@Override
    //public int compareTo(Persona persona) {return this.id - persona.getId();}
}
