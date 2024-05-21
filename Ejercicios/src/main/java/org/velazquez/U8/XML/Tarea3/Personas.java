package org.velazquez.U8.XML.Tarea3;

import java.io.Serializable;

public class Personas implements Serializable {
    private String nombre;
    private int edad;


    public Personas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }
}


