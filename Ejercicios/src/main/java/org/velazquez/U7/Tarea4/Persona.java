package org.velazquez.U7.Tarea4;

import java.io.Serializable;

public class Persona implements Serializable {

    // Definición de atributos de la clase Persona
    private String nombrePersona;
    private String dniPersona;
    private int edadPersona;
    private double estaturaPersona;

    // Creación del constructor para crear objetos de tipo Persona
    public Persona(String nombrePersona, String dniPersona, int edadPersona, double estaturaPersona) {
        this.nombrePersona = nombrePersona;
        this.dniPersona = dniPersona;
        this.edadPersona = edadPersona;
        this.estaturaPersona = estaturaPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getDniPersona() {
        return dniPersona;
    }

    public void setDniPersona(String dniPersona) {
        this.dniPersona = dniPersona;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    public double getEstaturaPersona() {
        return estaturaPersona;
    }

    public void setEstaturaPersona(double estaturaPersona) {
        this.estaturaPersona = estaturaPersona;
    }

    // Creación del método toString() para mostrar por pantalla los datos de los atributos dela clase Persona
    @Override
    public String toString() {
        return  ", Nombre: " + nombrePersona +
                ", DNI: " + dniPersona +
                ", Edad: " + edadPersona + " años" +
                ", Estatura: " + estaturaPersona + " metros" +'\n';
    }
}
