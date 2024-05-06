package org.velazquez.Ligero_Picon_U6U7_Examen;

import java.io.Serializable;

public class Caseta implements Serializable {

    private String nombreCaseta;
    private String ubicacionCaseta;
    private int tamanioCaseta;
    private int idCaseta;
    private static int idCasetaIncrementa = 1;

    public Caseta(String nombreCaseta, String ubicacionCaseta, int tamanioCaseta) {
        this.idCaseta = idCasetaIncrementa++;
        this.nombreCaseta = nombreCaseta;
        this.ubicacionCaseta = ubicacionCaseta;
        this.tamanioCaseta = tamanioCaseta;
    }

    public String getNombreCaseta() {
        return nombreCaseta;
    }

    public void setNombreCaseta(String nombreCaseta) {
        this.nombreCaseta = nombreCaseta;
    }

    public String getUbicacionCaseta() {
        return ubicacionCaseta;
    }

    public void setUbicacionCaseta(String ubicacionCaseta) {
        this.ubicacionCaseta = ubicacionCaseta;
    }

    public int getTamanioCaseta() {
        return tamanioCaseta;
    }

    public void setTamanioCaseta(int tamanioCaseta) {
        this.tamanioCaseta = tamanioCaseta;
    }

    public int getIdCaseta() {
        return idCaseta;
    }

    public void setIdCaseta(int idCaseta) {
        this.idCaseta = idCaseta;
    }

    @Override
    public String toString() {
        return "Caseta{" +
                "nombreCaseta='" + nombreCaseta + '\'' +
                ", ubicacionCaseta='" + ubicacionCaseta + '\'' +
                ", tamanioCaseta=" + tamanioCaseta +
                ", idCaseta=" + idCaseta +
                '}';
    }
}
