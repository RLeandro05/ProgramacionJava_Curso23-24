package org.velazquez.U7.Entregable1920;

import java.io.Serializable;

public class Propietario implements Serializable {

    private String nombrePropietario;
    private String apellidosPropietario;
    private int numSocioPropietario;
    private String paisPropietario;

    public Propietario(String nombrePropietario, String apellidosPropietario, int numSocioPropietario, String paisPropietario) {
        this.nombrePropietario = nombrePropietario;
        this.apellidosPropietario = apellidosPropietario;
        this.numSocioPropietario = numSocioPropietario;
        this.paisPropietario = paisPropietario;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getApellidosPropietario() {
        return apellidosPropietario;
    }

    public void setApellidosPropietario(String apellidosPropietario) {
        this.apellidosPropietario = apellidosPropietario;
    }

    public int getNumSocioPropietario() {
        return numSocioPropietario;
    }

    public void setNumSocioPropietario(int numSocioPropietario) {
        this.numSocioPropietario = numSocioPropietario;
    }

    public String getPaisPropietario() {
        return paisPropietario;
    }

    public void setPaisPropietario(String paisPropietario) {
        this.paisPropietario = paisPropietario;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombrePropietario='" + nombrePropietario + '\'' +
                ", apellidosPropietario='" + apellidosPropietario + '\'' +
                ", numSocioPropietario=" + numSocioPropietario +
                ", paisPropietario='" + paisPropietario + '\'' +
                '}';
    }
}
