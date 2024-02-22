package org.velazquez.U5.EntregableU4U52021M;

public abstract class FlotaVehiculos {
    private String matricula;
    private int cargaMaxima;
    private String conductor;

    public FlotaVehiculos(String matricula, int cargaMaxima, String conductor) {
        this.matricula = matricula;
        this.cargaMaxima = cargaMaxima;
        this.conductor = conductor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public abstract void descargar();
}
