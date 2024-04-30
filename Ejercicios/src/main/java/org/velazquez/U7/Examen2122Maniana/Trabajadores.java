package org.velazquez.U7.Examen2122Maniana;

import java.io.Serializable;

public class Trabajadores implements Serializable {
    
    private String dniTrabajador;
    private String nombreTrabajador;
    private String apellidosTrabajador;
    private int edadTrabajador;
    private String formacionTrabajador;

    public Trabajadores(String dniTrabajador, String nombreTrabajador, String apellidosTrabajdor, int edadTrabajador, String formacionTrabajador) {
        this.dniTrabajador = dniTrabajador;
        this.nombreTrabajador = nombreTrabajador;
        this.apellidosTrabajador = apellidosTrabajdor;
        this.edadTrabajador = edadTrabajador;
        this.formacionTrabajador = formacionTrabajador;
    }

    public String getDniTrabajador() {
        return dniTrabajador;
    }

    public void setDniTrabajador(String dniTrabajador) {
        this.dniTrabajador = dniTrabajador;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public String getApellidosTrabajador() {
        return apellidosTrabajador;
    }

    public void setApellidosTrabajador(String apellidosTrabajador) {
        this.apellidosTrabajador = apellidosTrabajador;
    }

    public int getEdadTrabajador() {
        return edadTrabajador;
    }

    public void setEdadTrabajador(int edadTrabajador) {
        this.edadTrabajador = edadTrabajador;
    }

    public String getFormacionTrabajador() {
        return formacionTrabajador;
    }

    public void setFormacionTrabajador(String formacionTrabajador) {
        this.formacionTrabajador = formacionTrabajador;
    }

    @Override
    public String toString() {
        return "Trabajadores{" +
                "dniTrabajador='" + dniTrabajador + '\'' +
                ", nombreTrabajador='" + nombreTrabajador + '\'' +
                ", apellidosTrabajdor='" + apellidosTrabajador + '\'' +
                ", edadTrabajador=" + edadTrabajador +
                ", formacionTrabajador='" + formacionTrabajador + '\'' +
                '}';
    }
}
