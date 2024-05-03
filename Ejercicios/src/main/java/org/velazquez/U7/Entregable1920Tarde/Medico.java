package org.velazquez.U7.Entregable1920Tarde;

import java.io.Serializable;

public class Medico implements Serializable {

    private String nombreMedico;
    private String apellidosMedico;
    private int colegiadoMedico;
    private String hospitalMedico;

    public Medico(String nombreMedico, String apellidosMedico, int colegiadoMedico, String hospitalMedico) {
        this.nombreMedico = nombreMedico;
        this.apellidosMedico = apellidosMedico;
        this.colegiadoMedico = colegiadoMedico;
        this.hospitalMedico = hospitalMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getApellidosMedico() {
        return apellidosMedico;
    }

    public void setApellidosMedico(String apellidosMedico) {
        this.apellidosMedico = apellidosMedico;
    }

    public int getColegiadoMedico() {
        return colegiadoMedico;
    }

    public void setColegiadoMedico(int colegiadoMedico) {
        this.colegiadoMedico = colegiadoMedico;
    }

    public String getHospitalMedico() {
        return hospitalMedico;
    }

    public void setHospitalMedico(String hospitalMedico) {
        this.hospitalMedico = hospitalMedico;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombreMedico='" + nombreMedico + '\'' +
                ", apellidosMedico='" + apellidosMedico + '\'' +
                ", colegiadoMedico=" + colegiadoMedico +
                ", hospitalMedico='" + hospitalMedico + '\'' +
                '}';
    }
}
