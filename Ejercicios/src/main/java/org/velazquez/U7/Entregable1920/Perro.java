package org.velazquez.U7.Entregable1920;

import java.io.Serializable;

public class Perro implements Serializable {

    private String nombrePerro;
    private int edadPerro;
    private double pesoPerro;
    private boolean vacunadoPerro;
    private Propietario propietarioPerro;
    private String razaPerro;

    public Perro(String nombrePerro, int edadPerro, double pesoPerro, boolean vacunadoPerro, Propietario propietarioPerro, String razaPerro) {
        this.nombrePerro = nombrePerro;
        this.edadPerro = edadPerro;
        this.pesoPerro = pesoPerro;
        this.vacunadoPerro = vacunadoPerro;
        this.propietarioPerro = propietarioPerro;
        this.razaPerro = razaPerro;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public int getEdadPerro() {
        return edadPerro;
    }

    public void setEdadPerro(int edadPerro) {
        this.edadPerro = edadPerro;
    }

    public double getPesoPerro() {
        return pesoPerro;
    }

    public void setPesoPerro(double pesoPerro) {
        this.pesoPerro = pesoPerro;
    }

    public boolean isVacunadoPerro() {
        return vacunadoPerro;
    }

    public void setVacunadoPerro(boolean vacunadoPerro) {
        this.vacunadoPerro = vacunadoPerro;
    }

    public Propietario getPropietarioPerro() {
        return propietarioPerro;
    }

    public void setPropietarioPerro(Propietario propietarioPerro) {
        this.propietarioPerro = propietarioPerro;
    }

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombrePerro='" + nombrePerro + '\'' +
                ", edadPerro=" + edadPerro +
                ", pesoPerro=" + pesoPerro +
                ", vacunadoPerro=" + vacunadoPerro +
                ", propietarioPerro=" + propietarioPerro +
                ", razaPerro='" + razaPerro + '\'' +
                '}';
    }
}
