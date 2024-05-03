package org.velazquez.U7.Entregable1920Tarde;

import java.io.Serializable;

public class Paciente implements Serializable {

    private String nombrePaciente;
    private int edadPaciente;
    private double pesoPaciente;
    private boolean vacunasPaciente;
    private Medico medicoPaciente;
    private int cepaPaciente;
    private int incrementaCepaPaciente = 1;

    public Paciente(String nombrePaciente, int edadPaciente, double pesoPaciente, boolean vacunasPaciente, Medico medicoPaciente) {
        this.nombrePaciente = nombrePaciente;
        this.edadPaciente = edadPaciente;
        this.pesoPaciente = pesoPaciente;
        this.vacunasPaciente = vacunasPaciente;
        this.medicoPaciente = medicoPaciente;
        this.cepaPaciente = incrementaCepaPaciente++;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getEdadPaciente() {
        return edadPaciente;
    }

    public void setEdadPaciente(int edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    public double getPesoPaciente() {
        return pesoPaciente;
    }

    public void setPesoPaciente(double pesoPaciente) {
        this.pesoPaciente = pesoPaciente;
    }

    public boolean isVacunasPaciente() {
        return vacunasPaciente;
    }

    public void setVacunasPaciente(boolean vacunasPaciente) {
        this.vacunasPaciente = vacunasPaciente;
    }

    public Medico getMedicoPaciente() {
        return medicoPaciente;
    }

    public void setMedicoPaciente(Medico medicoPaciente) {
        this.medicoPaciente = medicoPaciente;
    }

    public int getCepaPaciente() {
        return cepaPaciente;
    }

    public void setCepaPaciente(int cepaPaciente) {
        this.cepaPaciente = cepaPaciente;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombrePaciente='" + nombrePaciente + '\'' +
                ", edadPaciente=" + edadPaciente +
                ", pesoPaciente=" + pesoPaciente +
                ", vacunasPaciente=" + vacunasPaciente +
                ", medicoPaciente=" + medicoPaciente +
                ", cepaPaciente=" + cepaPaciente +
                '}';
    }
}
